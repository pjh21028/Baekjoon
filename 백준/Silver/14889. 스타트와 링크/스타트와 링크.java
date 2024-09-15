import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {

    static int iNum;
    static int[][] iMap;
    static boolean[] bVisit;

    static int iMin = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        iNum = Integer.parseInt(br.readLine());

        iMap = new int[iNum][iNum];
        bVisit = new boolean[iNum];


        for (int i = 0; i < iNum; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            for (int j = 0; j < iNum; j++) {
                iMap[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        combi(0, 0);
        System.out.println(iMin);

    }


    static void combi(int idx, int count) {
        if(count == iNum / 2) {
            diff();
            return;
        }

        for(int i = idx; i < iNum; i++) {
            if(!bVisit[i]) {
                bVisit[i] = true;	
                combi(i + 1, count + 1);	
                bVisit[i] = false;
            }
        }
    }

    static void diff() {
        int team_start = 0;
        int team_link = 0;

        for (int i = 0; i < iNum - 1; i++) {
            for (int j = i + 1; j < iNum; j++) {
                if (bVisit[i] == true && bVisit[j] == true) {
                    team_start += iMap[i][j];
                    team_start += iMap[j][i];
                } 
                else if (bVisit[i] == false && bVisit[j] == false) {
                    team_link += iMap[i][j];
                    team_link += iMap[j][i];
                }
            }
        }
        int iVal = Math.abs(team_start - team_link);

        if (iVal == 0) {
            System.out.println(iVal);
            System.exit(0);
        }

        iMin = Math.min(iVal, iMin);

    }

}