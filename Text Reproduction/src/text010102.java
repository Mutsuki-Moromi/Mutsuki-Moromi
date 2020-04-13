import java.util.Random;
import java.util.Scanner;

public class text010102 {

	public static void main(String[] args) {
		// text java basic 1-2
		//Randomクラスをインスタンス化
		Random rand = new Random();
		//Scannerクラスをインスタンス化、標準入力されたモノをstdIn変数へ代入。この時数字でも文字でもない。
		Scanner stdIn = new Scanner(System.in);

		System.out.println("要素数(1～9までの数字で指定) : ");
		//標準入力されたモノをint型で受け取り、num変数へ代入
		int num = stdIn.nextInt();
		//受付終了
		stdIn.close();

		int[] array = new int[num];

		for(int i = 0; i < num; i++) {
			array[i] = rand.nextInt(10) + 1;
		}
		//ソースコードが途中過ぎて何がしたいのかよくわからんクラスファイル
	}

}
