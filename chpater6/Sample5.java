package chpater6;

class Foo {
	String str;
	int num;

	public Foo() {
		this("no_data");
	}

	public Foo(String str) {
		this(str, 1);
	}

	public Foo(String str, int num) {
		this.str = str;
		this.num = num;
		System.out.println("string:" + this.str);
		System.out.println("Int" + this.num);
	}
}

/**
 * thisの使い方
 * @author Kota
 *
 */
public class Sample5 {
	public static void main(String[] args) {
		Foo f1 = new Foo();
		Foo f2 = new Foo("Hey");
		Foo f3 = new Foo("Bye", 200);
	}
}
