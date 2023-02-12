package etc.p1018;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
	
	char[][] arr;
	
	//입력받은 곳을 시작으로 칠할 칸의 개수 계산
	static int paint(char[][] arr, int row, int col) {
		
		int cnt = 0;
		
		for (int r = row; r < row + 8; r++) {
			for (int c = col; c < col + 8; c++) {
				
				//(행 + 열) % 2 값이 짝수이면 B, 홀수이면 W 색칠
				//검사하여 해당 색이 아닐경우 카운터 증가
				char ch = (r + c) % 2 == 0? 'B' : 'W';
				if (arr[r][c] != ch) {
					cnt++;
				}
				
			}
		}
		
		/*
		(행 + 열) % 2 값이 짝수이면 B, 홀수이면 W 색칠 해야하는 케이스 cnt
		그렇지 않고 반대의 케이스 64 - cnt
		두 케이스를 비교하여 최소값 리턴
		*/
		return Math.min(cnt, 64 - cnt);
		
	}
	
	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer str = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(str.nextToken());
		int M = Integer.parseInt(str.nextToken());
		
		char[][] arr = new char[N][];
		
		for (int i = 0; i < N; i++) {
			arr[i] = br.readLine().toCharArray();
		}
		
		int min = 64;
		
		//각 케이스 하나씩 확인
		//8*8이 되어야 하므로 -7을 함으로써 각 8칸 보장
		for(int r = 0; r < N - 7; r++) {
			for (int c = 0; c < M - 7; c++) {
				
				int cnt = paint(arr, r, c);
				
				if (cnt < min) {
					min = cnt;
				}
				
			}
		}
		
		System.out.println(min);
		
	}
	
}
