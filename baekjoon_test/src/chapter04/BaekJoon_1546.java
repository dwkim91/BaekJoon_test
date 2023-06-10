package chapter04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BaekJoon_1546 {
	
	public static void main(String[] args) throws IOException {
        
        Average avg = new Average();
        avg.init();
        int subCnt = avg.getSubjectCnt();
        AvgData avgData = avg.readScore(subCnt);
        //System.out.println("subCnt = " + subCnt + ", totalScore = " + avgData.totalScore + ", maxSubScore = " + avgData.maxSubScore);
        System.out.print(avg.clacAvg(avgData, subCnt));
        
    }
    
    public static class AvgData {
        int totalScore;
        int maxSubScore;
        
        public AvgData(int totalScore, int maxSubScore) {
            this.totalScore = totalScore;
            this.maxSubScore = maxSubScore;
        }  
    }
    
    public static class Average {
        
        private BufferedReader br;
        private StringTokenizer st;
        private int subjectCnt;
        
        public int getSubjectCnt() {
            return this.subjectCnt;
        }
        
        public void init() throws IOException {
            
            br = new BufferedReader(new InputStreamReader(System.in));
            st = new StringTokenizer(br.readLine());
            subjectCnt = Integer.parseInt(st.nextToken());
            
        }
        
        public AvgData readScore(int subjectCnt) throws IOException {
            int totalScore = 0;
            int maxSubScore = 0;
            st = new StringTokenizer(br.readLine());
            
            for (int i = 0; i < subjectCnt; i++) {
                int score = Integer.parseInt(st.nextToken());
                totalScore += score;
                if (maxSubScore < score) maxSubScore = score;
            }
                      
            return new AvgData(totalScore, maxSubScore);
        }
        
        public double clacAvg (AvgData data, int subjectCnt) {
            return (double)data.totalScore / data.maxSubScore / subjectCnt * 100;
        }
        
    }
	
}
