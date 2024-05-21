import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int iTestCase = Integer.parseInt(br.readLine());
        
        for(int i = 1; i <= iTestCase; i++) {
            int iPeopleNum = Integer.parseInt(br.readLine());
            int [] iIDArray = new int[iPeopleNum];
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int j = 0; j < iPeopleNum; j++) {
                iIDArray[j] = Integer.parseInt(st.nextToken());
            }
            for (int x = 0; x < iPeopleNum; x++) {
                int iCount = 0;
                for (int y = 0; y < iPeopleNum; y++) {
                    if (iIDArray[x] == iIDArray[y]) {
                        iCount++;
                    }
                }
                if (iCount == 1) {
                    System.out.println("Case #" + i + ": " + iIDArray[x]);
                }
            }
        }
    }
}