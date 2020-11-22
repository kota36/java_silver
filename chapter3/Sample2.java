package chapter3;

/**
 * 演算子を使用した文字列結合
 *
 * @author Kota
 *
 */
public class Sample2 {

	/**
	 * メイン関数
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Hello";
		int a = 10, b = 20;
		System.out.println(str + a);
		System.out.println(str + a + b);
		System.out.println(str + (a + b));
		System.out.println(a + b + str);
	}

}
