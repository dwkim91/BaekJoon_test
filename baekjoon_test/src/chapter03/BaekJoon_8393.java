package chapter03;

import java.util.Scanner;

public class BaekJoon_8393 {
	
	public static void main (String[] args) {
        
        Sum sum = new Sum();
        int maxNum = sum.getNum();
        System.out.println(sum.getSum(maxNum));
        
    }
    
    public static class Sum {
        
        public int getNum() {
            Scanner scan = new Scanner(System.in);
            int maxNum = scan.nextInt();
            scan.close();
            return maxNum;
        }
        
        public int getSum(int maxNum) {
            
            int sum = 0;
            
            for (int i = 1; i <= maxNum; i++) {
                sum += i;
            }
            
            return sum;
            
        }
        
    }
    
}
