package chapter3;

/**
 * 参照型データの比較
 *
 * @author Kota
 *
 */
public class Sample8 {

	public static void main(String[] args) {
		int[] a1 = { 10 };
		int[] a2 = { 10 };
		int[] a3 = { 10 };
		int[] a4 = a3;

		System.out.println("a1==a2:" + (a1 == a2));
		System.out.println("a3==a4:" + (a3 == a4));
	}

}
