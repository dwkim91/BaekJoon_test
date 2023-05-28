package chapter01;
import java.util.Scanner;

public class BaekJoon_11382 {
	    
	public static void main (String[] args) {
        
	    GetNum num = new GetNum();
	    num.scan.close();
	    System.out.println(num.getSum());
	        
	}
	    
	public static class GetNum {
	       
	    Scanner scan = new Scanner(System.in);
	        
	    long A = scan.nextLong();
	    long B = scan.nextLong();
	    long C = scan.nextLong();
	        
	    public long getSum () {
	        return this.A + this.B + this.C;
	    }
	        
	}
	    
	    
}
