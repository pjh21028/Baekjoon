import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iTestCase = Integer.parseInt(br.readLine());
        int[] iArr;

        for(int i = 0; i < iTestCase; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int iStudentNum = Integer.parseInt(st.nextToken());
            iArr = new int[iStudentNum];
            double dSum = 0;	
            for(int j = 0; j < iStudentNum; j++) {
                iArr[j] = Integer.parseInt(st.nextToken());
                dSum += iArr[j];
            }
            double dMean = (dSum / iStudentNum) ;
            double dCount = 0; 

            for(int j = 0 ; j < iStudentNum ; j++) {
                if(iArr[j] > dMean) {
                    dCount++;
                }
            }

            System.out.printf("%.3f%%\n",(dCount/iStudentNum)*100);
        }
    }
}