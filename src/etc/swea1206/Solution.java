package etc.swea1206;

import java.io.*;
import java.util.StringTokenizer;


public class Solution {

	public static void main(String args[]) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = 10;
		
		for (int test_case = 1; test_case <= T; test_case++) {			
			int N = Integer.parseInt(br.readLine()); //�ǹ��� ����
			int [][] arr = new int [N][255];
			int cnt = 0;
			
			//�ǹ� �Է�
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < N; i++) {
				int height = Integer.parseInt(st.nextToken());
				for(int j = 0; j < height; j++) {
					arr[i][j]++;
				}
			}
			
			//Ž��
			for(int i = 2; i < arr.length - 2; i++) { //�¿� 2ĭ�� 00�̹Ƿ� Ž������ ����
				for(int j = 0; j < arr[i].length; j++) {
					//���밡 �ִ��� Ȯ�� �ϱ� ���� arr[i][j] == 1, �� �� �¿� 2ĭ�� Ȯ��
					if(arr[i][j] == 1 && arr[i - 2][j] == 0 && arr[i - 1][j] == 0 && arr[i + 1][j] == 0 && arr[i + 2][j] == 0) cnt++;
				}
			}
			
			System.out.printf("#%d %d\n", test_case, cnt);
		}
		
	}
	
}
