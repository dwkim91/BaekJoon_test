package chapter04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BaekJoon_10818 {

	public static void main(String[] args) throws IOException {
        
        MinMax minMax = new MinMax();
        minMax.init();
        System.out.println(minMax.getResult(minMax.getDataArr(minMax.dataCnt)));
        
    }
    public static class ResultData {
        int min = 0;
        int max = 0;
        public ResultData (int min, int max) {
            this.min = min;
            this.max = max;
        }
        public String toString (){
            return min + " " + max;
        }
    }
    public static class MinMax {
        
        BufferedReader br = null;
        int dataCnt;
        int dataArr[];
            
        public void init() throws IOException {
            br = new BufferedReader(new InputStreamReader(System.in));
            dataCnt = Integer.parseInt(br.readLine());
        }
        
        public int[] getDataArr(int dataCnt) throws IOException {
            String strArr[] = new String[dataCnt];
            int dataArr[] = new int[dataCnt];
            strArr = br.readLine().split(" ");
            br.close();
            
            for (int i = 0; i < dataCnt; i++) {
                dataArr[i] = Integer.parseInt(strArr[i]);
            }
            return dataArr;
        }
        
        public ResultData getResult(int[] dataArr) {
            int min = dataArr[0];
            int max = dataArr[0];
            
            for (int i = 1; i < dataArr.length; i++) {
                if (min > dataArr[i]) min = dataArr[i];
                if (max < dataArr[i]) max = dataArr[i];
            }
            
            return new ResultData(min, max);
        }
        
    }
	
}
