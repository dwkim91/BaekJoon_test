package chapter03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_15552 {

	public static void main(String[] args) throws Exception {
        
        Plus plus = new Plus();
        plus.init();
        System.out.print(plus.calcLines(plus.getLineNum()));
        
    }
    
    public static class Plus {
        
        BufferedReader br = null;
        int lineNum = 0;
        StringBuilder sb = null;
        
        public void init() throws Exception {
            br = new BufferedReader(new InputStreamReader(System.in));
            lineNum = Integer.parseInt(br.readLine());
        }
        
        public int getLineNum(){
            return this.lineNum;
        }
        
        public String calcLines (int lineNum) throws Exception {
            sb = new StringBuilder(); 
            for (int i = 0; i < lineNum; i++) {
                String[] temp = br.readLine().split(" ");
                int sum = Integer.parseInt(temp[0]) + Integer.parseInt(temp[1]);
                sb.append(sum + "\n");
                temp = null;
                
            }
            br.close();
            return sb.toString();
        }
        
    }
	
}
