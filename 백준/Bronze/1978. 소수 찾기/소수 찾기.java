import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
br.readLine(); // 첫 번째 줄을 읽어서 버림

int iTotalNum = 0;
StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 두 번째 줄을 읽어서 StringTokenizer 생성

while (st.hasMoreTokens()) {
    int iTestNum = Integer.parseInt(st.nextToken()); // 각 숫자를 읽어와서 처리
    boolean check = true;
    if(iTestNum == 1) {
        continue;
    }
    for(int j = 2; j <= Math.sqrt(iTestNum); j++) {
        if(iTestNum % j == 0) {
            check = false;
            break;
        }
    }
    if(check) {
        iTotalNum++;
    }
}
System.out.println(iTotalNum);
    }
}