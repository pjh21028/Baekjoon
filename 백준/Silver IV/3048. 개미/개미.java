import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iNum1 = 0, iNum2 = 0, iCountTime = 0;
        int iTime;
        String sRightAnt, sLeftAnt, sAnt;

        StringTokenizer st = new StringTokenizer(br.readLine());
        iNum1 = Integer.parseInt(st.nextToken());
        iNum2 = Integer.parseInt(st.nextToken());

        sRightAnt = br.readLine();
        sLeftAnt = br.readLine();
        iTime = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder(sRightAnt);
        sb.reverse();
        sAnt = sb.toString() + sLeftAnt;

        while (iCountTime < iTime) {
            for (int i = 0; i < iNum1 + iNum2 - 1; i++) {
                if (sRightAnt.indexOf(sAnt.charAt(i)) != -1 && sLeftAnt.indexOf(sAnt.charAt(i + 1)) != -1) {
                    char[] chars = sAnt.toCharArray();
                    char temp = chars[i];
                    chars[i] = chars[i + 1];
                    chars[i + 1] = temp;
                    sAnt = new String(chars);
                    i++;
                }
            }
            iCountTime += 1;
        }
        System.out.println(sAnt);
    }
}