package branch;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		// 標準入力で３つの整数を受け取り最大値を求めるプログラムを完成させよ


		Scanner kazu1 = new Scanner(System.in);
		int num1 = kazu1.nextInt();
		Scanner kazu2 = new Scanner(System.in);
		int num2 = kazu2.nextInt();
		Scanner kazu3 = new Scanner(System.in);
		int num3 = kazu3.nextInt();
		//前提①標準入力で作られるクラスです

		if(num1 <= 0 || num2 <= 0 || num3 <= 0)
		    System.out.println("正の数を入力してください");
		//前提②整数のみ

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		//標準入力の整数はすべて標準出力されます

			  if(num1 > num2 && num1 > num3) {
			System.out.print("最大値：" + num1);
			//1が大きい場合の宣言
		}else if(num2 > num3){
			System.out.print("最大値：" + num2);
			//num1が最大値の場合は上記で定義済みな為2が最大値な場合は1は最大値から外れるためコードから除外してよい
		}else{
			System.out.print("最大値：" + num3);
			//上記で最大値が1の場合、2の場合を定義済み、もし1なら、もし2なら、と条件を付け3の場合はそれ以外の為elseだけでよい。
			//最大値を求める
		}
	}

}
