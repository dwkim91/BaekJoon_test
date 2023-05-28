package chapter03;

import java.util.Scanner;

public class BaekJoon_2739 {
    
    public static void main (String[] args) {
        
        GuguDan gugu = new GuguDan();
        gugu.scan.close();
        gugu.showResult(gugu.stage);
        
    }
    
    public static class GuguDan {
        
        Scanner scan = new Scanner(System.in);
        int stage = scan.nextInt();
        
        public void showResult(int stage){
            for (int i = 1; i < 10; i++){
                int result = stage * i;
                System.out.printf("%d * %d = %d\n", stage, i, result);
            }
        }
        
    }
    
}