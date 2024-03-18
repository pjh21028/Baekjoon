import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int iTestcase = Integer.parseInt(br.readLine());
        int[] iNum;
        StringTokenizer st;
        for(int i=0;i<iTestcase;i++){
            int N = Integer.parseInt(br.readLine());
            long lResult = 0;
            st = new StringTokenizer(br.readLine()," ");
            iNum = new int[N];
          
            for(int j=0;j<N;j++) {
              iNum[j] = Integer.parseInt(st.nextToken());
            }
            int iMax = iNum[N-1];	
   
            for(int j=N-2;j>=0;j--) {
                if(iNum[j] <= iMax) {
                  lResult += iMax - iNum[j];
                }
                else {
                  iMax = iNum[j];
                }		
            }
            bw.write(lResult + "\n");	
        }
        bw.flush();
        bw.close();
        br.close();
    }
}