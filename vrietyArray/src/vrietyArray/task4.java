/* 配列に以下の数字が格納されている
 * 21,3,32,6,99,72,51,1,26,87,11,48,60
 * 29,5,46,74,14,193,215,83
 * 数字を奇数と偶数に分けて、それそれ別のArrayListに
 * 格納し、mapでラベルを付けて管理するプログラムを作成せよ
 *
 * ※出力はSystem.out.printlnにmap変数を指定する
 * 【想定結果】
 * ｛偶数: =[32,6,72,26,48,60,46,74,14
 *  奇数: =[21,3,99,51,1,87,11,29,5,,193,215,83]}
 */
package vrietyArray;

import java.util.ArrayList;

public class task4 {

	public static void main(String[] args) {
		Integer data[] = {21,3,32,6,99,72,51,1,26,87,11,48,60,29,5,46,74,14,193,215,83};//21
		ArrayList odd = new ArrayList();
		ArrayList even = new ArrayList();

		for(int i : data) {
			if(i % 2 == 0) {
				even.add(i);
			}else{
				odd.add(i);
			}
		}
		System.out.println("{偶数: =" + even + "," + "\r\n" +
		"奇数: =" + odd + "}");
	}
}
