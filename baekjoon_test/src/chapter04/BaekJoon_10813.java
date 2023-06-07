package chapter04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BaekJoon_10813 {
	
	public static void main(String[] args) throws IOException {
        
		BallChange bc = new BallChange();
		bc.init();
		System.out.print(bc.change(bc.bucket, bc.changeCnt));
        
    }
    
    public static class BallData {
        int[] bucket;
        
        public BallData(int[] bucket) {
            this.bucket = bucket;
        }
        
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int i : bucket){
                sb.append(i).append(" ");
            }
            return sb.toString();
        }

    }
    
    public static class BallChange {
        
        BufferedReader br;
        StringTokenizer st;
        int bucketCnt;
        int changeCnt;
        int[] bucket;
        
        public void init() throws IOException {
            br = new BufferedReader(new InputStreamReader(System.in));
            st = new StringTokenizer(br.readLine());
            bucketCnt = Integer.parseInt(st.nextToken());
            changeCnt = Integer.parseInt(st.nextToken());
            bucket = new int[bucketCnt];
            for (int i = 0; i < bucketCnt; i++) {
                bucket[i] = i + 1;
            }
        }
        
        public BallData change(int[] bucket, int changeCnt) throws IOException {
            
        	int[] bucketTemp = bucket;
            int bucketFrom;
            int bucketTo;
            
            for (int i = 0; i < changeCnt; i++) {  
            	
            	st = new StringTokenizer(br.readLine());
                bucketFrom = Integer.parseInt(st.nextToken()) - 1;
                bucketTo = Integer.parseInt(st.nextToken()) - 1;
                int temp = bucketTemp[bucketTo];
                bucketTemp[bucketTo] = bucketTemp[bucketFrom];
                bucketTemp[bucketFrom] = temp;
             
            }
            
            br.close();

            return new BallData(bucketTemp);
            
        }
        
    }
	
}
