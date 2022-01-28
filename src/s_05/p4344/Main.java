package s_05.p4344;

import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int C = scan.nextInt(); // 테스트 케이스의 개수 C
		int[] arr; // 배열 초기화
		
		for (int i = 0; i < C; i++) {
			
			int N = scan.nextInt(); // 각 테스트 케이스의 학생수
			arr = new int[N]; // 학생 수 만큼 배열 생성
			double sum = 0; // 합계
			
			for (int j = 0; j < N; j++) {
				int score = scan.nextInt(); // 각 학생의 점수 입력
				arr[j] = score; // 점수 배열에 저장
				sum += score; // 점수 합에 저장
			}
			
			double avg = sum/N;
			int cnt = 0;
			
			for (int j = 0; j < N; j++) {
				if(arr[j] > avg) {
					cnt++;
				}
			}
			double std = (double)cnt/N*100;
			
			System.out.printf("%.3f%%\n", std);
			
		}
		
		scan.close();
		
	}
}
