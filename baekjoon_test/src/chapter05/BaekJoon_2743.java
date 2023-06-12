package chapter05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BaekJoon_2743 {

	public static void main(String[] args) throws IOException {

		CalcStringLength csl = new CalcStringLength();
		csl.init();
		String str = csl.getReadString();
		System.out.print(csl.getLength(str));

	}

	public static class CalcStringLength{

		private BufferedReader br;
		private String readStr;

		public void init() throws IOException {
			br = new BufferedReader(new InputStreamReader(System.in));
			readStr = br.readLine();
		}

		public String getReadString() {
			return this.readStr;
		}

		public int getLength(String readStr) {
			return readStr.length();
		}

	}

}
