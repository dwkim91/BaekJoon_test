package chapter04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BaekJoon_2563_2 {

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
            
            for (int i = 1; i <= 9; i++) {
            	int tempNum = Integer.parseInt(br.readLine());
            	if (max < tempNum) {
                    max = tempNum;
                    idx = i;
                }
            }
            
            br.close();
            return new MaxData(max, idx);
        }

    }
	
}
