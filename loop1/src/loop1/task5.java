package loop1;

/*想定結果を参考に九九の表を作成せよ
 * ※半角スペースがポイント
 * ""(半角スペース1)や“”(半角スペース2)
 */


public class task5 {

	public static void main(String[] args) {
		for(int i = 1;i <= 9;i++) {
			for(int r = 1;r <= 9;r++) {
				System.out.print(i*r+" ");
			}
				System.out.println();
		}

	}

}
