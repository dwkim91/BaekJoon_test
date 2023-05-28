package chapter02;

import java.util.Scanner;

public class BaekJoon_1330 {

	public static void main(String[] args) {
		
		CompareNum compareNum = new CompareNum();
		compareNum.showResult(compareNum.A, compareNum.B);
		compareNum.scan.close();
		
	}
	
	public static class CompareNum {

		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();    

		public void showResult(int a, int b){
			
			String result = "";
				
			if (a == b) result = "==";
			else result = a > b ? ">" : "<";
				
			System.out.println(result);
		}
			
	}
	
}
	


