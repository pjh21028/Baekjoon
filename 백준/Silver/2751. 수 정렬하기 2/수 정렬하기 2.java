import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    
    boolean[] bArray = new boolean[2000001];
    int iNum = Integer.parseInt(br.readLine());
    for(int i = 0; i < iNum; i++) {
      bArray[Integer.parseInt(br.readLine()) + 1000000] = true;
    }
    for(int i = 0; i < bArray.length; i++) {
      if(bArray[i]) {
        sb.append((i - 1000000)).append('\n');
      }
    }
    System.out.print(sb);
  }
}