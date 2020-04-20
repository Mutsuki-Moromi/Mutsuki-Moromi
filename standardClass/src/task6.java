import java.text.SimpleDateFormat;
import java.util.Date;

/* 現在日時を取得し表示させるプログラムを作成せよ
 * ただし、以下のルールに従うこと。
 * 【ルール】
 * 表示形式は以下の2種類
 * ○○○○年○○月○○日
 * ○○○○年○○月○○日○○時○○分
 */
public class task6 {

	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日HH時mm分");

		System.out.println(sdf1.format(now));
		System.out.println(sdf2.format(now));
	}

}
