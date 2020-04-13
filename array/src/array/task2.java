/* 要素数7のint型の配列を用意する。
 * ループ処理を用いて順番に7,6,5,4,3,2,1を代入し、
 * 値を表示させるプログラムを作成せよ。
 * また値を逆順にして表示させよ
 * 【注意点】
 * 前問同様、分岐処理を用いて","区切りの制御をすること
 * 【実行結果】
 * 7,6,5,4,3,2,1
 * 1,2,3,4,5,6,7
 */
package array;

public class task2 {

	public static void main(String[] args) {
		int num = 0;
		int[] data = new int[7];

		data[0] = 1;
		data[1] = 2;
		data[2] = 3;
		data[3] = 4;
		data[4] = 5;
		data[5] = 6;
		data[6] = 7;

		for(int i = 0; i < data.length; i++) {
			  if(i != num) {
				System.out.print(",");
			  }
			  System.out.print(data[i]);
		}
		int sum = 6;
		System.out.println();
		for(int i = data.length-1; i >= 0; i--) {
			if(i != sum) {
				System.out.print(",");
			}
			System.out.print(data[i]);
		}
	}
}
