package vladimir;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 10;
		
		int[] arr = new int[n];
		Random r = new Random();
		for (int i = 0; i < n ; i++) {
			arr[i] = r.nextInt(n);
		}
		
		System.out.print("[");
		for (int a : arr) {
			System.out.print(a + ", ");
		}
		System.out.print("]");
		
		QuickSort qs = new QuickSort();
		qs.quickSort(arr, 0, n - 1);
		
		System.out.print("[");
		for (int a : arr) {
			System.out.print(a + ", ");
		}
		System.out.print("]");
		
		sc.close();
	}
}