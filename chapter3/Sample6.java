package chapter3;

/**
 * Stringクラスの使用
 *
 * @author Kota
 *
 */
public class Sample6 {

	public static void main(String[] args) {
		String s = "abcdefa";
		System.out.println("charAt():" + s.charAt(4));
		System.out.println("equals():" + s.equals("abcdefa"));
		System.out.println("equals():" + s.equals("abc"));
		System.out.println("intern():" + s.intern());
		System.out.println("indexOf():" + s.indexOf("a"));
		System.out.println("length():" + s.length());
		System.out.println("replace():" + s.replace("a", "z"));
		System.out.println("substring():" + s.substring(3));

	}

}
