/* 以下のメソッドを作成し、自己紹介文を表示させましょう。
 * クラス名 :Task1
 * メソッド名:main,myProfile
 *
 * 引数:名前(文字列),年齢(数値),身長(浮動小数点)
 *
 * 戻り値:なし
 *
 * 処理:
 * 　名前、年齢、身長を引数で受け取り、右の画面のように
 * 　自己紹介をする。
 *【想定結果】
 *私の名前はコラボです。
 *年齢は30歳です。
 *身長は178.0㎝です。
 *よろしくお願いします。
 */
package method;

public class task1 {

	static String getName() {
		return "コラボ";
	}
	static int getAge() {
		return 30;
	}
	static double getTall() {
		return 178.0;
	}
	public static void main(String[] args) {
		String name = getName();
		int age = getAge();
		double tall = getTall();
			System.out.println("私の名前は"+ name +"です。"+ "\r\n"
					+ "年齢は"+ age + "歳です。" + "\r\n" + "身長は" + tall + "cmです。" + "\r\n"
					+ "よろしくお願いします。");
	}
}
