package chpater6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ラムダ式の活用
 *
 * @author Kota
 *
 */
public class Sample29 {
	public static void main(String[] args) {
		// removelf()
		List<Integer> data = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
		data.removeIf(i -> i % 2 != 0);
//		data.removeIf((Integer i) -> {
//			return i % 2 != 0;
//		});
		System.out.println(data);

		// replaceAll()
		List<String> words = Arrays.asList("Tanaka", "Sato");
//		words.replaceAll((String str) -> {
//			return str.toUpperCase();
//		});
		words.replaceAll(str -> str.toUpperCase());
		System.out.println(words);

		// sort()
		List<Integer> list = Arrays.asList(20, 30, 10);
//		list.sort((Integer o1, Integer o2) -> {
//			return o2.compareTo(o1);
//		});
		list.sort((o1, o2) -> o2.compareTo(o1));
		System.out.println(list);

		// forEach()
		List<Integer> lists = Arrays.asList(20, 30, 10);
//		lists.forEach((Integer num) -> {
//			System.out.print(num + " ");
//		});
		lists.forEach(num -> System.out.print(num + " "));

	}
}
