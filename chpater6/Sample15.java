package chpater6;

abstract class Super15 {
	int x;
	int y;

	public abstract void print();

	public void method(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class MyClass15 extends Super15 {
	public void print() {
		System.out.println("x:" + x + "　y" + y);
	}
}

/**
 *
 * スーパークラスの変数オブジェクトにサブクラスのオブジェクトを代入
 *
 * @author Kota
 *
 */
public class Sample15 {
	public static void main(String[] args) {
		Super15 obj = new MyClass15();
		obj.method(10, 20);
		obj.print();
	}
}