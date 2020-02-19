package variable;

public class task3 {

	public static void main(String[] args) {
		//変数変換を行うこと。int-long,double-float,long-doubleへ変換。

		System.out.println("変換前");
		int a = 219;
		long x = a;   //型の大小関係はint<longなので自動で型変換をしてくれる
		System.out.println(a);

		double b = 364.2;
		float y = (float) b;  //float<doubleなのでキャスト変換を利用し強制的に型変換する。
		System.out.println(b);

		long c = 123456L; 
		double z = c;
		System.out.println(c);


		System.out.println("変換後");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);


	}

}
