package practice;

public class practice1 {

	public static void main(String[] args) {
		// 標準入力で２つの正の数を受け取り、以下の分岐を行うプログラムを作成せよ
		//最初に受け取った正の数をnumA、2番目に受け取った正の数をnumBとする
		//numBがnumAの約数の場合、『numBがnumAの約数です』
		//numBがnumAの約数出ない場合、『numBはnumAの約数ではありません』
		//正の数以外が入力された場合、『正の数を入力して下さい』

		int a = 26, b = 61, diff = 0;
		if(a > b) {
		System.out.println("a > b");
		diff = a - b;
		System.out.println("aとbの差："+ diff);
		}else if(a < b)	{
			System.out.println("a < b");
			diff = b - a;
			System.out.println("aとbの差:"+ diff);
		}else{
			System.out.println("a == b");
			System.out.println("aとbの差:0");
			
			}
		
		Scanner num1 =
		}
	}
	
//約数＝割り切れる数のこと。余りが『0』ならば…というロジックで組み立てること。

