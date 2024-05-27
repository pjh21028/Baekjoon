import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iWantStick = Integer.parseInt(br.readLine());
        int iCount = 0;
        int[] iSplitArray = {64, 32, 16, 8, 4, 2, 1};
        int iSum = 0;

        for(int i = 0; i < 7; i++) {
            if(iSplitArray[i] <= iWantStick) {
                iSum += iSplitArray[i];
                iCount++;
            }
            if(iSum > iWantStick) {
                iSum -= iSplitArray[i];
                iCount--;
            }
            if(iSum == iWantStick) {
                break;
            }
        }
        System.out.println(iCount);
    }
}