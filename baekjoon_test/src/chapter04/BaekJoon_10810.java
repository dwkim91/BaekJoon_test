package chapter04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BaekJoon_10810 {
	
	public static void main(String[] args) throws IOException {
        
		BucketBall bb = new BucketBall();
		bb.init();
		System.out.print(bb.putBall(bb.bucketCnt, bb.ballCnt));
		
    }
    
    public static class BallData {
        int[] ball;
        public BallData(int[] ball){
            this.ball = ball;
        }
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < ball.length; i++){
                sb.append(ball[i]).append(" ");
            }
            return sb.toString();
        }
    }
    
    public static class BucketBall {
        
        BufferedReader br;
        StringTokenizer st;
        int bucketCnt = 0;
        int ballCnt = 0;
        int[] bucket;
        
        public void init() throws IOException {
            br = new BufferedReader(new InputStreamReader(System.in));
            st = new StringTokenizer(br.readLine());
            bucketCnt = Integer.parseInt(st.nextToken());
            ballCnt = Integer.parseInt(st.nextToken());
        }
        
        public BallData putBall(int bucketCnt, int ballCnt) throws IOException {
            
            bucket = new int[bucketCnt];
            int start;
            int end;
            int num;
            
            for (int i = 0; i < ballCnt; i++) {
                
                st = new StringTokenizer(br.readLine());
                start = Integer.parseInt(st.nextToken());
                end   = Integer.parseInt(st.nextToken());
                num   = Integer.parseInt(st.nextToken());
                
                for (int idx = start - 1; idx <= end - 1; idx++) {
                    bucket[idx] = num;
                }
                
            }
            
            br.close();
            return new BallData(bucket);
        }
        
    }
	
}
