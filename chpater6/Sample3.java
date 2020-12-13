package chpater6;

class SuperA3 {
	void methodA() {
		System.out.println("SuperA:methodA()");
	}

	static void methodB() {
		System.out.println("SuperA:methodB()");
	}
}

class SubA3 extends SuperA3 {
	void methodA() {
		System.out.println("SubA3:methodA()");
	}

//	static void methodA() {
//		System.out.println("SubA3:methodA()");
//	}
//	void methodB() {
//		System.out.println("SubA3:methodB()");
//	}
	static void methodB() {
		System.out.println("SubA3:methodB()");
	}
}

public class Sample3 {
	public static void main(String[] args) {
		SubA3 objA = new SubA3();
		objA.methodA();
		objA.methodB();
	}
}
