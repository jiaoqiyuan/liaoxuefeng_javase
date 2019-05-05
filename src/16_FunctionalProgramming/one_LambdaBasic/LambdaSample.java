package sixteen_FunctionalProgramming.one_LambdaBasic;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaSample {

	public static void main(String[] args) throws Exception {
		String[] words = "Improving code with Lambda expressions in Java".split(" ");
//		Arrays.sort(words, new Comparator<String>() {
//			@Override
//			public int compare(String s1, String s2) {
//				// 忽略大小写排序:
//				return s1.toLowerCase().compareTo(s2.toLowerCase());
//			}
//		});
		Arrays.sort(words, (s1, s2) -> {
			return s1.toLowerCase().compareTo(s2.toLowerCase());
		});
		System.out.println(Arrays.toString(words));
	}
}
