package S_09.p9020;

import java.io.*;

public class Main {
	
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		boolean[] prime = new boolean[10001];
		
		prime[0] = true;
		prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
		//�����佺�׳׽��� ü	, k = 2���� N�� ��Ʈ ���ϱ��� �ݺ��Ͽ� �ڿ����� �� K�� ������ K�� ������� ���ܽ�Ų��.
			if(prime[i]) {
				continue;
			}
			
			for(int j = i * i; j < prime.length; j = j + i) {
			//i�� ��� ����
				prime[j] = true; //�Ҽ��� false
			}
			
		}
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			
			int n = Integer.parseInt(br.readLine());
			
			//��Ƽ�� ������ ������ ������ ���� ������ ���ҽ�Ű�� �Ҽ����� Ȯ��
			int p1 = n / 2;
			int p2 = n / 2;
			
			while(true) {
				if(prime[p1] == false && prime[p2] == false) {
					sb.append(p1 + " " + p2).append("\n");
					break;
				}
				p1--;
				p2++;
			}
			
		}
		
		System.out.println(sb);
		
	}
	
}
