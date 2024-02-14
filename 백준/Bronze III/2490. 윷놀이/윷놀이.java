import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 3; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int iNum1 = Integer.parseInt(tokenizer.nextToken());
            int iNum2 = Integer.parseInt(tokenizer.nextToken());
            int iNum3 = Integer.parseInt(tokenizer.nextToken());
            int iNum4 = Integer.parseInt(tokenizer.nextToken());
            int iSum = iNum1 + iNum2 + iNum3 + iNum4;

            StringBuilder sb = new StringBuilder();
            if (iSum == 0)
                sb.append('D');
            else if (iSum == 1)
                sb.append('C');
            else if (iSum == 2)
                sb.append('B');
            else if (iSum == 3)
                sb.append('A');
            else if (iSum == 4)
                sb.append('E');

            System.out.println(sb.toString());
        }

        reader.close();
    }
}