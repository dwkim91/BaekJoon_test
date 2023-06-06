package chapter04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BaekJoon_2562 {

	public static void main(String[] args) throws IOException{
        Maximum max = new Maximum();
        max.init();
        System.out.println(max.getMax());
    }
    
    public static class MaxData {
        int max = 0;
        int idx = 0;
        public MaxData(int max, int idx){
            this.max = max;
            this.idx = idx;
        }
        public String toString() {
            return max + "\n" + idx;
        }
    }
    
    public static class Maximum {
        
        BufferedReader br;
 
        public void init() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        
        public MaxData getMax() throws IOException { 
            int idx = 0;
            int max = 0;
            int cnt = 1;
            String temp;
        
            while ((temp = br.readLine()) != null) {
                int tempNum = Integer.parseInt(temp);
                if (max < tempNum) {
                    max = tempNum;
                    idx = cnt;
                }
                cnt++;
            }
            
            br.close();
            return new MaxData(max, idx);
        }

    }
	
}
