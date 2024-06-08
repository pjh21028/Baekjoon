import java.io.*;
import java.util.*;

public class Main {
    public static long lC;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long lA = Long.parseLong(st.nextToken());
        long lB = Long.parseLong(st.nextToken());
        lC = Long.parseLong(st.nextToken());

        System.out.println(pow(lA, lB));
    }
    public static long pow(long lA, long lExponent) {
        if(lExponent == 1) {
            return lA % lC;
        }
        long lTemp = pow(lA, lExponent / 2);
        
        if(lExponent % 2 == 1) {
            return (lTemp * lTemp % lC) * lA % lC;
        }
        return lTemp * lTemp % lC;

    }
    
}