
public class task5a {

	public static void main(String[] args) {
		String str = "cat_mouse_mouse_cat_cat";
		animals(str);

	}
	public static void animals(String str) {
		String[] strAry = str.split("_");
		String cat = "cat";
		String mouse = "mouse";
		int count = 0;
		int countB = 0;
		for(String judge : strAry) {
			if(judge.equals(cat)) {
				count++;
			}else if(judge.equals(mouse)) {
				countB++;
			}
		}
			if(count > countB) {
				System.out.println("catの方が多い");
				return;
			}else{
				System.out.println("mouseの方が多い");
				return;
			}
	}

}
