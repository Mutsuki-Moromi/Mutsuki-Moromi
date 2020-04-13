/* int型の配列に0～9までのランダムな値を格納し、
 * 最大値と最小値を求めるプログラムを作成せよ。
 * ただし以下のルールに従うこと。
 * 【ルール】
 * 実行結果のように
 * 生成した配列と最大値、最小値を出力すること
 * 値の生成にはRandomクラスを用いること
 * 分岐処理を用いて","区切りの制御をすること
 * 【実行結果】
 * 6,2,6,0,2,9
 * 最大値:9
 * 最小値:0
 */
package array;

import java.util.Random;

public class task3 {

	public static void main(String[] args) {
		//int型の配列に0～9までのランダムな値を格納
		int[] array = new int[6];
		Random random = new Random();
		for(int i = 0; i < 6; i++) {
			array[i] = random.nextInt(10);
			if(i == 5) {
				System.out.print(array[i]);
			}else {
				System.out.print(array[i] + ",");
		}
		}

		System.out.println();
		int max = array[0];
		int min = array[0];

		for(int j = 1; j <array.length; j++) {
			if(array[j] > max) {
				max = array[j];
			}
			if(array[j] < min) {
				min = array[j];
			}
		}
		System.out.println("最大値: " + max);
		System.out.println("最小値: " + min);
	}
}
