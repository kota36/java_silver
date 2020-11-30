package chapter5;

/**
 * 可変長引数例の実行クラス
 *
 * @author Kota
 *
 */
public class Sample6 {
//	public class Test {
		public void method(String s, int... a) {
			System.out.println(s + "サイズ:" + a.length);
			for (int i : a) {
				System.out.println("第二の引数：" + i);
			}
		}
//	}

	public static void main(String[] args) {
		Sample6 obj = new Sample6();
		int[] ary = { 10, 20, 30 };
		obj.method("1");
		obj.method("2", 10);
		obj.method("3", 10, 20);
		obj.method("4", ary);
	}

}
