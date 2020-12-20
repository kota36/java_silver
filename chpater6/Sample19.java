package chpater6;

import java.util.HashSet;

/**
 * HashSetの利用
 *
 * @author Kota
 *
 */
public class Sample19 {
	public static void main(String[] args) {
		String[] ary = { "CCC", "AAA", "BBB" };
		HashSet<String> hashset = new HashSet<String>();
		hashset.add(ary[0]);
		hashset.add(ary[1]);
		hashset.add(ary[2]);
		hashset.add(ary[0]);

		System.out.println("Hashset size;" + hashset.size());
		System.out.print(hashset);
	}
}
