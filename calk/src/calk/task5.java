package calk;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		String noteValue = "ノートPCの値段: ";
		int num = 89800;
		char en = '円';
		System.out.println( noteValue + num + en );

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String word = sc.next();

		System.out.println(str);

		System.out.println(word);

		System.out.println(str + word);

		sc.close();
	}

}
