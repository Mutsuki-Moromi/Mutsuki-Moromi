import java.text.SimpleDateFormat;
import java.util.Date;

/*　現在日時を取得し1週間後、1年後の日付を表示させるプログラムを作成せよ
 * ただし以下のルールに従うこと。
 * 
 * 【ルール】
 * ・1週間後の日付はaddメソッドを使って取得すること
 * ・1年後の日付はsetメソッドを使って設定すること
 * ・1年後の日付を表示させるときは、その曜日も表示させること
 * ・表示形式は○○○○年○○月○○日にすること
 * ・1年後の場合は○○○○年○○月○○日(曜日)
 */
public class task7 {

	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println("現在日時: " + sdf1.format(now));

		
	}

}
