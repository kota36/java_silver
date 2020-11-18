package chapter3;

/**
 * キャスト演算子
 * @author Kota
 *
 */
public class Sample14 {

	public static void main(String[] args) {
		double d = 10.5;
//		 int i = d; // NG
		int i = (int)d;
		System.out.println("i:"+i);
//		foo(i); // 引数の型がNG
		foo((short)i);

	}

	/**
	 * 引数を出力する関数
	 * @param a 標準出力する値
	 */
	static void foo(short a) {
		System.out.println("a:"+a);
	}

}
