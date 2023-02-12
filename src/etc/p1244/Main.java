package etc.p1244;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N + 1];		
		
		StringTokenizer str = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(str.nextToken());
		}
		
		int stuNum = Integer.parseInt(br.readLine());
		int[][] stuArr = new int[stuNum][2];
		
		for (int i = 0; i < stuNum; i++) {
			
			StringTokenizer str2 = new StringTokenizer(br.readLine());
			stuArr[i][0] = Integer.parseInt(str2.nextToken()); //����
			stuArr[i][1] = Integer.parseInt(str2.nextToken()); //���� ��
			
		}
		
		//����ġ ��ȯ
		for (int i = 0; i < stuNum; i++) {
			
			//���л��� ���, ���� ���� ����� �ش��ϴ� ���ڸ� �ٲ�
			if(stuArr[i][0] == 1) {
				
				for (int j = 1; j <= N; j++) {
					
					if(j >= (stuArr[i][1]) && j % (stuArr[i][1]) == 0) {
						arr[j] = (arr[j] == 0) ? 1 : 0;
					}
					
				}
				
			}
			
			//���л��� ���, ���� ���� �߽����� �¿� ��Ī�̸� ���� ���� ����ġ�� �����ϴ� ���� ���θ� �ٲ�
			else if(stuArr[i][0] == 2) {
				
				for (int j = 1; j <= N; j++) {
					
				}
				
			}
			
		}
		
		for(int i = 1; i <= N; i++) {
			if(i != 1 && i % 20 == 0) {
				sb.append(arr[i]).append('\n');
			}
			sb.append(arr[i]).append(" ");
		}
		
		System.out.println(sb);
		
	}
	
}
