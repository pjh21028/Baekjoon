import java.io.*;
import java.util.*;

public class Main {
    public static boolean[] bPrime = new boolean[10001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        get_prime();
        int iTestcase = Integer.parseInt(br.readLine());
        for(int i = 0; i < iTestcase; i++) {
            int iNum = Integer.parseInt(br.readLine());
            int iFirst_partition = iNum / 2;
            int iSecond_partition = iNum / 2;
            while (true) {
                    if (!bPrime[iFirst_partition] && !bPrime[iSecond_partition]) {
                        sb.append(iFirst_partition).append(' ').append(iSecond_partition).append('\n');
                        break;
                    }
                    iFirst_partition--;
                    iSecond_partition++;
                }
            }
        System.out.print(sb);
    }  

    
    public static void get_prime() {
        bPrime[0] = bPrime[1] = true;
        for (int i = 2; i <= Math.sqrt(bPrime.length); i++) {
            if (bPrime[i]) {
                continue;
            }
            for (int j = i * i; j < bPrime.length; j += i) {
                bPrime[j] = true;
            }
        }
    }
}