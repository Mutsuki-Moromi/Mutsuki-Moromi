package branch;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		//標準入力で数字(int型)を受け取り、それを表示するプログラムを完成せよ
		System.out.println("数字を入力してください"); //指示文は一番上に持ってくること。

		Scanner a = new Scanner(System.in); //さぁ、文字を取り込みますよって宣言。これだけだと数字を打ち込んでも白紙で入力されない。
		int num = a.nextInt(); //入力された数字を標準出力します宣言。
		if(num > 10) {
		System.out.print("値:"+ num);
		}

		//受け取った数字が１桁の場合は数字の先頭に0を付加すること。
		if(num < 10) {
			System.out.println("値：0" + num);

		}

	}

}
