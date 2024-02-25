import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] iArray = new int[9];
        int iSum = 0;
        for (int i = 0; i < 9; i++) {
            iArray[i] = Integer.parseInt(br.readLine());
            iSum += iArray[i];
        }
        for (int i = 0; i < 8; i++) {
            for (int j = i+1; j < 9; j++) {
                if (iSum - iArray[i] - iArray[j] == 100) {
                    iArray[i] = 0;
                    iArray[j] = 0;
                    Arrays.sort(iArray);
                    for (int k = 2; k < 9; k++) {
                        System.out.println(iArray[k]);
                    }
                    return;
                }
            }
        }
    }
}