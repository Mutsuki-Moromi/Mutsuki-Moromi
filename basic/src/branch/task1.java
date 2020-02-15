package branch;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {

		//課題：標準入力で10以上の数字(int型)を受け取り、それを表示するプログラムを完成させよ
		
		System.out.println("10以上の数字を入力してください"); 
		Scanner a = new Scanner(System.in);
		int num = a.nextInt(); 
		System.out.println("値:" + num);
		
		//String a = a.nextLineだった為標準入力受け付けなかった。
		//Stringは文字列、(a_* num)→(文字列＊数字)と同意義。
		
		
		
		//課題説明：受けとった数字が１桁の場合は、その数字を10倍にすること。
		int sum = num * 10;
		if(num < 10) {
			System.out.println(sum);
			//｛｝がないと1桁でも２桁でも関係なしに出力されていた。
		}
		}
}
