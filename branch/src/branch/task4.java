
		// 標準入力で２つの正の数を受け取り、以下の分岐を行うプログラムを作成せよ
		//最初に受け取った正の数をnumA、2番目に受け取った正の数をnumBとする
		//numBがnumAの約数の場合、『numBがnumAの約数です』
		//numBがnumAの約数出ない場合、『numBはnumAの約数ではありません』
		//正の数以外が入力された場合、『正の数を入力して下さい』
		//numAとnumBの標準入力を始めますというメソッド
		//AかBかどちらかがTureの場合True。Aが0以上、もしくはBが0以上であればTure
		//もし、numA÷numBの余りが0と等しければTureで約数。
		//しかし、numA÷numBの余りが0で無ければForseで約数ではない。
		//約数＝割り切れる数のこと。余りが『0』ならば…というロジックで組み立てること。
package branch;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numA = sc.nextInt();
		int numB = sc.nextInt();

	    if(numA <= 0 || numB <= 0){
	    	System.out.println("正の数を入力してください");
		}else if((numA % numB) == 0) {
			System.out.print(numB + "は" + numA + "の約数です。");
		}else {
			System.out.println(numB + "は" + numA + "の約数ではありません");
		}
	    sc.close();
	}
}