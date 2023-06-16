package chapter05;

import java.io.*;

public class BaekJoon_11654 {

	public static void main(String[] args) throws IOException {
		
		ASCII asc = new ASCII();
		asc.init();
		String str = asc.getReadStr();
		char[] ch = asc.getCharArr(str);
		int ascii = asc.getASCII(ch, 0);
		System.out.println(ascii);
			
	}
	
	public static class ASCII {
		
		private BufferedReader br;
		private String readStr;
		
		public void init() throws IOException {
			br = new BufferedReader(new InputStreamReader(System.in));
			readStr = br.readLine();
		}
		
		public String getReadStr() {
			return this.readStr;
		}
		
		public char[] getCharArr(String readStr) {
			return readStr.toCharArray();
		}
		
		public int getASCII(char[] charArr, int idx) {
			return (int)charArr[idx];
		}
		
	}
	
}
