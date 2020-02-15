package calk;

public class task4 {

	public static void main(String[] args) {
		int num;
		num = 192837;
		System.out.println("一の位の数を除いた数:" + ( num /= 10 ) );
		num = 192837;  //下記コード前に再度変数定義をしないと上記のnum変数の数字を読み取ってくる、なぜか。
		System.out.println("一の位の数:" + ( num %= 192830 ) );
	}

}
