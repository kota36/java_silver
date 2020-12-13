package chpater6;

class Super6 {
	int num;

	public void methodA() {
		num += 100;
	}

	public void print() {
		System.out.println("num" + num);
	}
}

class Sub6 extends Super6 {
	public void methodA() {
		num += 500;
	}

	public void methodB() {
		methodA();
		print();
		super.methodA();
		print();
	}
}

public class Sample6 {
	public static void main(String[] args) {
		Sub6 obj = new Sub6();
		obj.methodB();
	}
}
