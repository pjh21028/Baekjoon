import java.io.*;
import java.util.*;
public class Main {
    public static int iMax = Integer.MIN_VALUE;	
    public static int iMin = Integer.MAX_VALUE;	 
    public static int[] iOperator = new int[4];
    public static int[] iNumber;		 
    public static int iN;					

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        iN = Integer.parseInt(br.readLine());
        iNumber = new int[iN];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < iN; i++) {
            iNumber[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < 4; i++) {
            iOperator[i] = Integer.parseInt(st.nextToken());
        }

        dfs(iNumber[0], 1);

        System.out.println(iMax);
        System.out.println(iMin);

    }

    public static void dfs(int iNum, int iIdx) {
        if (iIdx == iN) {
            iMax = Math.max(iMax, iNum);
            iMin = Math.min(iMin, iNum);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (iOperator[i] > 0) {
                iOperator[i]--;

                switch (i) {

                case 0:	dfs(iNum + iNumber[iIdx], iIdx + 1);	break;
                case 1:	dfs(iNum - iNumber[iIdx], iIdx + 1);	break;
                case 2:	dfs(iNum * iNumber[iIdx], iIdx + 1);	break;
                case 3:	dfs(iNum / iNumber[iIdx], iIdx + 1);	break;

                }
                iOperator[i]++;
            }
        }
    }

}