import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int iTestCase;
        try {
            iTestCase = Integer.parseInt(br.readLine());
        } catch (NumberFormatException e) {
            System.err.println("Invalid number of test cases");
            return;
        }

        for (int i = 0; i < iTestCase; i++) {
            long iNum;
            try {
                iNum = Long.parseLong(br.readLine());
            } catch (NumberFormatException e) {
                System.err.println("Invalid input for test case " + (i + 1));
                continue;
            }

            while (true) {
                long lCount = 0;
                for (long j = 2; j <= Math.sqrt(iNum); j++) {
                    if (iNum % j == 0) {
                        lCount++;
                        break;
                    }
                }
                if (lCount == 0) {
                    if (iNum == 0 || iNum == 1) {
                        iNum = 2;
                    }
                    System.out.println(iNum);
                    break;
                }
                iNum++;
            }
        }
    }
}