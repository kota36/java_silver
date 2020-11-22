package chapter3;

/**
 * 単項演算子
 *
 * @author Kota
 *
 */
public class Sample3 {

	public static void main(String[] args) {
		int a = 10, b = 10, c = 10, d = 10;
		System.out.println(a++);
		System.out.println(++b);
		System.out.println(c--);
		System.out.println(--d);

		a = 10;
		c = 10;
		b = ++a; // 前置
		System.out.println("a:" + a + "b:" + b);

		d = c++; // 後置
		System.out.println("c:" + c + "d:" + d);

	}

}
