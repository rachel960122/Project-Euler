// Problem 2: Even Fibonacci numbers

public class EvenFibo {
	public static void main(String[] args) {
		System.out.println(evenFibo());
	}

	public static int evenFibo() {
		int first = 1, second = 2, sum = 2;
		int temp;

		while (second <= 4000000) {
			temp = second;
			second = first + second;
			first = temp;

			if (second % 2 == 0) {
				sum += second;
			}
		}
		return sum;
	}
}