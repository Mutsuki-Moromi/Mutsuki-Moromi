/* 以下のキーと値のペアをmapに格納し、
 * 表示させるプログラムを作成せよ
 *
 * キー："りんご", 値:130
 * キー："みかん", 値:120
 * キー："バナナ", 値:98
 * キー："メロン", 値:6000
 *
 * 【想定結果】
 * りんご:130円
 * みかん:120円
 * バナナ:98円
 * メロン:6000円
 */
package vrietyArray;

import java.util.HashMap;

public class task3 {

	public static void main(String[] args) {
		HashMap<String,Integer> price = new HashMap<>();
		price.put("りんご:",130);
		price.put("みかん:",120);
		price.put("バナナ:",98);
		price.put("メロン:",6000);

		char i = '円';
		// 拡張for文を使用
		for(HashMap.Entry<String,Integer> entry : price.entrySet()) {
				System.out.println(entry.getKey() + entry.getValue() + i);
		}

	}

}
