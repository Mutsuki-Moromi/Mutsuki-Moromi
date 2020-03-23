package method;

public class task3 {

	public static void main(String[] args) {
		String prstring1 = getPrString1();
		String prstring2 = getPrString2();
		int print = sum(3,5);
		double prdouble = sum2(1.2,7.8);
		System.out.print("--①文字列だけの場合--" + "\r\n" + prstring1 + prstring2 + "\r\n"
				+ "--②整数だけの場合--" + "\r\n" + print + "\r\n"
				+ "--③少数だけの場合--" + "\r\n" + prdouble);
	}
	static String getPrString1(){
		return "文字列1";
	}
	static String getPrString2(){
		return "文字列2";
	}
	static int sum(int num1,int num2) {
		int intResult = num1 + num2;
		return intResult;
	}
	static double sum2(double num1,double num2) {
		double doubleResult = num1 + num2;
		return doubleResult;
	}
}