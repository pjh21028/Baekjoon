import java.io.*;
import java.util.*;

public class Main {
    static int[][][] iDP = new int[21][21][21];
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int iNum1 = Integer.parseInt(st.nextToken());
            int iNum2 = Integer.parseInt(st.nextToken());
            int iNum3 = Integer.parseInt(st.nextToken());

            if (iNum1 == -1 && iNum2 == -1 && iNum3 == -1) {
                break;
            }
            sb.append("w(" + iNum1 + ", " + iNum2 + ", " + iNum3 + ") = ").append(w(iNum1 ,iNum2 ,iNum3)).append('\n');
        }
        System.out.println(sb);
    }
            
    static int w(int a, int b, int c) { 

            if(inRange(a, b, c) && iDP[a][b][c] != 0) {
                return iDP[a][b][c];
            }

            if(a <= 0 || b <= 0 || c <= 0) {
                return 1;
            }

            if(a > 20 || b > 20 || c > 20) {
                return iDP[20][20][20] = w(20, 20, 20);
            }

            if(a < b && b < c) {
                return iDP[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
            }

            return iDP[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
        }

        static boolean inRange(int a, int b, int c) {
            return 0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20; 
        }
    }