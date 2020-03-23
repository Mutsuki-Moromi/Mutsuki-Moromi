/* クラス名：Task3
 * 処理：
 * 右記の「Person」クラスの「myProfile」メソッドを
 * 「Task3」で呼び出してください。
 * ただし、「name」「age」には自分の名前と年齢が
 * 設定されていること
 */
package instance;


public class Task3 {
	public static void main(String[] args) {
		Person moromi = new Person();
		moromi.name = "諸見 夢月";
		moromi.age = 25;
		moromi.myProfile();
	}

}
