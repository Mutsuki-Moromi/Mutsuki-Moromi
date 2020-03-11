package loop1;

import java.util.Scanner;

/*標準入力で整数を受け取り、その桁数を表示する
 *プログアムを作成せよ。
 *【注意点】
 *標準入力で受け取った値を格納する変数の方は
 *想定結果を参考にして設定すること。
 *【12345の場合】
 *数字を入力してください：12345
 *桁数：5
 *【1234567891の場合】
 *数字を入力してください：1234567891
 *桁数：10
 */
public class task3 {

	public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("数字を入力してください：");
        int N = stdIn.nextInt();

        int digit = 0;
        while(N > 0){
            digit ++;
            N = N / 10;
        }
        System.out.println("桁数：" + digit);

    }
}