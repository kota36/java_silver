package chapter2;

public class Sample8 {
	//	varによる変数宣言

//	var a = 100;	//	メンバ変数に使用できない
//	static var b = 100;	//	メンバ変数に使用できない
	public static void main(String[] args) {
		var c = "Hello";
		var d = 1;
//		var e;	//	初期値の設定は必須
//		var f = null	//	varは型の推論ができることが必須
		final var g = 2;
	}

}
