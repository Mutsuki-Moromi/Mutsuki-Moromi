package calk;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		int a = 20, b = 22, c = 23;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println("合計:" + ( a + b + c ) );
		System.out.println("平均(3で割った時):" + ( ( a + b + c ) / 3 ) );
		
		double d;
		d = 3.0;
		System.out.println("平均(3.0で割った時):" + ( ( a + b + c ) /d ) );
		//上のコードは自分で書いたもの。
		
		
		//下記のコードはyahoo知恵袋参照。https://detail.chiebukuro.yahoo.co.jp/qa/question_detail/q1365585513
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 3; i++) {
		System.out.print(i + 1 + "個目の数 = ");
		sum += scanner.nextInt();
		}
		System.out.println("合計 = " + sum);
		System.out.print("平均 = " + (double)sum / 5);
  }
}
