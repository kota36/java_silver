package chapter5;

/**
 * staticイニシャライザ
 *
 * @author Kota
 *
 */
public class Sample12 {
	static {
		System.out.println("Sample12クラスイニシャライザ");
	}
	Sample12() {
		System.out.println("Sample12クラスコンストラクタ");
	}

	public static void main(String[] args) {
		System.out.println("mainメソッド");
		Sample12 obj = new Sample12();
	}
}

