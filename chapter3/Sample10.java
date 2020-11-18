package chapter3;

/**
 * Stringクラスの文字列比較
 *
 * @author Kota
 *
 */
public class Sample10 {

	public static void main(String[] args) {
		String s1 = "tantaka";
		String s2 = "tantaka";
		String s3 = "TANAKA";

		// equalsを使用(文字列が同じかを判定）
		System.out.println("s1==s2:" + s1.equals(s2));
		System.out.println("s1==s3:" + s1.equals(s3));

		// ==演算子を使用（参照先が同じかを判定）
		String s5 = "Hello";
		String s6 = new String("Hello");
		String s7 = "Hello";
		String s8 = s6.intern();

		System.out.println("s5==s6:"+(s5==s6));
		System.out.println("s5==s7:"+(s5==s7));
		System.out.println("s5==s8:"+(s5==s8));
		System.out.println("s6==s8:"+(s6==s8));
	}

}
