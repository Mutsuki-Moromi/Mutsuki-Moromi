//数字をローマ字に変換する
//前提①標準入力を受け取る
//1から5の数字に反応するように設定。他数字が入力された場合unknownと表示されること。
//ifでもwhichでも作成可能
package branch;

import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		switch(num){
			case 1:
				System.out.println("I");
				break;
			case 2:
				System.out.println("Ⅱ");
				break;
			case 3:
				System.out.println("Ⅲ");
				break;
			case 4:
				System.out.println("Ⅳ");
				break;
			case 5:
				System.out.println("Ⅴ");
				break;
			default:
				System.out.println("unknown");
				break;
		}
	}
}
