package loop1;

/*　標準入力で正の整数を受け取り、その整数の約数を
 * すべて表示するプログラムを作成せよ
 * 【注意点】
 * 標準入力にはScannerを用いること
 * 分岐処理・ループ処理を持ちいること
 * 【想定結果】
 * 〈60の場合〉
 * 正の整数を入力してください：60
 * 60の約数：1,2,3,4,5,6,10,12,15,20,30,60
 * 〈24の場合〉
 * 整数を入力してください：24
 * 24の約数：1,2,4,6,8,12,24
 */
import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		System.out.print("正の整数を入力してください: " );
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		System.out.print(N + "の約数: ");
    	for(int i = 1; i <= N; i++) {
    		if(N % i == 0) {
    			if(N == i) {
    			System.out.print(i);
    		}else if(N != i) {
    			System.out.print(i + ",");
    		}

    		}

    	}

	}

}
