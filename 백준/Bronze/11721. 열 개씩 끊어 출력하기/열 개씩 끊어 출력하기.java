import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sInput = br.readLine();
        for (int i = 0; i < sInput.length(); ++i) {
            System.out.print(sInput.charAt(i));
            if (i % 10 == 9) {
                System.out.println();
            }
        }
    }
}