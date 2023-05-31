package chapter02;

import java.util.Scanner;

public class BaekJoon_2480_3 {
    
	public static void main (String[] args) {

        Dice dice = new Dice();

        // Scan 입력받는 초기화 친구들.
        dice.init();
        System.out.println(dice.getPrice(dice.checkDiceResult()));

    }

    public static class DiceResultData {
        public int sameDiceCnt = 0;
        public int maxDiceNum = 0;

        public DiceResultData(int sameDiceCnt, int maxDiceNum) {
            this.sameDiceCnt = sameDiceCnt;
            this.maxDiceNum = maxDiceNum;
        }
    }
    public static class Dice {

        Scanner scan = null;

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        
        public void init() {
            scan = new Scanner(System.in);

            num1 = scan.nextInt();
            num2 = scan.nextInt();
            num3 = scan.nextInt();

            scan.close();
        }

        public int[] getNum() {
            return new int[]{num1, num2, num3};
        }

        public DiceResultData checkDiceResult() {
            int[] diceCnt = {0,0,0,0,0,0};
            int[] diceData = this.getNum();

            int sameDiceCnt = 0;
            int maxDiceNum = 0;

            for (int i = 0; i < 3; i++) {
                diceCnt[diceData[i]-1]++;
            }

            for (int i = 0; i < 6; i++) {
                if (sameDiceCnt <= diceCnt[i]) {
                    sameDiceCnt = diceCnt[i];
                    maxDiceNum = i+1;
                }
            }

            return new DiceResultData(sameDiceCnt, maxDiceNum);
        }

        public int getPrice(DiceResultData data) {

            int sameDiceCnt = data.sameDiceCnt;
            int maxDiceNum = data.maxDiceNum;
            int result = 0;

            if (sameDiceCnt == 3) result = 10000 + (maxDiceNum * 1000);
            else if (sameDiceCnt == 2) result = 1000 + (maxDiceNum * 100);
            else result = maxDiceNum * 100;

            return result;

        }

    }
    
}
