package chapter03;

import java.util.Scanner;

public class BaekJoon_10950 {

	public static void main (String[] args) {
        
        Plus plus = new Plus();
        
        int[][] arr= plus.getNumArr();
        
        for(int result : plus.calcArr(arr)){
        	System.out.println(result);
        }
        
    }
    
    public static class Plus {
        
        public int[][] getNumArr() {
            
            Scanner scan = new Scanner(System.in);
            int testCnt = scan.nextInt();
            int[][] testCase = new int[testCnt][2];
            for (int i = 0; i < testCnt; i++) {
                testCase[i][0] = scan.nextInt();
                testCase[i][1] = scan.nextInt();
            }
            scan.close();
            
            return testCase;
            
        } 
        
        public int[] calcArr(int[][] testCase) {
            
            int[] result = new int[testCase.length];
            
            for (int i = 0; i < testCase.length; i++) {
                result[i] = testCase[i][0] + testCase[i][1];
            }
            
            return result;
            
        }
        
    }
	
}
