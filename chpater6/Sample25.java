package chpater6;

import java.util.function.Function;

class MyFunc25 implements Function<String, String> {
	public String apply(String str) {
		return "Hello " + str;
	}
}

/**
 * Function interface の利用
 * @author Kota
 *
 */
public class Sample25 {
	public static void main(String[] args) {
		MyFunc25 obj = new MyFunc25();
		String str = "Tom";
		System.out.println(obj.apply(str));
	}
}
