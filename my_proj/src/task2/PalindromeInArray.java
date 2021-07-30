package task2;

public class PalindromeInArray {

	public static void main(String[] args) {
		int a[]= {121, 525, 636, 562, 451, 858};
		
		isPal(a);

	}
	
	public static void isPal(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if(a[i] == reverse(a[i])) {
				System.out.println(a[i]);
			}
		}
	}
	
	public static int reverse(int n)
    {
        int rev = 0;
        while (n > 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }
        return rev;
    }

}
