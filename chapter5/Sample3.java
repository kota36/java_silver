package chapter5;

/**
 * オーバーロード
 *
 * @author Kota
 *
 */


public class Sample3 {
	void myPrint() {
		System.out.println("myPrint()");
	}

	void myPrint(String s) {
		System.out.println("myPrint(String s)");
	}

	void myPrint(int a) {
		System.out.println("myPrint(int a)");
	}

	public static void main(String[] args) {
		Sample3 t = new Sample3();
		t.myPrint();
		t.myPrint("ss");
		t.myPrint(10);
	}

}
