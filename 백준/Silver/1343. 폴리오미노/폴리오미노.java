import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   
    String sBoard = br.readLine();
    String[] sBoardArray = sBoard.split("\\.");
    StringBuilder sb = new StringBuilder();
    
    for (int i = 0; i < sBoardArray.length; i++) {
      String sSplitBoard = sBoardArray[i];
      if (sSplitBoard.length() % 2 != 0) {
        sb = new StringBuilder("-1");
        break;
      }
      else if (sSplitBoard.length() % 4 == 0) {
        sb.append("AAAA".repeat(sSplitBoard.length() / 4));
      } else {
        sb.append("AAAA".repeat(sSplitBoard.length() / 4));
        sb.append("BB");
      }
      if (i != sBoardArray.length - 1) {
        sb.append(".");
      }
    }
    String sResult = sb.toString();
    if (!sResult.equals("-1")) {
      sb.append(".".repeat(sBoard.length() - sb.toString().length()));
    }
    bw.write(sb + "\n");
    bw.flush();
    bw.close();
    br.close();
  }
}