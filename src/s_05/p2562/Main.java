package s_05.p2562;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = { scan.nextInt(), scan.nextInt(), scan.nextInt(),
				scan.nextInt(), scan.nextInt(), scan.nextInt(),
				scan.nextInt(), scan.nextInt(), scan.nextInt(), };
		scan.close();
		
		int cnt = 0;
		int max = 0;
		int index = 0;
		
		for (int i = 0; i < 9; i++) {
			cnt++;
			if (arr[i] > max) {
				max = arr[i];
				index = cnt;
			}
		}
		
		System.out.println(max + "\n" + index);
	}
}
