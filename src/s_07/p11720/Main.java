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
			result += str.charAt(i) - '0'; // 문자 i 를 숫자 i로 바꾸기위해 문자'0'빼주는것
		}
		System.out.println(result);
		
	}
	
}
