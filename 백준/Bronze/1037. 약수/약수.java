import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));    
        int iDivisorNum = Integer.parseInt(br.readLine());
        int [] iDivisorArray = new int [iDivisorNum];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        
        for (int i = 0; i < iDivisorNum; i++) {
            iDivisorArray[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(iDivisorArray);

        System.out.println(iDivisorArray[0] * iDivisorArray[iDivisorNum-1]);
    }
}