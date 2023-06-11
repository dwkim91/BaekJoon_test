package chapter05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BaekJoon_27866 {

	public static void main(String[] args) throws IOException{
		
		GetChar gc = new GetChar();
		gc.init();
		char c = gc.getResult(gc.getStr(), gc.getIdx());
		System.out.print(c);
		
	}
	
	public static class GetChar {
		
		private BufferedReader br;
		private String readStr;
		private int idx;
		
		public void init() throws IOException {
			br = new BufferedReader(new InputStreamReader(System.in));
			readStr = br.readLine();
			idx = Integer.parseInt(br.readLine()) - 1;
		}
		
		public String getStr() {
			return this.readStr;
		}
		
		public int getIdx() {
			return this.idx;
		}
		
		public char getResult(String readStr, int idx) {
			
			return readStr.charAt(idx);
			
		}
		
		
	}
	
}
