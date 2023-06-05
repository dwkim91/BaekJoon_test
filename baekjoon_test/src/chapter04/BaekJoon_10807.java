package chapter04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_10807 {

	public static void main(String[] args) throws IOException{
		
		CntNum cntNum = new CntNum();
		cntNum.init();
		System.out.print(cntNum.countTargetNum(cntNum.getCntNumDate()));
		
	}
	
	public static class CntNumData {
		
		public String targetNum;
		public String[] strArr;
		
		public CntNumData(String targetNum, String[] strArr) {
			this.targetNum = targetNum;
			this.strArr = strArr;
		}
		
	}
	
	public static class CntNum {
		
		BufferedReader br = null;
		int totalNum = 0;
		int[] numArr = null;
		String[] strArr = null;
		private String targetNum = null;
		private int count = 0;
		
		
		public void init() throws IOException{
			
			 br = new BufferedReader(new InputStreamReader(System.in));
			 totalNum = Integer.parseInt(br.readLine());
			 strArr = br.readLine().split(" ");
			 targetNum = br.readLine();
			 br.close();
			 
		}
		
		public CntNumData getCntNumDate() {
			return new CntNumData(targetNum, strArr);
		}
		
		public int countTargetNum(CntNumData data) {
			
			for (int i = 0; i < strArr.length; i++) {
				if (targetNum.equals(strArr[i])) {
					count++;
				}
			}
			
			return count;
			
		}  
		
	}
	
}
