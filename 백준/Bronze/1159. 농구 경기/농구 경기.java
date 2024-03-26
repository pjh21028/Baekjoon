import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] iAlphabetArray = new int[26];

        int iPlayerNum = Integer.parseInt(br.readLine());
        for (int i = 0; i < iPlayerNum; i++) {
            String iPlayerName = br.readLine();
            char cFirstLetter = iPlayerName.charAt(0);
            iAlphabetArray[cFirstLetter - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        boolean bPossible = false;
        for (int i = 0; i < 26; i++) {
            if (iAlphabetArray[i] >= 5) {
                sb.append((char) (i + 'a'));
                bPossible = true;
            }
        }

        if (bPossible) {
            System.out.println(sb.toString());
        } else {
            System.out.print("PREDAJA");
        }
    }
}