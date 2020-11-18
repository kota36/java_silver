package chapter3;

/**
 * 条件演算子
 * @author Kota
 *
 */
public class Sample19 {

	public static void main(String[] args) {
		int num = 20;
		String str = "num is";
		str += num < 10 ? "<10" : ">=10";
		System.out.println(str);
	}

}
