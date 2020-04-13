
public class Task5 {

	public static void main(String[] args) {
		String str = "cat_mouse_mouse_cat_cat";
		String[] strAry = str.split("_"); //_を抜いて,配列に変換

		//strAry={cat,mouse,mouse,cat,cat}の状態
		String cat = "cat";
		String mouse = "mouse";
		int count = 0;
		int countB = 0;

		//strAryの要素を０から４まで順番に回し、比較。重なるwordがいくつあるか確認
		for(String judge : strAry) {
			if(judge.equals(cat)) {
				count++;
			}else if(judge.equals(mouse)) {
				countB++;
			}	
		}
			if(count > countB) {
				System.out.println("catの方が多い");
			}else{
				System.out.println("mouseの方が多い");
			}
	}
}
