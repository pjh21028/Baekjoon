import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char[][] cArray = new char[5][16];
        for (int i = 0; i < 5; i++) {
            cArray[i] = reader.readLine().toCharArray();
        }

        for (int k = 0; k < 15; k++) {
            for (int i = 0; i < 5; i++) {
                if (cArray[i].length > k) {
                    System.out.print(cArray[i][k]);
                }
            }
        }

        reader.close();
    }
}