package chapter03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_10951 {

	public static void main(String[] args) throws IOException {
        
		Plus plus = new Plus();
		plus.init();
		System.out.print(plus.getResult());
		
    }
    
    public static class Plus {
        
        BufferedReader br = null;
        StringBuilder sb = null;
        
        public void init() {
            br = new BufferedReader(new InputStreamReader(System.in));
            sb = new StringBuilder();
        }
        
        public String getResult() throws IOException {
            
            int splitIdx = -1;
            int sum = 0;
            String temp = null;
            
            while((temp = br.readLine()) != null ) {
                splitIdx = temp.indexOf(" ");
                sum = Integer.parseInt(temp.substring(0, splitIdx)) + Integer.parseInt(temp.substring(splitIdx + 1));
                sb.append(sum + "\n");
            }
            
            return sb.toString();
            
        }
        
    }
	
}
