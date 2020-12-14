package chpater6;

interface MyInter13 {
	void methodA();
}

class Super13 {
	void methodB() {
	};
}

/**
 * 抽象クラスを継承し、インターフェースを実装するクラス
 *
 * @author Kota
 *
 */
class MyClass13 extends Super13 implements MyInter13 {
	public void methodA() {
	};
}

public class Sample13 {

}
