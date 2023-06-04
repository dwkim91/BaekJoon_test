package chapter03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon_11022 {

	public static void main(String[] args) throws Exception{
		
		Plus plus = new Plus();
		plus.init();
		System.out.print(plus.calcReadLine(plus.getLineNum()));
		
	}
	
	public static class Plus {
		
		private BufferedReader br = null;
		private int lineNum = 0;
		private StringBuilder sb = null;
		
		public void init() throws Exception{
			
			br = new BufferedReader(new InputStreamReader(System.in));
			lineNum = Integer.parseInt(br.readLine());
			
		}
		
		public int getLineNum() {
			return this.lineNum;
		}
		
		 public String calcReadLine(int lineNum) throws Exception{
			 
			 sb = new StringBuilder();
			 
			 for (int i = 1; i <= lineNum; i++) {
				 
				 String str = br.readLine();
				 int splitIdx = str.indexOf(" ");
				 int num1 = Integer.parseInt(str.substring(0, splitIdx));
				 int num2 = Integer.parseInt(str.substring(splitIdx + 1));
				 int sum = num1 + num2; 
				 
				 sb.append("Case #" + i + ": " + num1 + " + " + num2 + " = " + sum + "\n");
				 
			 }
			 
			 br.close();
			 return sb.toString();
			 
		 }
		
	}
	
}
