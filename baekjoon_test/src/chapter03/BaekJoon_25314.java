package chapter03;

import java.util.Scanner;

public class BaekJoon_25314 {

public static void main(String[] args) {
        
        DataName dataName = new DataName();
        dataName.init();
        System.out.println(dataName.getResult(dataName.getSize()));
        
    }
    
    public static class DataName {
        Scanner scan = null;
        int dataSize = 0;
        
        public void init(){
            scan = new Scanner(System.in);
            dataSize = scan.nextInt();
            scan.close();
        }
        
        public int getSize() {
            return this.dataSize;
        }
        
        public String getResult(int dataSize) {
            int cnt = dataSize / 4;
            StringBuilder strBuilder = new StringBuilder();
            for (int i = 0; i < cnt; i++) {
                strBuilder.append("long ");
            }
            strBuilder.append("int");
            return strBuilder.toString();
        }
        
    }
	
}
