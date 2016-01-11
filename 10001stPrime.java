// Problem 7: 10001st prime

public class LargePrime {
	public static void main(String[] args) {
		int n = 2;
		for(int i = 1; i <= 3; i++) {
			n = nextPrime(n);
		} 
		System.out.println(n);
	}

	public static int nextPrime(int n) {
		int nextPrime = n + 1;
		while (!isPrime(nextPrime)) {
			nextPrime++;
		}
		return nextPrime;
	}

	public static boolean isPrime(int n) {
		if (n <= 1) return false;
		for(int i = 2; i * i < n; i++) {
			if (n % i == 0) return false;
		}
		return true;
	}
}