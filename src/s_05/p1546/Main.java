package s_05.p1546;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		float M = 0;
		float sum = 0;
		float avg = 0;
		
		float[] arr = new float[N];
		for (int i = 0; i < N; i++) {
			arr[i] = scan.nextFloat();
			if (arr[i] > M) {
				M = arr[i];
			}
		}
		scan.close();
		
		for (int i = 0; i < N; i++) {
			arr[i] = arr[i] / M * 100;
			sum += arr[i];
		}
		avg = sum/N;
		System.out.println(avg);
	}
}
