package my_pack;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter array elements: ");
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Array elements are " + Arrays.toString(a));
	}

}