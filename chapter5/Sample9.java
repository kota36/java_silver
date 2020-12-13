package chapter5;

/**
 * static変数
 *
 * @author Kota
 *
 */
public class Sample9 {
	int instanceVal = 100;
	static int staticVal = 200;

	void methodA() {
		System.out.println("methodA():" + instanceVal);
	}

	static void methodB() {
		System.out.println("methodB():" + staticVal);
	}

	public static void main(String[] args) {
//		System.out.println(Sample9.instanceVal); // インスタンス化していないので呼び出せない
		System.out.println(Sample9.staticVal); // static変数はインスタンス化しないで呼び出せる
//		Sample9.methodA();
		Sample9.methodB();

		Sample9 sam = new Sample9();
		System.out.println(sam.instanceVal);
		sam.methodA();
	}

}
