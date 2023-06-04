package chapter03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon_11021 {

	public static void main(String[] args) throws Exception {
        
        Plus plus = new Plus();
        plus.init();
        System.out.print(plus.clacReadLine(plus.getLineNum()));
        
    }
    
    public static class Plus {
        
        BufferedReader br = null;
        int lineNum = 0;
        StringBuilder sb = null;
        
        public void init() throws Exception {
            br = new BufferedReader(new InputStreamReader(System.in));
            lineNum = Integer.parseInt(br.readLine());
        }
        
        public int getLineNum() {
            return this.lineNum;
        }
        
        public String clacReadLine(int lineNum) throws Exception {
            sb = new StringBuilder();
            
            for (int i = 1; i <= lineNum; i++) {
                String str = br.readLine();
                int splitIdx = str.indexOf(" ");
                int sum = Integer.parseInt((str.substring(0,splitIdx))) + Integer.parseInt((str.substring(splitIdx + 1)));
                sb.append("Case #" + i + ": " + sum + "\n");
            }
            br.close();
            return sb.toString();
        }
        
    }
	
}
