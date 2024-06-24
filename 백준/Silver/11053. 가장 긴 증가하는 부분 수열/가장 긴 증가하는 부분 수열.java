import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int iNum = Integer.parseInt(br.readLine());
        int[] iSeq = new int[iNum];
        int[] iDP = new int[iNum];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        for(int i = 0; i < iNum; i++) {
            iSeq[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < iNum; i++) {
            iDP[i] = 1;
            
            for(int j = 0; j < i; j++) {
                if(iSeq[j] < iSeq[i] && iDP[i] < iDP[j] + 1) {
                    iDP[i] = iDP[j] + 1;	
                }
            }
        }
        int iMax = -1;
        for(int i = 0; i < iNum; i++) {
            iMax = iDP[i] > iMax ? iDP[i] : iMax;
        }
        System.out.println(iMax);
    }    
}