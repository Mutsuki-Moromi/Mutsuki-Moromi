package method;

public class task2 {

	public static void main(String[] args) {
		double answer = getTriangleArea(135.0,2);
		System.out.print("三角形の面積" + "\r\n" + answer);
	}
	static double getTriangleArea(double num1, double num2) {
		double calkResult = ((num1 * num2) / 2);
		return calkResult;
	}
}
