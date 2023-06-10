package chapter04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BaekJoon_3052 {

	public static void main(String[] args) throws IOException {
        
        Modulo mod = new Modulo();
        mod.init();
        int[] numArr = mod.getNumArr();
        int[] modArr = mod.getModArr(numArr, mod.getTargetNum());
        System.out.print(mod.showResult(modArr));
        
    }

	public static class Modulo {
    
		private BufferedReader br;
	    private int cnt = 10;
	    private int targetNum = 42;
	    private int[] numArr;
	    
	    public void init() throws IOException {
	        
	        br = new BufferedReader(new InputStreamReader(System.in));
	        numArr = new int[cnt];
	        for (int i = 0; i < cnt; i++) {
	            numArr[i] = Integer.parseInt(br.readLine());
	        }
	        br.close();
	        
	    }
    
	    public int getTargetNum() {
			return targetNum;
		}

		public int[] getNumArr(){
	        return this.numArr;
	    }
	    
	    public int[] getModArr(int[] numArr, int targetNum) {
	        
	        int[] modArr = new int[targetNum];   
	        for(int i = 0; i < numArr.length; i++) {
	            modArr[numArr[i]%targetNum]++; 
	        }
	        return modArr;
	        
	    }
    
	    public int showResult(int[] modArr) {
	        
	        int cntMod = 0;
	        for(int i = 0; i < modArr.length; i++) {
	            if (modArr[i] != 0) cntMod++;
	        } 
	        return cntMod;
	        
	    }
	    
	}
	
} 

	

