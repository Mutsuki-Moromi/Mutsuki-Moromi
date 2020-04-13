import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		String str = "ABCDGOPQRSYZ";
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		System.out.println("探したい文字:" + word);

		if(str.indexOf(word) >= 0) {
			System.out.println(str + "は" + word + "を含む");
		}else{
			System.out.println(str + "は" + word + "を含まない");
		}
	}

}
