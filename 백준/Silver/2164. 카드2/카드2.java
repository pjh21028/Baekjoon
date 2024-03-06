import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int iNum = Integer.parseInt(br.readLine());

    int[] iQue = new int[2 * iNum];	  
    for(int i = 1; i <= iNum; i++) {
      iQue[i] = i;
    }
    int iPrev_index = 1;
    int iLast_index = iNum;

    while(iNum-- > 1) {
      iPrev_index++;
      iQue[iLast_index + 1] = iQue[iPrev_index];
      iLast_index++;
      iPrev_index++;
    }
    System.out.println(iQue[iPrev_index]);
  }
}