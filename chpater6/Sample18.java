package chpater6;

import java.util.ArrayList;

/**
 * ArrayListの利用
 *
 * @author Kota
 *
 */
public class Sample18 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Integer i1 = 10;
		int i2 = 2;
		Integer i3 = i1;
		list.add(i1);
		list.add(i2);
		list.add(i3);
		list.add(1, 5);

		System.out.println(list);

		System.out.println("size:" + list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + " ");
		}
		System.out.println("");
		for (Integer i : list) {
			System.out.println(i);
		}

	}
}
