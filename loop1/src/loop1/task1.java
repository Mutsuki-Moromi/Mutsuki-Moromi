package loop1;

import java.util.Scanner;

/* 標準入力で正の整数を受け取り、１からその整数までを
 * 順番に足した結果を表示するプログラムを作成せよ。
 * ただし以下のルールに従うこと
 * 【注意点】
 * 正の整数以外が入力されることは想定しない
 * 【想定結果】
 * 〈10の場合〉
 * 数字を入力してください：10
 * 1～10までの合計：55
 * 〈20の場合〉
 * 数字を入力してください：20
 * 1～20までの合計：210
 */

public class task1 {

	public static void main(String[] args) {
		System.out.print("数字を入力してください：");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=N;i++) {
			sum += i;
			}
		System.out.println("1～" + N + "までの合計:" + sum);
	}
}
