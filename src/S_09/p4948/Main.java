package S_09.p4948;

import java.io.*;


public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean[] prime = new boolean[246913];
		
		prime[0] = true;
		prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
		//�����佺�׳׽��� ü	, k = 2���� N�� ��Ʈ ���ϱ��� �ݺ��Ͽ� �ڿ����� �� K�� ������ K�� ������� ���ܽ�Ų��.
			if(prime[i]) {
				continue;
			}
			
			for(int j = i * i; j < prime.length; j = j + i) {
			//i�� ��� ����
				prime[j] = true;
			}
			
		}
		
		while(true) {
			
			int N = Integer.parseInt(br.readLine());
			
			if(N == 0) {
				break;
			}
			
			int cnt = 0;
				
			for(int i = N + 1; i<= 2 * N; i++) {
				if(prime[i] == false) {
					cnt++;
				}
			}
			
			System.out.println(cnt);
			
		}
		
	}
	
}
