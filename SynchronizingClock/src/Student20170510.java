import java.util.Scanner;


public class Student20170510 {

	private static int minCount = Integer.MAX_VALUE;
	private static int[][] switches = new int[10][];

	private static int totalSwitchCount (int[] bucket) {
		int total = 0;
		for (int count: bucket) {
			total += count;
		}
		return total;
	}

	private static boolean check(int[] clocks) {
		for(int i = 0; i < 16; i++) {
				if (clocks[i] % 12 != 0)
						return false;
			}
		return true;
	}
	
	private static void push (int[]clocks, int switchNum, int[] bucket) {
		for (int i = 0; i < switches[switchNum].length; i++) {
			clocks[switches[switchNum][i]] += (3 * bucket[switchNum]);
		}
	}

	private static void undo (int[]clocks, int switchNum, int[] bucket) {
		for (int i = 0; i < switches[switchNum].length; i++) {
			clocks[switches[switchNum][i]] -= (3 * bucket[switchNum]);
		}
	}
	
	private static void moveClock(int switchNum, int[] clocks, int[] bucket) {
		if(switchNum == 10) {
			boolean check = check(clocks);
			int count = totalSwitchCount(bucket);
			
			if (check) {
					if (minCount > count) minCount = count;
				}
			return;
		}
		
		for (int i = 0; i < 4; i++) {
			bucket[switchNum] = i;
			push(clocks, switchNum, bucket);
			moveClock(switchNum + 1, clocks, bucket);
			undo(clocks, switchNum, bucket);
		}
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			int index = sc.nextInt();
			int num = sc.nextInt();
			switches[index] = new int[num];
			for (int j = 0; j < num; j++)
				switches[index][j] = sc.nextInt();
		}

		int[] clocks = new int[16];
		for(int i = 0; i < 16; i++) {
			clocks[i] = sc.nextInt();
		}
		int[] bucket = new int[10];

		moveClock(0, clocks, bucket);
		System.out.println(minCount);
		sc.close();
	}

}