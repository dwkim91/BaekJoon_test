package chapter03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon_2438 {

	public static void main(String[] args) throws Exception{
		
		Star star = new Star();
		star.init();
		System.out.println(star.printStar(star.getStarNum()));
		
	}
	
	public static class Star {
		
		BufferedReader br = null;
		StringBuilder sb = null;
		private int starCnt = 0;
		
		public void init() throws Exception{
			
			br = new BufferedReader(new InputStreamReader(System.in));
			starCnt = Integer.parseInt(br.readLine());
			br.close();
			
		}
		
		public int getStarNum() {
			return this.starCnt;
		}
		
		public String printStar(int starCnt) {
			
			sb = new StringBuilder();
			
			for (int i = 1; i <= starCnt; i++) {
				
				for (int j = 0; j < i; j++) {
					sb.append("*");				
				}
				
				sb.append("\n");
				
			}
			
			return sb.toString();
			
		}
		
	}
	
}
