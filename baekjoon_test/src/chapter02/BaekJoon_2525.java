package chapter02;

import java.util.Scanner;

public class BaekJoon_2525 {
	
	public static void main (String[] args) {
    
		SetOvenTime setOvenTime = new SetOvenTime();
		setOvenTime.scan.close();
		setOvenTime.calcTime(setOvenTime.hour, setOvenTime.min, setOvenTime.cookTime);
		setOvenTime.showSetTime(setOvenTime.hour, setOvenTime.min);
		
    }
    
    public static class SetOvenTime{
        
        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();
        int min = scan.nextInt();
        int cookTime = scan.nextInt();
        
        public void showSetTime (int hour, int min) {
               
            System.out.print(hour + " " + min);
            
        }
        
        public void calcTime (int hour, int min, int cookTime){
            
            int cookHour = cookTime / 60;
            int cookMin = cookTime % 60;
            
            if (cookMin + min >= 60) {
                min -= 60;
                hour += 1;   
            }
            
            min += cookMin;
            hour += cookHour;
            
            if (hour > 23) hour -= 24;
            
            this.hour = hour;
            this.min = min;
            
        }
        
    }
}
