package chpater6;

interface MyInter12_1 {
	double methodA(int num);

	default void methodB() {
		System.out.println("methodB()");
	}
}

interface MyInter12_2 {
	int methodC(int val1, int val2);

	static void methodD() {
		System.out.println("methodD()");
	}
}

class MyClass12 implements MyInter12_1, MyInter12_2 {
	public double methodA(int num) {
		return num * 0.3;
	}

	public int methodC(int val1, int val2) {
		return val1 + val2;
	}
}

public class Sample12 {
	public static void main(String[] args) {
		MyClass12 obj = new MyClass12();
		System.out.println("methodA()" + obj.methodA(10));
		System.out.println("methodC()" + obj.methodC(10, 20));
		obj.methodB();
		MyInter12_2.methodD();
	}
}
