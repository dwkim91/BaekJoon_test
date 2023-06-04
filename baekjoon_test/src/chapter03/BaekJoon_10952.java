package chapter03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_10952 {
	
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
        }
           
        public String getResult() throws IOException {
            sb = new StringBuilder();
            boolean isZero = false;
            int splitIdx = 0;
            int sum = 0;
            while(!isZero) {
                String temp = br.readLine();
                splitIdx = temp.indexOf(" ");
                sum = Integer.parseInt(temp.substring(0, splitIdx)) + Integer.parseInt(temp.substring(splitIdx + 1));
                if(sum == 0) {
                	isZero = true;
                	br.close();
                	continue;
                }
                sb.append(sum).append("\n");
                
            }
            return sb.toString();
        }
        
    }
	
}
