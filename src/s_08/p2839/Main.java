package s_08.p2839;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N =  Integer.parseInt(br.readLine());
		
		//�ð� ���⵵ O(1)�� �ش�
		
		//3�� 5�� �������� ���ϴ� �� 4, 7
		if (N == 4 || N == 7) {
			
			System.out.println(-1);
			
		}
		
		//N�� 5�� ����� ���
		else if (N % 5 == 0) {
			
			System.out.println(N / 5);
			
		}
		
		//N�� 5�� ��� + 1 or 5�� ��� + 3�� ���
		else if (N % 5 == 1 || N % 5 == 3) {
			
			System.out.println((N / 5) + 1);
			
		}
		
		//N�� 5�� ��� + 2 or 5�� ��� + 4�� ���
		else if (N % 5 == 2 || N % 5 == 4) {
			
			System.out.println((N / 5) + 2);
			
		}
		
	}
	
}
