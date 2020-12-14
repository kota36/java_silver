package chpater6;

interface XIF {
	void methodA();
}

interface YIF {
	void methodB();
}

interface SubIF extends XIF, YIF {
	void methodC();
}

class MyClass14 implements SubIF {
	public void methodA() {
	};

	public void methodB() {
	};

	public void methodC() {
	};
}

public class Sample14 {

}
