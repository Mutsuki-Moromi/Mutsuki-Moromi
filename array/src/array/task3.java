/* int型の配列に0～9までのランダムな値を格納し、
 * 最大値と最小値を求めるプログラムを作成せよ。
 * ただし以下のルールに従うこと。
 * 【ルール】
 * 実行結果のように
 * 生成した配列と最大値、最小値を出力すること
 * 値の生成にはRandomクラスを用いること
 * 分岐処理を用いて","区切りの制御をすること
 * 【実行結果】
 * {6,2,6,0,2,9}
 * 最大値:9
 * 最小値:0
 */
package array;

public class task3 {

	public static void main(String[] args) {
		int[] array = {6,2,6,0,2,9};
		int max = array[0];
		int min = array[0];

		for(int i = 1;i <array.length;i++) {
			if(array[i] > max) {
				max = array[i];
			}
			if(array[i] < min) {
				min = array[i];
			}
		}
			System.out.println("最大値:" + max);
			System.out.println("最小値:" + min);
	}

}
