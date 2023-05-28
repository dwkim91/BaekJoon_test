package chapter02;

import java.util.Scanner;

public class BaekJoon_9498 {

    public static void main (String[] args) {
        
        CheckScore cs = new CheckScore();
        cs.scan.close();
        cs.showResult(cs.getScore);
             
    }
    
    public static class CheckScore {
        
        Scanner scan = new Scanner(System.in);
        int getScore = scan.nextInt();
        
        void showResult (int num) {
            String result = "";
            if (num >= 90) result = "A";
            else if (num >= 80) result = "B";
            else if (num >= 70) result = "C";
            else if (num >= 60) result = "D";
            else result = "F";
            System.out.println(result);
        }    
        
    }
    
}
