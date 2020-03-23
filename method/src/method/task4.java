package method;

import java.util.Arrays;

public class task4 {

	public static void main(String[] args) {
	     String[] array = { "a", "b", "c" };
	     String[] array2 = {"a", "null", "c"};
	     System.out.println("--配列にnullがない場合--");
	     boolean shingi = nullcheck(array);
	     System.out.println(shingi);
	     System.out.println("--配列にnullがある場合--");
	     boolean shingi2 = nullcheck(array2);
	     System.out.println(shingi2);



	}
	    	private static boolean nullcheck(String[] array) {//ヌルチェックは2回

				if(Arrays.asList(array).contains("null")){
	                   return true;
	              }else{
	                   return false;
	              }
	    	}
}

