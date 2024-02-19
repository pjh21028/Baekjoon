import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int iNum = Integer.parseInt(br.readLine());
        br.close();
        int iResult = 1;
        while(iNum != 0) {
			iResult = iResult * iNum;
			iNum--;
		}
        System.out.print(iResult);
    }
}