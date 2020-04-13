// 標準入力で数字を受け取り、以下の分岐を行うプログラムを作成せよ
//正の数の場合、以下の文字列を出力『入力された数字は正の数です』
//負の整数の場合、以下の文字列を出力『入力された数字は負の数です』
//0の場合『入力された数字は0です』
package branch;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int num = a.nextInt();

		if(num > 0) {
				System.out.println("入力された数字は正の数です");
		}else if(num < 0) {
				System.out.println("入力された数字は負の数です");
		}else if(num == 0) {
				System.out.println("入力された数字は0です");
		}
	}
}