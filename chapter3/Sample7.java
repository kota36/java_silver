package chapter3;

/**
 * StringBuilderクラス
 *
 * @author Kota
 *
 */
public class Sample7 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("Ab Cdefge");
		System.out.println("append():" + sb1.append("XYz"));
		System.out.println("insert():" + sb1.insert(3, "ZZ"));
		System.out.println("delete():" + sb1.delete(3, 5));
		System.out.println("replace():" + sb1.replace(2, sb1.length() - 1, "NNN"));
		System.out.println("substring():" + sb1.substring(4));
	}

}
