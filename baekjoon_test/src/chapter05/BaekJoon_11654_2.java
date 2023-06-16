package chapter05;

import java.io.*;

public class BaekJoon_11654_2 {

	public static void main(String[] args) throws IOException {
		
		ASCII asc = new ASCII();
		asc.init();
		String str = asc.getReadStr();
		char ch = asc.getChar(str);
		int ascii = asc.getASCII(ch);
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
		
		public char getChar(String readStr) {
			return readStr.charAt(0);
		}
		
		public int getASCII(char ch) {
			return (int)ch;
		}
		
	}
	
}
