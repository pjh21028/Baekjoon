import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int iPeopleNum = Integer.parseInt(br.readLine());

        Integer[] iArray = new Integer[iPeopleNum];
        for (int i = 0; i < iPeopleNum; i++) {
              iArray[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(iArray, Comparator.reverseOrder()); 

        long iResult = 0;
        for (int i = 0; i < iPeopleNum; i++) {
            if (iArray[i] - i <= 0) {
                break;
            }

            iResult += iArray[i] - i;
        }
        bw.write(iResult + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}