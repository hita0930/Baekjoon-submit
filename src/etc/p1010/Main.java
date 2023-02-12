package etc.p1010;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
	
	static Integer[][] DP = new Integer[30][30];
	
	//완전탐색, DP
	static int DFS(int n, int m) {
		
		//건설해야할 다리가 더이상 없음, 건설 성공
		if (n == 0) {
			return DP[n][m] = 1;
		}
		
		//건설해야 할 다리가 남았는데, 건너편 사이트(m)가 없음, 건설실패
		if (m == 0) {
			return DP[n][m] = 0;
		}
		
		if (DP[n][m] != null) {
			return DP[n][m];
		}
		
		//현재 사이트에 다리를 건설 안하는 경우의 수 + 현재 사이트에 다리 건설 하는 경우의 수
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
