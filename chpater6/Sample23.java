package chpater6;

import java.util.Arrays;

/**
 *
 * Arraysクラスのソート
 * @author Kota
 *
 */
public class Sample23 {
	public static void main(String[] args) {
		int[] ary1 = {3, 1, 2};
		print(ary1);
		System.out.println();
		Arrays.sort(ary1);
		print(ary1);
		System.out.println();
		Object[] ary2 = {"hello", 10};
//		Arrays.sort(ary2);
	}
	public static void print(int[] ary) {
		for(int i: ary) {
			System.out.print(i + " ");
		}
	}
}
