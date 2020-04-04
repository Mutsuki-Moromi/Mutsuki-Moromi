package variable;

public class task3 {

	public static void main(String[] args) {
		//変数変換を行うこと。int-long,double-float,long-doubleへ変換。

		//型の大小関係はint<longなので自動で型変換をしてくれる
		int intNum = 219;
		long longNum = intNum;

		//float<doubleなのでキャスト変換を利用し強制的に型変換する。
		double doubleNum = 364.2;
		float floatNum = (float) doubleNum;

		//型の大小関係はlong<doubleなので自動で型変換をしてくれる
		long longNumx = 123456L;
		double doubleNumx = longNumx;

		System.out.println("変換前");
		System.out.println(intNum);
		System.out.println(doubleNum);
		System.out.println(longNumx);

		System.out.println("変換後");
		System.out.println(longNum);
		System.out.println(floatNum);
		System.out.println(doubleNumx);
	}
}
