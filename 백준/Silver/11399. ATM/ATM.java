import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int iPeopleNum = Integer.parseInt(br.readLine());

    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int[] iPeopleNumArray = new int[1001];

    while (iPeopleNum-- > 0) {
      iPeopleNumArray[Integer.parseInt(st.nextToken())]++;
    }

    int iPrevSum = 0;
    int iSum = 0;

    for (int i = 0; i < 1001; i++) {
      while (iPeopleNumArray[i]-- > 0) {
        iSum += (i + iPrevSum);
        iPrevSum += i;
      }
    }
    System.out.println(iSum);
  }
}