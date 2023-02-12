package s_10.p2751;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int N = Integer.parseInt(br.readLine());
	    
	    StringBuilder sb = new StringBuilder();
		
	    ArrayList<Integer> list = new ArrayList<>();
	    
	    for(int i = 0; i < N; i++) {
	      list.add(Integer.parseInt(br.readLine()));
	    }
		
	    Collections.sort(list);

	    for(int value : list) {
	      sb.append(value).append('\n');
	    }
	    
	    System.out.println(sb);
	    
	}
	
}
