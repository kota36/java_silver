package chapter3;

/**
 * Boxing & Unboxing
 * @author Kota
 *
 */
public class Sample15 {

	public static void main(String[] args) {
		int i1 = 100;
		Integer obj = i1; //Boxing
		int i2 = obj; //Unboxing
		method(i2);

		i1 = i1+5;
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(obj);

		i2 = i2+7;
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(obj);

		obj = obj + 10;
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(obj);


	}

	/**
	 * 引数を標準出力する
	 * @param i　出力する値
	 */
	static void method(Integer i) {
		System.out.println(i);
	}

}
