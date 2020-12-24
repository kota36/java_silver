package chpater6;

import java.util.*;

/**
 * HashSet and TreeSet
 *
 * @author Kota
 *
 */
public class Sample21 {
	public static void main(String[] args) {
		HashSet<Integer> hSet = new HashSet();
		hSet.add(300);
		hSet.add(20);
		hSet.add(500);
		System.out.println("HaseSet" + hSet);

		TreeSet<Integer> tSet = new TreeSet<Integer>();
		tSet.add(300);
		tSet.add(20);
		tSet.add(500);
		System.out.println("TreeSet:" + tSet);

	}

}
