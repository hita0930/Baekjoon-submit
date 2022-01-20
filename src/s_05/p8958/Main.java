package s_05.p8958;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		String arr[] = new String[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = scan.next();
		}
		
		scan.close();
		
		for (int i = 0; i < N; i++) {
			int cnt = 0;
			int sum = 0;
			for (int j = 0; j < arr[i].length(); j++) {
				if (arr[i].charAt(j) == 'O') {
					cnt++;
				}
				else {
					cnt = 0;
				}
				sum += cnt;
			}
			
			System.out.println(sum);
		}		
	}
}
