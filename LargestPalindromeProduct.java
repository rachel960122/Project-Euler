// Problem 4: Largest palindrome product

public class LargestPalindromeProduct {
	public static void main(String[] args) {
		System.out.println(largestPalindromeProduct(3));
	}

	public static int largestPalindromeProduct(int numOfDigits) {
		int i = (int)Math.pow(10, numOfDigits) - 1;
		int max = 0;
		for(; i > 100; i--) {
			for(int j = i; j > 100; j--) {
				int product = i * j;
				if (isPalindrome(product) && product > max) {
					max = product;
				}
			}
		}
		return max;
	}

	public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int div = 1;
        while (x / div >= 10) {
        	div *= 10;
        }
        while (x != 0) {
        	int l = x / div;
        	int r = x % 10;
        	if (l != r) return false;
        	x = (x % div) / 10;
        	div /= 100;
        }
        return true;
	}

}
