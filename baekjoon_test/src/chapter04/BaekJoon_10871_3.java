package chapter04;

import java.util.Scanner;

public class BaekJoon_10871_3 {

	public static void main(String[] args) {
        
		Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int cntNum = scan.nextInt();
        int targetNum = scan.nextInt(); 
        int[] intNumArr = new int[cntNum];
        
        for (int i = 0; i < cntNum; i++) {
        	if ((intNumArr[i] = scan.nextInt()) < targetNum) {
        		sb.append(intNumArr[i] + " ");
        	}
        }
        
        scan.close();
        System.out.print(sb.toString());
        
    }
	
}
