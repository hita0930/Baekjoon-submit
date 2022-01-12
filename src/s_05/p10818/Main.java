package s_05.p10818;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int arr[] = new int[N];
        int max = -1000001;
        int min = 1000001;
        
        for (int i = 0; i < N; i++){
            arr[i] = scan.nextInt();
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }
        scan.close();
        
        System.out.println(min + " " + max);
    }
}
