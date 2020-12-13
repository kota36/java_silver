package chpater6;

class Super7 {
	public Super7() {
		System.out.println("Super7");
	}

	public Super7(int a) {
		System.out.println("Super(int)");
	}
}

class Sub7 extends Super7 {
	public Sub7() {
		System.out.println("Sub7");
	}

	public Sub7(int a) {
		System.out.println("Sub7(int)");
	}
}

/**
 * コンストラクタの継承
 * @author Kota
 *
 */
public class Sample7 {
	public static void main(String[] args) {
		Sub7 obj1 = new Sub7();
		Sub7 obj2 = new Sub7(10);
	}

}
