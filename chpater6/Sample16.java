package chpater6;

interface A {
}

class B {
}

class C extends B {
}

class D {
}

/**
 * instanceof演算子
 *
 * @author Kota
 *
 */
public class Sample16 {
	public static void main(String[] args) {
		C obj = new C();
		System.out.println(obj instanceof A);
		System.out.println(obj instanceof B);
		System.out.println(obj instanceof C);
//		System.out.println(obj instanceof D);	//継承関係がないのでコンパイルエラー
	}

}
