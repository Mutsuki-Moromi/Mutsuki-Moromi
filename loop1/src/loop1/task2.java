package loop1;

import java.util.Scanner;

/*
 * 標準入力で整数を受け取り、1からその整数までを
 * 順番に足した結果を表示するプログラムを作成せよ。
 * ただし以下のルールに従うこと
 * 【ルール】
 * 計算結果だけでなく、計算式も出力すること
 * 例：受け取った整数が5の場合
 * 「1+2+3+4+5=15」を出力する
 * 【注意点】
 * 正の数以外が入力されることは想定しない
 */
public class task2 {

	public static void main(String[] args) {
		System.out.print("数字を入力してください: ");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		int sum = 0;
		for(int i = 1;i <= N; i++) {
			sum += i;
			System.out.print(i);
			if(i == N) {
			System.out.print(" = ");
			}else {
			System.out.print(" + ");
			}
		}
		System.out.print(sum);
	}
}