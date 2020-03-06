package branch;

import java.util.Scanner;

public class task7 {

	public static void main(String[] args) {
		//曜日を標準入力で受け取り、以下のルールに則った分岐処理を実装せよ
		/*月曜～金曜の場合、以下の文字列を出力
		 * “午後診療と午前診療があります”
		 * 土曜の場合、以下の文字列を出力
		 * “土曜は午前診療のみです”
		 * 日曜の場合、以下の文字列を出力
		 * “日曜は休診です”
		 * その他の文字列が入力された場合は以下を出力
		 * “入力を確認してください”
		 */
		System.out.println("病院に行く日を入力してください");
		System.out.println("日曜,月曜,火曜,水曜,木曜,金曜,土曜");

		Scanner str = new Scanner(System.in);
		String day = str.nextLine();
		
		String strl = day;
		switch(day){
			case "月曜":
			case "火曜":
			case "水曜":
			case "木曜":
			case "金曜":
				System.out.println("午後診療と午前診療があります");
				break;
			case "土曜":
				System.out.println("土曜は午前診療のみです");
				break;
			case "日曜":
				System.out.println("日曜は休診です");
				break;
		}
	}
}
