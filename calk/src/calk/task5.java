package calk;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		String a = "ノートPCの値段:";
		long b = 89800L;
		char c = '円';
		System.out.println( a + b + c );

		Scanner sc = new Scanner(System.in);
		String st1 = sc.nextLine();
		Scanner sc2 = new Scanner(System.in);
		String st2 = sc2.nextLine();
		System.out.println(st1 + st2);
	}	

}
