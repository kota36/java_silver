package chpater6;

/**
 * 抽象クラス
 * @author Kota
 *
 */
abstract class Super9 {
	protected abstract void methodA();
	public void methodB() {};
}

class Sub9 extends Super9 {
	protected void methodA() {};
//	public void methodA() {}; // 上記に代わってこちらでも可
	public void methodB() {}; //オーバーライドは任意
}

public class Sample9 {

}
