import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        int iTotalExtent = 0; 
        int iColorPaperNum = Integer.parseInt(bReader.readLine());  
        boolean[][] bArr = new boolean[101][101];  
        for (int i = 0; i < iColorPaperNum; i++) {
            StringTokenizer sTokenizer = new StringTokenizer(bReader.readLine());
            int x = Integer.parseInt(sTokenizer.nextToken());
            int y = Integer.parseInt(sTokenizer.nextToken());

            for (int j = x; j < x+10; j++) {
                for (int k = y; k < y+10; k++) {
                    if (!bArr[j][k]) {
                        bArr[j][k] = true;
                        iTotalExtent++;
                    }
                }
            }
        }
        System.out.print(iTotalExtent);
    }
}