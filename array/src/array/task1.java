/* int型の配列に以下の数字が格納されている。
 * {4,9,19,5,8,21,42,64,73,18,2}
 * 配列に格納されている値と、その合計を表示させる
 * プログラムを作成せよ。
 * ただし、以下のルールに従うこと。
 * 【ルール】
 * 配列の値を表示させるときは通常のfor文を用いること
 * 分岐処理を用いて","区切りの制御をすること
 * 合計を算出する時は拡張for文を用いること
 * 【実行結果】
 * 配列:[4,9,19,5,8,21,42,64,73,18,2]
 * 合計:265
 */
package array;

public class task1 {

	public static void main(String[] args) {
		int num = 0;
		int data[] = {4, 9, 19, 5, 8, 21, 42, 64, 73, 18, 2};

		for(int i =0;i < data.length; i++) {
			if(i == num) {
				System.out.print("配列:");
			}else{
				System.out.print(",");
			}
			num += data[i];
				System.out.print(data[i]);
		}
				System.out.println();
				System.out.println("合計:" + num);
	}

}
