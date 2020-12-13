package chapter5;

class Test {
	void method1(int num) {
		num += 10;
		System.out.println("定義側" + num);
	}

	void method2(int[] array) {
		array[0] += 10;
		System.out.println("定義側" + array[0]);
	}
}

/**
 * 基本データ型と参照型の違い
 *
 * @author Kota
 *
 */
public class Sample14 {
	public static void main(String[] args) {
		int num = 10;
		int[] array = { 10 };

		Test obj = new Test();
		obj.method1(num);
		System.out.println("呼び出し側" + num);
		obj.method2(array);
		System.out.println("呼び出し側" + array[0]);
	}

}
