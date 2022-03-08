package s_06.p1065;

import java.util.Scanner;

public class Main {
	
	public static int hs(int n) {
		//각 자릿수를 검사하고 한수인지 확인하는 프로그램
		int cnt = 0; // 한수 개수 카운터
		
		if (n < 100) { // 99이하의 수는 자체적으로 등차수열
			return n; 
		}
		
		else { // 100이상의 케이스
			
			cnt += 99;
			if(n == 1000) { // 1000은 한수에 포함되지 않음
				n = 999;
			}
			
			for(int i = 100; i <= n; i++) { //각 자릿수 구하기
				int a = i % 10; // 일의 자릿수
				int b = (i / 10) % 10; // 십의 자릿수
				int c = i / 100; // 백의 자릿수
				
				if ((c - b) == (b - a)){ //각 자릿수간 등차값 구해 한수인지 확인
					cnt++;
				}
			}
			
			
		}
		
		return cnt;
		
	}
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		System.out.println(hs(N));
		
		scan.close();
	}
	
}
