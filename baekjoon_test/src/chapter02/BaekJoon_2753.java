package chapter02;

import java.util.Scanner;

public class BaekJoon_2753 {

	public static void main (String[] args) {
        
        CheckYear cy = new CheckYear();
        cy.scan.close();
        cy.showResult(cy.getYear);
        
    }
    
    public static class CheckYear {
        
        Scanner scan = new Scanner(System.in);
        int getYear = scan.nextInt();
        
        public void showResult (int year) {
          
            String result = "";
            
            if (year % 4 == 0 && year % 100 != 0 ) result = "1";
            else if (year % 400 == 0) result ="1";
            else result = "0";
            
            System.out.println(result);
            
        }
        
    }

}
