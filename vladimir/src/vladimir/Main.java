package vladimir;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
//	public static void main(String[] args) {
//
//		int n[] = {10000, 100000, 200000, 400000, 800000, 1600000, 
//				3200000, 6400000};
//		
//		
//		for(int num : n)
//		{
//			int[] arr = new int[num];
//			Random r = new Random();
////			for (int i = 0; i < num ; i++) {
////				arr[i] = r.nextInt(num * 2);
////			}
////			
////			
////			long qBTime = System.currentTimeMillis(); 
////			QuickSort qs = new QuickSort();
////			qs.quickSort(arr, 0, num - 1);
////			long qATime = System.currentTimeMillis();
////			
//			for (int i = 0; i < num ; i++) {
//				arr[i] = r.nextInt(num * 2);
//			}
//			
//			long dqBTime = System.currentTimeMillis(); 
//			DualPivotQuickSort dqs = new DualPivotQuickSort();
//			dqs.dualPivotQuickSort(arr, 0, num - 1);
//			long dqATime = System.currentTimeMillis();
//			
////			long qT = (qATime - qBTime);
//			long dqT = (dqATime - dqBTime);
//			
//			System.out.println("n = " + num);
////			System.out.println("quick: " + qT);
//			System.out.println("dual: " + dqT);
//			System.out.println("-----------------");
//		}
//	}
	
	public static void main (String[] args) {
		
		int num = 10;
		int[] arr = new int[num];
		Random r = new Random();
		for (int i = 0; i < num ; i++) {
			arr[i] = r.nextInt(num * 2);
		}
		for (int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println("\n정렬");
		
		IntroSort i = new IntroSort();
		i.sort(arr);
		
		for (int n : arr) {
			System.out.print(n + " ");
		}
	}
}
