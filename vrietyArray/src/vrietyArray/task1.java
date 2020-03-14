/* ArrayListに以下のも列を追加し、
 * 表示するプログラムを作成せよ
 * ・北海道
 * ・東北
 * ・関東
 * ・中部
 * ・近畿
 * ・中国
 * ・九州
 *
 * 【想定結果】
 * ・北海道
 * ・東北
 * ・関東
 * ・中部
 * ・近畿
 * ・中国
 * ・九州
 *
 */
package vrietyArray;

import java.util.ArrayList;

public class task1 {

	public static void main(String[] args) {
		ArrayList<String> prefectures = new ArrayList<>();

		prefectures.add("北海道");
		prefectures.add("東北");
		prefectures.add("関東");
		prefectures.add("中部");
		prefectures.add("近畿");
		prefectures.add("中国");
		prefectures.add("九州");

		for(String pr : prefectures) {
			System.out.println(pr);
		}
	}

}
