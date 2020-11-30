package chapter5;

/**
 * オーバーロード
 *
 * @author Kota
 *
 */

class Test {
	void myPrint() {
		System.out.println("myPrint()");
	}

	void myPrint(String s) {
		System.out.println("myPrint(String s)");
	}

	void myPrint(int a) {
		System.out.println("myPrint(int a)");
	}
}

public class Sample3 {
	public static void main(String[] args) {
		Test t = new Test();
		t.myPrint();
		t.myPrint("ss");
		t.myPrint(10);
	}

}
