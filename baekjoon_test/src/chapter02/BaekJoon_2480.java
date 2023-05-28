package chapter02;

import java.util.Scanner;

public class BaekJoon_2480 {
    
    public static void main (String[] args) {
        
        Dice dice = new Dice();
        dice.scan.close();
        dice.checkDiceResult();
        dice.getPrice();
        
    }
    
    public static class Dice {
        
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int diceData[] = {num1, num2, num3};
        int diceCnt[] = {0,0,0,0,0,0};
        int sameDiceCnt = 0;
        int maxDiceNum = 0;
        
        public void checkDiceResult() {
            
            for (int i = 0; i < 3; i++) {
                   this.diceCnt[this.diceData[i]-1]++;
            }
            
            for (int i = 0; i < 6; i++) {
            
                if (this.sameDiceCnt <= this.diceCnt[i]) {
                    this.sameDiceCnt = this.diceCnt[i];
                    this.maxDiceNum = i+1;
                }
                
            }
            
        }
        
        public void getPrice() {
            
            int sameDiceCnt = this.sameDiceCnt;
            int maxDiceNum = this.maxDiceNum;
            int result = 0;
            if (sameDiceCnt == 3) result = 10000 + (maxDiceNum * 1000);
            else if (sameDiceCnt == 2) result = 1000 + (maxDiceNum * 100);
            else result = maxDiceNum * 100;
            System.out.print(result);
                
        }
        
    }
    
}
