/*
 * Java条件文
 * 課題１
 * 内容：標準入力で10以上の数字(int型)を受け取り、それを表示するプログラムを完成させよ
	//数字の入力処理（スキャナー使用）。SPチャート①段階
	String a = a.nextLineだった為標準入力受け付けなかった。
	Stringは文字列、(a_* num)→(文字列＊数字)と同意義。
	課題説明：受けとった数字が１桁の場合は、その数字を10倍にすること。
	標準入力で受け取った文字が１桁である→Yes/NoのIF文を作成、SPチャート②段階
	｛｝がないと1桁でも２桁でも関係なしに出力されていた。
*/
package branch;
import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		System.out.println("10以上の数字を入力してください");
		Scanner a = new Scanner(System.in);
		int num = a.nextInt();
		a.close();
		
		if(num < 10) {
			num = num * 10;
		}
		System.out.println("値:" + num);
		
	}
}
