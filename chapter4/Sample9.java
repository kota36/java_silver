package chapter4;

/**
 * break文
 *
 * @author Kota
 *
 */
public class Sample9 {
	public static void main(String[] args) {
		for (int i = 0;; i++) {
			if (i == 3)
				break;
			System.out.print(i);
		}
		System.out.print("\nbreak");
	}
}
