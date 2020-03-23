/* 以下のクラスを作成してください。
 * クラスのアクセス制限は「public」とする。
 * クラス名：public
 * 処理：名前の情報を保持する、「name」
 * 年齢情報を保持する「age」フィールドを持つ。
 * フィールドのアクセス修飾子は記載なしとする。
 */
package instance;

public class Person {

	public String name = null;
	public int age = 0;
	
	public void myProfile() {
	System.out.println("私の名前は" + this.name + "です。");
	System.out.println("年齢は" + this.age + "です。");
	System.out.println("よろしくお願いします。");
	}

}
