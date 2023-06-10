package chapter04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class BaekJoon_10811 {

	public static void main(String[] args) throws IOException {
		
		Reverse rev = new Reverse();
		rev.init();
		rev.setBucketArr();
		int[] revBucket = rev.getReversedBucket(rev.getBucket(), rev.getReverseCnt());
		System.out.print(rev.showResult(revBucket));
		
	}
	
	public static class Reverse {
		
		BufferedReader br;
		StringTokenizer st;
		StringBuilder sb;
		int bucketNum;
		int reverseCnt;
		int[] bucket;
		
		public void init() throws IOException {
			br = new BufferedReader(new InputStreamReader(System.in));
			st = new StringTokenizer(br.readLine());
			bucketNum = Integer.parseInt(st.nextToken());
			reverseCnt = Integer.parseInt(st.nextToken());
			bucket = new int[bucketNum];
		}
		
		public void setBucketArr() {
			for (int i = 0; i < bucket.length; i++) {
				bucket[i] = i + 1;
			}
		}
		
		public int[] getBucket() {
			return this.bucket;
		}
		
		public int getReverseCnt() {
			return this.reverseCnt;
		}
		
		public int[] getReversedBucket(int[] bucket, int reverseCnt) throws IOException {
			
			for (int cnt = 0; cnt < reverseCnt; cnt++) {
				int[]temp = new int[bucket.length];
				st = new StringTokenizer(br.readLine());
				int str = Integer.parseInt(st.nextToken()) - 1;
				int end = Integer.parseInt(st.nextToken()) - 1;
				
				for (int i = 0; i < str; i++) {
					temp[i] = bucket[i];
				}
				
				for (int i = 0; i < end - str + 1; i++) {
					temp[str + i] = bucket[end - i];
				}
				
				for (int i = end + 1; i < bucket.length; i++) {
					temp[i] = bucket[i];
				}
				bucket = temp;
				
			}
			
			return bucket;
			
		}
		
		public String showResult(int[] bucket) {
			
			sb = new StringBuilder();
			
			for (int i = 0; i < bucket.length; i++) {
				sb.append(bucket[i] + " ");
			}
			
			return sb.toString();
		}
		
	}
	
}
