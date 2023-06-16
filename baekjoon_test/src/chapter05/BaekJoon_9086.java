package chapter05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BaekJoon_9086 {

	public static void main(String[] args) throws IOException {
		GetString gs = new GetString();
		gs.init();
		System.out.println(gs.getResult(gs.readStr(gs.getStrCnt())));
	}

	public static class GetString {

		private BufferedReader br;
		private StringBuilder sb;
		private int strCnt;

		public void init() throws IOException {
			br = new BufferedReader(new InputStreamReader(System.in));
			strCnt = Integer.parseInt(br.readLine());
		}
		
		public int getStrCnt() {
			return this.strCnt;
		}
		
		public String[] readStr(int strCnt) throws IOException {
			String[] readStrArr = new String[strCnt];
			for (int i = 0; i < strCnt; i++) {
				readStrArr[i] = br.readLine();
			}
			return readStrArr;
		}

		public String getResult(String[] readStrArr) {
			sb = new StringBuilder();
			for (int i = 0; i < readStrArr.length; i++) {
				sb.append(readStrArr[i].charAt(0)).append(readStrArr[i].charAt(readStrArr[i].length() - 1));
				sb.append("\n");
			}
			return sb.toString();
		}
		
	}

}
