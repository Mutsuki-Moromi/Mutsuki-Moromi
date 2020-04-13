/* 【要件】
 * メソッド：main
 *
 * 1.次の計算式の結果は20である
 * (3+2*6+5)
 * 適切な箇所に括弧を書き加えて計算結果を35にせよ
 * (式を変えてはならない)
 *
 * 2．25を3で割った時の商と余りを出力せよ
 *
 * 【注意点】
 * ・出力の死からは想定結果を参考にすること
 * ・変数は用いないこと
 */

package calk;

public class task1 {

	public static void main(String[] args) {
		System.out.println("修正前:"+ " " + ( 3 + 2 * 6 + 5) ) ;
		System.out.println("修正後:"+ " " + (( 3 + 2 ) * 6 +  5 ) ) ;
		System.out.println("25/3の商" + (25 / 3) + " " + ": 余り" + (25 % 3) );
	}
}
