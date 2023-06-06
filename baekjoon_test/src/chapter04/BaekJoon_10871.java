package chapter04;

import java.util.Scanner;

public class BaekJoon_10871 {

	public static void main(String[] args) {
        
        CountLowerNum countLowerNum = new CountLowerNum();
        countLowerNum.init();
        System.out.println(countLowerNum.getResult(countLowerNum.makeNumArr(countLowerNum.cntNum, countLowerNum.targetNum)));
        
    }
    
    public static class NumData {
        int targetNum = 0;
        int[] intNumArr;
        public NumData(int targetNum, int[] intNumArr) {
            this.targetNum = targetNum;
            this.intNumArr = intNumArr;
        } 
    }
    
    public static class CountLowerNum {
        
        Scanner scan = null;
        StringBuilder sb = null;
        int cntNum = 0;
        int targetNum = 0;
        int[] intNumArr;
        
        
        public void init(){
            
            scan = new Scanner(System.in);
            cntNum = scan.nextInt();
            targetNum = scan.nextInt(); 
            
        }
        
        public NumData makeNumArr(int cntNum, int targetNum) {
            
            intNumArr = new int[cntNum];
                      
            for (int i = 0; i < cntNum; i++) {
            	intNumArr[i] = scan.nextInt();
            }
            
            return new NumData(targetNum, intNumArr);
            
        }
        
        public String getResult(NumData data) {
            
            sb = new StringBuilder();
       
            for (int i = 0; i < cntNum; i++) {
                if (data.intNumArr[i] < data.targetNum) {
                    sb.append(data.intNumArr[i] + " ");
                }
            }
            
            return sb.toString();
            
        }
        
    }
	
}
