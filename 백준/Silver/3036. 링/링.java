import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int iRingNum = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int iFirstRing = Integer.parseInt(st.nextToken());
            for (int i = 1; i < iRingNum; i++) {
                int iAnotherRing = Integer.parseInt(st.nextToken());
                int gcd = gcd(iFirstRing, iAnotherRing);

                sb.append(iFirstRing / gcd).append('/').append(iAnotherRing / gcd).append('\n');
                }
                System.out.println(sb); 
    }
            
    static int gcd(int a, int b) {
        int r;

        while (b != 0) {
            r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}