//標準入力で数字(int型)を受け取り、それを表示するプログラムを完成せよ
//指示文は一番上に持ってくること。
//さぁ、文字を取り込みますよって宣言。これだけだと数字を打ち込んでも白紙で入力されない。
//入力された数字を標準出力します宣言。
//受け取った数字が１桁の場合は数字の先頭に0を付加すること。
package branch;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		System.out.println("数字を入力してください");
		Scanner a = new Scanner(System.in); 
		int num = a.nextInt(); 
		if(num > 10) {
		System.out.print("値:"+ num);
		}
		if(num < 10) {
			System.out.println("値：0" + num);
		}

	}

}
