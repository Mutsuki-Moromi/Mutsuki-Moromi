/* 【要件】
 * メソッド：main
 *
 * 整数10,12,13の合計と平均を求めよ
 *
 * 【ルール】
 * ・平均を求める際、以下のパターンを出力すること
 * ・割る数に3を指定したパターン
 * ・割る数に3.0を指定したパターン
 *
 */
package calk;

public class task2 {

	public static void main(String[] args) {
		int numTen = 10;
		int numTwelve = 12;
		int numThirteen = 13;
        int total = ( numTen + numTwelve + numThirteen );
        System.out.println("合計: " + total );

        int average = ( ( numTen + numTwelve + numThirteen ) / 3);
        System.out.println("平均(3で割った時): " + average );

        double doubleAverage = ( ( numTen + numTwelve + numThirteen ) / 3.0);
        System.out.println("平均(3.0で割った時): " + doubleAverage );

	}

}
