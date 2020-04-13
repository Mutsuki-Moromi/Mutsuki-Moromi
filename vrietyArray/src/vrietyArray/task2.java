/* 配列に以下の数字が格納されている
 * 21,3,32,6,99,72,78,51,1,26,87,11,48,60
 * 数字を奇数と偶数に分けて、それそれ別のArrayListに
 * 格納し、表示させるプログラムを作成せよ
 *
 * 【想定結果】
 * 奇数:[]
 * 偶数:[]
 *
 */
package vrietyArray;

import java.util.ArrayList;
import java.util.Arrays;

public class task2 {

	public static void main(String[] args) {
	    Integer[] numArray = {21,3,32,6,99,72,78,51,1,26,87,11,48,60};
	    ArrayList<Integer> odd = new ArrayList<>();
	    ArrayList<Integer> even = new ArrayList<>();

	    //配列内の数値を判定し、リストに格納
	    for (int num : numArray) {
	        if (num % 2 == 0) {
	        	//ArrayList Evenに追加
	            	even.add(num);
	        } else {
	        	//ArrayList Oddに追加
	            	odd.add(num);
	        }
	    }
	    // toStringで数字から文字へ変換
	    System.out.println("奇数：" + Arrays.toString(odd.toArray()));
	    System.out.println("偶数：" + Arrays.toString(even.toArray()));
	}
}