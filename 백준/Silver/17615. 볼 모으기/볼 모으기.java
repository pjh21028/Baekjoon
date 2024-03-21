import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int iBallNum = Integer.parseInt(br.readLine());
        String sBalls = br.readLine();

        int iResult = 5000001;
        char[] cArray = sBalls.toCharArray();

        int iFirstBallCnt = 0;
        int iRedCnt = 0;
        int iBlueCnt = 0;

        for (int i = 0; i < iBallNum; i++) {
            if (cArray[i] == 'R') {
                iRedCnt += 1;
            }
            if (cArray[i] == 'B') {
                iBlueCnt += 1;
            }
        }

        for (int i = 0; i < iBallNum; i++) {
            if (cArray[i] == 'R') {
                iFirstBallCnt += 1;
            } else {
                break;
            }
        }

        iResult = Math.min(iResult, iRedCnt - iFirstBallCnt);

        iFirstBallCnt = 0;
        for (int i = iBallNum - 1; i >= 0; i--) {
            if (cArray[i] == 'R') {
                iFirstBallCnt += 1;
            } else {
                break;
            }
        }

        iResult = Math.min(iResult, iRedCnt - iFirstBallCnt);

        iFirstBallCnt = 0;
        for (int i = 0; i < iBallNum; i++) {
            if (cArray[i] == 'B') {
                iFirstBallCnt += 1;
            } else {
                break;
            }
        }

        iResult = Math.min(iResult, iBlueCnt - iFirstBallCnt);

        iFirstBallCnt = 0;
        for (int i = iBallNum - 1; i >= 0; i--) {
            if (cArray[i] == 'B') {
                iFirstBallCnt += 1;
            } else {
                break;
            }
        }

        iResult = Math.min(iResult, iBlueCnt - iFirstBallCnt);

        System.out.println(iResult);
        br.close();
    }
}