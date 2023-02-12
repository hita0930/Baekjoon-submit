package etc.p1018;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
	
	char[][] arr;
	
	//�Է¹��� ���� �������� ĥ�� ĭ�� ���� ���
	static int paint(char[][] arr, int row, int col) {
		
		int cnt = 0;
		
		for (int r = row; r < row + 8; r++) {
			for (int c = col; c < col + 8; c++) {
				
				//(�� + ��) % 2 ���� ¦���̸� B, Ȧ���̸� W ��ĥ
				//�˻��Ͽ� �ش� ���� �ƴҰ�� ī���� ����
				char ch = (r + c) % 2 == 0? 'B' : 'W';
				if (arr[r][c] != ch) {
					cnt++;
				}
				
			}
		}
		
		/*
		(�� + ��) % 2 ���� ¦���̸� B, Ȧ���̸� W ��ĥ �ؾ��ϴ� ���̽� cnt
		�׷��� �ʰ� �ݴ��� ���̽� 64 - cnt
		�� ���̽��� ���Ͽ� �ּҰ� ����
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
		
		//�� ���̽� �ϳ��� Ȯ��
		//8*8�� �Ǿ�� �ϹǷ� -7�� �����ν� �� 8ĭ ����
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
