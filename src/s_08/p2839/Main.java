package s_08.p2839;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N =  Integer.parseInt(br.readLine());
		
		//시간 복잡도 O(1)의 해답
		
		//3과 5로 구성하지 못하는 수 4, 7
		if (N == 4 || N == 7) {
			
			System.out.println(-1);
			
		}
		
		//N이 5의 배수인 경우
		else if (N % 5 == 0) {
			
			System.out.println(N / 5);
			
		}
		
		//N이 5의 배수 + 1 or 5의 배수 + 3인 경우
		else if (N % 5 == 1 || N % 5 == 3) {
			
			System.out.println((N / 5) + 1);
			
		}
		
		//N이 5의 배수 + 2 or 5의 배수 + 4인 경우
		else if (N % 5 == 2 || N % 5 == 4) {
			
			System.out.println((N / 5) + 2);
			
		}
		
	}
	
}
