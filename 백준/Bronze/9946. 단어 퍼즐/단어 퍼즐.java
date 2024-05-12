import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iCaseNum = 1;
        while (true) {
            String iOriginalWord = br.readLine();
            String iCollectedLetters = br.readLine();

            if (iOriginalWord.equals("END") && iCollectedLetters.equals("END")) {
                break;
            }
            String sortedOriginal = sortString(iOriginalWord);
            String sortedCollected = sortString(iCollectedLetters);

            if (sortedOriginal.equals(sortedCollected)) {
                System.out.println("Case " + iCaseNum + ": same");
            } else {
                System.out.println("Case " + iCaseNum + ": different");
            }
            iCaseNum++;
        }
    }

    public static String sortString(String str) {
        char[] cArray = str.toCharArray();
        Arrays.sort(cArray);
        return new String(cArray);
    }
}