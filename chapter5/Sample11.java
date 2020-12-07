package chapter5;

/**
 * staic変数　- null -
 * @author Kota
 *
 */
public class Sample11 {
	static String staticVal = "static";
	String instanceVal = "instance";

	public static void main(String[] args) {
		Sample11 obj = null;
		System.out.println(obj.staticVal);
		System.out.println(obj.instanceVal);
	}

}
