package etc.swea1859;

import java.io.*;
import java.util.StringTokenizer;

public class Solution {

	public static void main(String args[]) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[N];
			int num = 0;
			long max = Long.MIN_VALUE; //int ����� �����÷ο� ���ɼ������� long Ÿ�� ����
			long cost = 0;
			long sum = 0;
			
			StringTokenizer st = new StringTokenizer(br.readLine());			
			for(int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			/*
			 * �迭 �������� Ž��
			 * 
			 */
			for (int i = N - 1; i >= 0; i--) {
				//�ִ밪�� ã���� ��� �Ǹ�
				if(arr[i] > max) {
					sum += (max * num - cost);
					max = arr[i];
					cost = 0;
					num = 0;
				}
				//�ִ밪���� ���� ��� ����
				else {
					cost += arr[i];
					num++;
				}
			}
			
			//������ ��� �߰�
			sum += (max * num - cost);
			
			System.out.printf("#%d %d\n", test_case, sum);
			
		}
	}
	
}
