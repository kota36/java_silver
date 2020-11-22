package chapter4;

/**
 * 拡張for文
 *
 * @author Kota
 *
 */
public class Sample7 {

	public static void main(String[] args) {
		char[] array = { 'a', 'b', 'c', 'd', 'e' };
		for (char c : array) {
			System.out.println(c);
		}
		for (int count = 0; count < array.length; count++) {
			System.out.println(array[count]);
		}
	}

}
