// Problem 3: Largest prime factor

public class LargestPrimeFactor {
	public static void main(String[] args) {
		System.out.println(largestPrimeFactor(600851475143L));
	}

	public static long largestPrimeFactor(long n) {
		long num = n, limit = n, factor = 2;
		while (factor <= limit) {
			if (isPrime(factor) && (num % factor == 0)) {
				limit = limit / factor;
			}
			factor++;
		}
		return factor-1;
	}

	public static boolean isPrime(long n) {
		if (n <= 1) return false;
		for (int i = 2; i * i < n; i++) {
			if (n % i == 0) return false;
		}
		return true;
	}
}