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
		//에라토스테네스의 체	, k = 2부터 N의 루트 이하까지 반복하여 자연수들 중 K를 제외한 K의 배수들을 제외시킨다.
			if(prime[i]) {
				continue;
			}
			
			for(int j = i * i; j < prime.length; j = j + i) {
			//i의 배수 제거
				prime[j] = true; //소수가 false
			}
			
		}
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			
			int n = Integer.parseInt(br.readLine());
			
			//파티션 반으로 나누어 한쪽은 증가 한쪽은 감소시키며 소수인지 확인
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
