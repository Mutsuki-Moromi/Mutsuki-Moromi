
public class task3 {

	public static void main(String[] args) {
		String str = "ABCDEFG";
				System.out.println("文字列:" + str);

		for(int i = str.length()-1; i >= 0; i--) {
			char strReverse = str.charAt(i);
				System.out.print(strReverse);
			if(i <= 0) {
				System.out.print(":列字文");
			}
		}
	}
}
