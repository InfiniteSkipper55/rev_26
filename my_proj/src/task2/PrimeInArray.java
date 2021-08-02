package task2;


import java.util.Scanner;

public class PrimeInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int a[] = new int[n];
		System.out.println("Enter " + n + " elements: ");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if(isPrime(a[i])) {
				System.out.println(a[i]);
			}
		}

	}
	
	public static boolean isPrime(int a) {
		if(a <= 1) {
			return false;
		}
		for(int i = 2; i <= a/2; i++) {
			if((a % i) == 0)
				return false;
		}
		return true;
	}

}
