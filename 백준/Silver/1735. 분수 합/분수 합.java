import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        int iNumerator = A * D + B * C;
        int iDenominator = B * D;

        int iFind = getGCD(iNumerator, iDenominator);
        iNumerator /= iFind;
        iDenominator /= iFind;

        bw.write(iNumerator + " " + iDenominator + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    public static int getGCD(int a, int b) {

        if (a <= b) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (b == 0) {
            return a;
        }
        return getGCD(b , a % b);
    }

}