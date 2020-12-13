package chpater6;

class SuperA {
	public void print(String s) {
		System.out.println("SuperA print:" + s);
	}
	public void metehod() {};
}

class SubA extends SuperA {
	public void print(String s) {
		System.out.println("SubA print:" + s);
	}
//	void metehod() {};
}

/**
 * 継承クラスのオーバーライド
 * @author Kota
 *
 */
public class Sample2 {
	public static void main(String[] args) {
		SuperA obj1 = new SuperA();
		obj1.print("java");
		SubA obj2 = new SubA();
		obj2.print("java");
	}

}
