package task2;

import java.util.Arrays;

public class NthMaxArray {

	public static void main(String[] args) {
		int a[]= {12,33,11,23,4,11,12,11,12,11};
		int n = 10;
		Arrays.sort(a);
		System.out.println(a[n-1]);
		

	}

}
