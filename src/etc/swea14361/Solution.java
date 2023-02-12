package etc.swea14361;

import java.io.*;
 
public class Solution {
 
	static void perm(){
		
	}
	
    public static void main(String args[]) throws Exception{
         
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
         
        for(int test_case = 1; test_case <= T; test_case++) {
         
            int pn = 0;
            String str = br.readLine();
            int N = Integer.parseInt(str);
            int tmp = N;
            int[] arr = new int[str.length()];
             
           
             
             
            if(pn >= N*2) System.out.printf("#%d possible\n", test_case);
            else System.out.printf("#%d impossible\n", test_case);
        }
         
    }
     
}