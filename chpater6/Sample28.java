package chpater6;

import java.util.function.Function;

/**
 * ラムダ式の利用 省略あり
 *
 * @author Kota
 *
 */
public class Sample28 {
	public static void main(String[] args) {
		Function<String, String> obj = str -> "Hello " + str;
		String str = obj.apply("tanaka");
		System.out.println(str);
	}
}
