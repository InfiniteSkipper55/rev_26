package task2;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements to insert: ");
		int n = Integer.parseInt(sc.next());
		int a[] = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		RemoveDup(a, n);
		System.out.println("\nElements are after removing duplicates: ");
		System.out.println(Arrays.toString(a));
	}
	
	public static int RemoveDup(int a[], int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		int p = 0;
		for (int i = 0; i < n-1; i++) {
			if(a[i] != a[i+1]) {
				a[p++] = a[i];
			}
		}
		a[p++] = a[n-1];
		return p;
	}

}
