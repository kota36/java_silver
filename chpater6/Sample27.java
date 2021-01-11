package chpater6;

import java.util.function.Function;

/**
 * ラムダ式の利用
 *
 * @author Kota
 *
 */
public class Sample27 {
	public static void main(String[] args) {
		Function<String, String> obj = (String str) -> {
			return "Hello " + str;
		};
		String str = obj.apply("tanaka");
		System.out.println(str);
	}

}
