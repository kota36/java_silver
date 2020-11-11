package chapter2;

/**
 * 配列を作成、出力するクラス
 *
 * @author Kota
 *
 */
public class Sample9 {

	/**
	 * メインメソッド
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		char[] c;
		c = new char[3];
		int[] i = new int[3];
		String str[] = { "Welcome ", "to ", "Java." };
		c[0] = 'A';
		c[1] = 'B';
		c[2] = 'C';
		i[0] = 1;
		i[1] = 2;
		i[2] = 3;
		System.out.println("strのサイズ" + str.length);
		System.out.println("c[0]:" + c[0]);
		System.out.println("i[1]:" + i[1]);
	}

}
