package s_07.p11720;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String str = scan.next();
		scan.close();
		
		int result = 0;
		for (int i = 0; i < n; i++) {
			result += str.charAt(i) - '0'; // ���� i �� ���� i�� �ٲٱ����� ����'0'���ִ°�
		}
		System.out.println(result);
		
	}
	
}
