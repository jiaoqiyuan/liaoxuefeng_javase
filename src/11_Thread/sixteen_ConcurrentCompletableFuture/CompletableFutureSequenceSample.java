package eleven_Thread.sixteen_ConcurrentCompletableFuture;

import java.net.URLEncoder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

class Price {
	final String code;
	final float price;

	Price(String code, float price) {
		this.code = code;
		this.price = price;
	}
}

class StockLookupSupplier implements Supplier<String> {
	String name;

	public StockLookupSupplier(String name) {
		this.name = name;
	}

	public String get() {
		System.out.println("lookup: " + name);
		try {
			String url = "http://suggest3.sinajs.cn/suggest/type=11,12&key=" + URLEncoder.encode(name, "UTF-8");
			String result = DownloadUtil.download(url);
			String[] ss = result.split(",");
			return ss[3];
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}

public class CompletableFutureSequenceSample {

	public static void main(String[] args) throws Exception {
		String name = "上证指数";
		CompletableFuture<String> getStockCodeFuture = CompletableFuture.supplyAsync(new StockLookupSupplier(name));
		CompletableFuture<Price> getStockPriceFuture = getStockCodeFuture.thenApplyAsync(new Function<String, Price>() {
			public Price apply(String code) {
				System.out.println("got code: " + code);
				try {
					String url = "http://hq.sinajs.cn/list=" + code;
					String result = DownloadUtil.download(url);
					String[] ss = result.split(",");
					return new Price(code, Float.parseFloat(ss[3]));
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
			}
		});
		getStockPriceFuture.thenAccept(new Consumer<Price>() {
			public void accept(Price p) {
				System.out.println("hhh");
				System.out.println(p.code + ": " + p.price);
			}
		});
		getStockPriceFuture.join();
	}

}
