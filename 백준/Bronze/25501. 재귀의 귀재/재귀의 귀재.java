import java.util.*;
import java.io.*;
public class Main{
    static int iCount = 0; // recursion 호출 횟수
    public static int recursion(String s, int l, int r) {
        iCount++; // recursion 호출 횟수 증가
        if (l >= r)
            return 1;
        else if (s.charAt(l) != s.charAt(r))
            return 0;
        else
            return recursion(s, l + 1, r - 1);
    }

    public static int isPalindrome(String s) {
        iCount = 0;
        return recursion(s, 0, s.length() - 1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int iTestCase = Integer.parseInt(br.readLine());
        for(int i = 0; i < iTestCase; i++) {
            String sWord = br.readLine();
            System.out.println(isPalindrome(sWord) + " " + iCount);
        }
    }
}