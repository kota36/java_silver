package chapter5;

/**
 * アクセス修飾子
 *
 * @author Kota
 *
 */
public class Sample13 {
	public static void main(String[] args) {
		Employee obj = new Employee(100);
//		System.out.println("access private" + obj.id); // privateには直接アクセスできない
		System.out.println("access public" + obj.getId());
	}
}

class Employee {
	private int id;

	public Employee(int i) {
		id = i;
	}

	public int getId() {
		return id;
	}
}