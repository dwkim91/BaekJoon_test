package chapter04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BaekJoon_10871_2 {

	public static void main(String[] args) throws IOException {
        
        CountLowerNum countLowerNum = new CountLowerNum();
        countLowerNum.init();
        System.out.print(countLowerNum.getResult(countLowerNum.makeNumArr(countLowerNum.cntNum)));
        
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
        
        BufferedReader br = null;
        StringBuilder sb = null;
        int cntNum = 0;
        int targetNum = 0;
        String[] strNumArr;
        
        
        public void init() throws IOException{
            
            br = new BufferedReader(new InputStreamReader(System.in));
            int splitIdx = -1;
            
            String temp = br.readLine();
            splitIdx = temp.indexOf(" ");
            cntNum = Integer.parseInt(temp.substring(0, splitIdx));
            targetNum = Integer.parseInt(temp.substring(splitIdx + 1));
            
            temp = br.readLine();
            strNumArr = temp.split(" ");
            br.close();
            
        }
        
        public NumData makeNumArr(int cntNum) {
            
            int[] intNumArr = new int[cntNum];
                      
            for (int i = 0; i < cntNum; i++) {
            	intNumArr[i] = Integer.parseInt(strNumArr[i]);
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
