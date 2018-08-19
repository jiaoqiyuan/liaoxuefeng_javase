package eleven_Thread.sixteen_ConcurrentCompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Supplier;

class StockPrice {
	final float price;
	final String from;

	StockPrice(float price, String from) {
		this.price = price;
		this.from = from;
	}

	public String toString() {
		return "Price: " + price + " from " + from;
	}
}

class StockFromSina implements Supplier<StockPrice> {

	@Override
	public StockPrice get() {
		String url = "http://hq.sinajs.cn/list=sh000001";
		System.out.println("GET: " + url);
		try {
			String result = DownloadUtil.download(url);
			String[] ss = result.split(",");
			return new StockPrice(Float.parseFloat(ss[3]), "sina");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}

class StockFromNetease implements Supplier<StockPrice> {

	@Override
	public StockPrice get() {
		String url = "http://api.money.126.net/data/feed/0000001,money.api";
		System.out.println("GET: " + url);
		try {
			String result = DownloadUtil.download(url);
			int priceIndex = result.indexOf("\"price\"");
			int start = result.indexOf(":", priceIndex);
			int end = result.indexOf(",", priceIndex);
			return new StockPrice(Float.parseFloat(result.substring(start + 1, end)), "netease");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}

public class CompletableFutureAnyOfSample {

	public static void main(String[] args) throws Exception {
		CompletableFuture<StockPrice> getStockFromSina = CompletableFuture.supplyAsync(new StockFromSina());
		CompletableFuture<StockPrice> getStockFromNetease = CompletableFuture.supplyAsync(new StockFromNetease());
		CompletableFuture<Object> getStock = CompletableFuture.anyOf(getStockFromSina, getStockFromNetease);
		getStock.thenAccept(new Consumer<Object>() {
			public void accept(Object result) {
				System.out.println("Reuslt: " + result);
			}
		});
		getStock.join();
	}

}
