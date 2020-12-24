package chpater6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee22 {
	private String name;
	private Integer id;

	public Employee22(String name, Integer id) {
		this.name = name;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return this.name;
	}
}

class MyRule22 implements Comparator<Employee22> {
	public int compare(Employee22 obj1, Employee22 obj2) {
		return obj1.getId().compareTo(obj2.getId());
	}
}

public class Sample22 {
	public static void main(String[] args) {
		Employee22 e1 = new Employee22("taro", 20);
		Employee22 e2 = new Employee22("tomoko", 10);
		Employee22 e3 = new Employee22("hiromi", 50);
		ArrayList<Employee22> ary = new ArrayList<Employee22>();
		ary.add(e1);
		ary.add(e2);
		ary.add(e3);
		System.out.println("ArrayListのインデックス順での表示");
		print(ary);
		System.out.println("MyRuleで定義したidの昇順での表示");
		Collections.sort(ary, new MyRule22());
		print(ary);

	}

	public static void print(ArrayList<Employee22> ary) {
		for (Employee22 obj : ary) {
			System.out.println(obj.getId() + " " + obj.getName());
		}
	}
}
