package chpater6;

class Super8 {
	public Super8() {
		System.out.println("Super8");
	}

	public Super8(int a) {
		System.out.println("Super8" + "(int)");
	}
}

class Sub8 extends Super8 {
	public Sub8() {
		System.out.println("Sub8");
	}

	public Sub8(int a) {
		super(a);
		System.out.println("Sub8(int)");
	}
}

public class Sample8 {
	public static void main(String[] args) {
		Sub8 obj1 = new Sub8();
		Sub8 obj2 = new Sub8(10);

	}
}
