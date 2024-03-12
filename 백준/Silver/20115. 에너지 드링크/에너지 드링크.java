import java.util.*;
import java.lang.*;
import java.io.*;


public class Main {
    
    public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int iMaxDrkNum = Integer.parseInt(st.nextToken());
        double [] dDrkVolume = new double [iMaxDrkNum];
        
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < iMaxDrkNum; i++) {
            dDrkVolume[i] = Double.parseDouble(st.nextToken());
        }
        Arrays.sort(dDrkVolume);
        
        double iMax = dDrkVolume[iMaxDrkNum - 1];
        
        double iSum = iMax;
        
        for (int i = 0; i < iMaxDrkNum; i++) {
            if (dDrkVolume[i] == iMax) {
                continue;
            }
            iSum += dDrkVolume[i] / 2;
        }
        System.out.println(iSum);
    }
}