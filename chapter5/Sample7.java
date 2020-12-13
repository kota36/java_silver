package chapter5;

/**
 * 可変長引数の実行クラス2
 *
 * @author Kota
 *
 */
public class Sample7 {
	public void method(String... strings) {
		String size = "";
		size += strings == null ? "" : strings.length;
		System.out.println(strings + ":" + size);
	}

	public static void main(String[] args) {
		Sample7 obj = new Sample7();
		obj.method("A", "B");
		obj.method(null);
		obj.method((String[]) null);
		obj.method();
		obj.method((String) null);
	}

}
