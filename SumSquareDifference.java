// Problem 6: Sum square difference

public class SumSquareDifference {
	public static void main(String[] args) {
		System.out.println(sumSquareDifference(100));
	}

	public static int sumSquareDifference(int n) {
		int sumOfSquare = 0, squareOfSum = 0;
		for (int i = 1; i <= n; i++) {
			sumOfSquare += i * i;
			squareOfSum += i;
		}
		squareOfSum *= squareOfSum;
		return Math.abs(sumOfSquare - squareOfSum);
	}
}