package chapter02;

import java.util.Scanner;

public class BaekJoon_14681 {
	public static void main (String[] args) {
        
        CheckQuadrant cq = new CheckQuadrant();
        cq.scan.close();
        cq.showResult(cq.posX, cq.posY);
        
    }
    
    public static class CheckQuadrant {
        
        Scanner scan = new Scanner(System.in);
        int posX = scan.nextInt();
        int posY = scan.nextInt();
        
        void showResult (int posX, int posY) {
            
            String quadrant = "";
            
            if (posX > 0 &&  posY > 0) quadrant = "1";
            else if (posX < 0 &&  posY > 0) quadrant = "2";
            else if (posX < 0 &&  posY < 0) quadrant = "3";
            else if (posX > 0 &&  posY < 0) quadrant = "4";
            
            System.out.print(quadrant);
            
        }
        
    }
}
