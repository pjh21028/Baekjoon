import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {

    public static int[] iArr;
    public static int iNum;
    public static int iCount = 0;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        iNum = Integer.parseInt(br.readLine());
        iArr = new int[iNum];

        nQueen(0);
        System.out.println(iCount);
    }
    
    public static void nQueen(int iDepth) {
        if (iDepth == iNum) {
            iCount++;
            return;
        }
        for (int i = 0; i < iNum; i++) {
            iArr[iDepth] = i;
            if (Possibility(iDepth)) {
                nQueen(iDepth + 1);
            }
        }
    }

    public static boolean Possibility(int iCol) {

        for (int i = 0; i < iCol; i++) {
            if (iArr[iCol] == iArr[i]) {
                return false;
            } 
            else if (Math.abs(iCol - i) == Math.abs(iArr[iCol] - iArr[i])) {
                return false;
            }
        }
        return true;
    }

}