package chapter04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BaekJoon_5597 {

	public static void main(String[] args) throws IOException {
        AbsentStudentCheck asc = new AbsentStudentCheck();
        asc.init();
        System.out.print(asc.gerAbsetList(asc.getStduetnNum(asc.studentList)));
    }
    
    public static class AbsentStudentCheck {
        
        int totalStudent = 30;
        int studentList[];
        BufferedReader br;
        StringBuilder sb;
        
        public void init() {
            studentList = new int[totalStudent];
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        
        public int[] getStduetnNum(int studentList[]) throws IOException {
            int temp[] = studentList;
            
            boolean isRead = true;
            while (isRead) {
            	String read;
            	if ((read=br.readLine()) != null) {
            		
            		int readNum = Integer.parseInt(read);
            		temp[readNum - 1] = readNum;
            		
            	}
            	else {
            		isRead = false;
            	}
            	
            }
            
            br.close();
            return temp;
        }
        
        public String gerAbsetList(int studentList[]) {
            sb = new StringBuilder();
            for (int i = 0; i < studentList.length; i++) {
                if (studentList[i] == 0) sb.append(i + 1).append("\n");
            }
            return sb.toString();
        }
        
    }
	
}
