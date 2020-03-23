/* 「Task2」クラスを作成して、以下の処理を実装してください。
 * 処理：
 * 課題１で作成した「Person」クラスのインスタンスを
 * 生成して「Person」クラスの
 * 「name」フィールドに「自分の名前」
 * 「age」フィールドに「自分の年齢」を設定する。
 */
package instance;

public class Task2 {

	public static void main(String[] args) {
	 //インスタンスの生成
	Person sato = new Person();
	
	//生成したインスタンスのフィールドに値を設定
	sato.name = "佐藤 一郎";
	sato.age = 30;
	
	}

}
