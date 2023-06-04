package chapter03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon_2439 {

	public static void main(String[] args) throws Exception {
        
        Star star = new Star();
        star.init();
        System.out.print(star.getStarLine(star.getStarCnt()));
        
    }
    
    public static class Star {
        
        BufferedReader br = null;
        private int starCnt = 0;
        StringBuilder sb = null;
        
        public void init() throws Exception {
            br = new BufferedReader(new InputStreamReader(System.in));
            starCnt = Integer.parseInt(br.readLine());
            br.close();
        }
        
        public int getStarCnt() {
            return this.starCnt;
        }
        
        public String getStarLine(int starCnt) {
           
        	sb = new StringBuilder();
            
            for (int i = 1; i <= starCnt; i++) {
                
                sb.append(" ".repeat(starCnt - i)).append("*".repeat(i)).append("\n");
                
            }
            
            return sb.toString();
            
        }
        
    }
	
}
