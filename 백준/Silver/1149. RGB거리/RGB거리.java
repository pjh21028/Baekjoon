import java.io.*;
import java.util.*;

public class Main {
    final static int iRed = 0;
    final static int iGreen = 1;
    final static int iBlue = 2;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int iNum = Integer.parseInt(br.readLine());

        int[][] iCost = new int[iNum][3];

        for (int i = 0; i < iNum; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            iCost[i][iRed] = Integer.parseInt(st.nextToken());
            iCost[i][iGreen] = Integer.parseInt(st.nextToken());
            iCost[i][iBlue] = Integer.parseInt(st.nextToken());

        }
 
        for (int i = 1; i < iNum; i++) {
            iCost[i][iRed] += Math.min(iCost[i - 1][iGreen], iCost[i - 1][iBlue]);
            iCost[i][iGreen] += Math.min(iCost[i - 1][iRed], iCost[i - 1][iBlue]);
            iCost[i][iBlue] += Math.min(iCost[i - 1][iRed], iCost[i - 1][iGreen]);
        }

        System.out.println(Math.min(Math.min(iCost[iNum - 1][iRed], iCost[iNum - 1][iGreen]), iCost[iNum - 1][iBlue]));
    }

}