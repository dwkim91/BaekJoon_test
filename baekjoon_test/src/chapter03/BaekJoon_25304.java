package chapter03;

import java.util.Scanner;

public class BaekJoon_25304 {
	public static void main(String[] args) {
	     
        Receipt receitp = new Receipt();
        receitp.init();
        System.out.println(receitp.getResult(receitp.totalPrice, receitp.calcReceipt()));
    }
    
    public static class Receipt {
        
        Scanner scan = null;
        int totalPrice = 0;
        int productQty = 0;
        int[][] data = null;
        
        public void init() {
            scan = new Scanner(System.in);
            totalPrice = scan.nextInt();
            productQty = scan.nextInt();
            data = new int[productQty][2];
            for (int i = 0; i < data.length; i++){
                data[i][0] = scan.nextInt();
                data[i][1] = scan.nextInt();
            }
            scan.close();
        }
        
        public int[][] getData(){
            return this.data;
        }
        
        public int calcReceipt() {
            int[][] data = this.getData();
            int sum = 0;
            for (int i = 0 ; i < data.length; i++) {
                sum += (data[i][0] * data[i][1]);
            }
            return sum;
        }
        
        public String getResult(int totalPrice, int sum) {
            return totalPrice == sum ? "Yes" : "No";
        }
        
    }
}
