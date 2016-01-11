// Problem 5: Smallest multiple

public class SmallestMultiple {
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		System.out.println(smallestMultiple(20));
		long endTime = System.nanoTime();
		System.out.println("execution time: " + ((double)(endTime - startTime) / 1000000) + " ms");
	}

	public static int smallestMultiple(int n) {
		int countOfOne = 1, product = 1, factor = 2;
		int[] integers = new int[n];
		for(int i = 0; i < n; i++) {
			integers[i] = i + 1;
		}
		while (countOfOne < n && factor <= n) {
			int count = 0;
			for (int i = 0; i < integers.length; i++) {
				if (integers[i] % factor == 0) {
					if (integers[i] == factor) count++;
					integers[i] /= factor;
				}
			}
			if (count == 0) factor = nextPrime(factor);
			else {
				countOfOne += count;
				product *= factor;
			}
		}
		return product;
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
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) return false;
		}
		return true;
	}
}