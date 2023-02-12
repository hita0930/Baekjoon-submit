package etc.p1010;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
	
	static Integer[][] DP = new Integer[30][30];
	
	//����Ž��, DP
	static int DFS(int n, int m) {
		
		//�Ǽ��ؾ��� �ٸ��� ���̻� ����, �Ǽ� ����
		if (n == 0) {
			return DP[n][m] = 1;
		}
		
		//�Ǽ��ؾ� �� �ٸ��� ���Ҵµ�, �ǳ��� ����Ʈ(m)�� ����, �Ǽ�����
		if (m == 0) {
			return DP[n][m] = 0;
		}
		
		if (DP[n][m] != null) {
			return DP[n][m];
		}
		
		//���� ����Ʈ�� �ٸ��� �Ǽ� ���ϴ� ����� �� + ���� ����Ʈ�� �ٸ� �Ǽ� �ϴ� ����� ��
		return DP[n][m] = DFS(n, m - 1) + DFS(n - 1, m - 1);
		
	}
	
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < T; i++) {
			
			StringTokenizer str = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(str.nextToken());
			int M = Integer.parseInt(str.nextToken());
			
			DFS(N, M);
			
			sb.append(DP[N][M]).append('\n');
			
		}
		
		System.out.println(sb);
		
	}
	
}
