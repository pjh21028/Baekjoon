import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iMax = 0, iRow = 1, iColumn = 1; 

        for (int i = 1; i <= 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j<= 9; j++) {
                int iNum = Integer.parseInt(st.nextToken());
                if (iNum > iMax) {
                    iMax = iNum;
                    iRow = i;
                    iColumn = j;
                }
            }
        }
        System.out.println(iMax);
        System.out.println(iRow + " " + iColumn);
    }

}