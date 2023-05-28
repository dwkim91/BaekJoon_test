package chapter02;

import java.util.Scanner;

public class BaekJoon_2884 {

public static void main (String[] args) {
        
        SetAlarm setAlarm = new SetAlarm();
        setAlarm.scan.close();
        setAlarm.showAlarm(setAlarm.hour, setAlarm.min);
        
    }
    
    public static class SetAlarm {
        
        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();
        int min = scan.nextInt();
        
        public void showAlarm(int hour, int min) {
            
            int setMin = 45;
            
            if (min < 45) {
                hour -= 1;
                if (hour < 0) hour = 23;
                min = 60 - (setMin - min);
            }
            else {
                min -= setMin;
            }
            
            System.out.print(hour+" "+min);
            
        }
        
    }

}
