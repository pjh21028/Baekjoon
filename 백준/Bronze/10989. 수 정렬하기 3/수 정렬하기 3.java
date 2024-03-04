import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    int iIntegerNum = Integer.parseInt(br.readLine());
    int[] iArray = new int[iIntegerNum];

    for(int i = 0; i < iIntegerNum; i++){
        iArray[i] = Integer.parseInt(br.readLine());
    }

    Arrays.sort(iArray);

    for(int i = 0; i < iIntegerNum; i++){
      sb.append(iArray[i]).append('\n');
    }

    System.out.println(sb);
  }
}