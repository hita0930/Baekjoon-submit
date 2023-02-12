package etc.p1003;

import java.io.*;

public class Main {

	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			
			int N = Integer.parseInt(br.readLine());
			
			fibonacci(N);
			
		}
		
	}
	
	static void fibonacci(int n) {
		//������ ���� �����ϱ� ���� �迭
		int[] cnt0 = new int[Math.max(2, n+1)];
		int[] cnt1 = new int[Math.max(2, n+1)];
		//����� ���� �ʱⰪ ����
		cnt0[0] = 1;
		cnt0[1] = 0;
		cnt1[0] = 0;
		cnt1[1] = 1;
		//��ø ����
		for (int i = 2; i <= n; i++) {
			cnt0[i] = cnt0[i - 1] + cnt0[i - 2];
			cnt1[i] = cnt1[i - 1] + cnt1[i - 2];
		}
		
		System.out.printf("%d %d\n", cnt0[n], cnt1[n]);
		
	}
	
}
