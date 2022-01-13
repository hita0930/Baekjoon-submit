package s_05.p2577;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        scan.close();
        
        int arr[] = new int[10];
        int N = A * B * C;
        int tmp;
        
        while (N > 0) {
        	tmp = N % 10;
        	N = N / 10;
        	for (int i = 0; i < 10; i ++) {
        		if(i == tmp) {
        			arr[i]++;
        		} 
        	}
        }
        
        for (int i = 0; i < 10; i++) {
        	System.out.println(arr[i]);
        }
    }
}