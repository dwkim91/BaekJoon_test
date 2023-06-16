package chapter05;

import java.io.*;

public class BaekJoon_11720 {

	public static void main(String[] args) throws IOException {
		
		Sum sum = new Sum();
		sum.init();
		int numCnt = sum.getNumCnt();
		String strNum = sum.getStrNum();
		char[] ch = sum.getCharArr(strNum);
		int[] intArr = sum.getIntArr(ch, numCnt);
		int result = sum.getSum(intArr);
		System.out.println(result);
		
	}
	
	public static class Sum {
		
		private BufferedReader br;
		private int numCnt;
		private String strNum;
		
		public void init() throws IOException {
			
			br = new BufferedReader(new InputStreamReader(System.in));
			numCnt = Integer.parseInt(br.readLine());
			strNum = br.readLine();
			
		}
		
		public int getNumCnt() {
			
			return this.numCnt;
			
		}
		
		public String getStrNum() {
			return this.strNum;
		}
		
		public char[] getCharArr(String strNum) {
			
			char[] charArr = strNum.toCharArray();
			return charArr; 
			
		}
		
		public int[] getIntArr(char[] charArr, int numCnt) {
			
			int[] intArr = new int[(int) numCnt];
			int idx = 0;
			for(char num : charArr) {
				intArr[idx++] = num - '0';
			}
			return intArr; 
			
		}
		
		public int getSum(int[] intArr) {
			
			int sum = 0;
			for (int num : intArr) {
				sum += num;
			}
			return sum;
			
		}
		
	}
	
}
