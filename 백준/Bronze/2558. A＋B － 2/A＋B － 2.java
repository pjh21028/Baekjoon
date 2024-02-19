import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iNum1 = Integer.parseInt(br.readLine());
        int iNum2 = Integer.parseInt(br.readLine());
        int iResult = iNum1 + iNum2;
        System.out.print(iResult);
    }
}