import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int sInput = Integer.parseInt(st.nextToken());
    int iRadix = Integer.parseInt(st.nextToken());
    br.close();      
    StringBuilder sb = new StringBuilder();

    while(sInput != 0) {
        if(sInput % iRadix >= 10) {
          sb.append((char) ((sInput % iRadix) + 55));
        } 
        else {
          sb.append(sInput % iRadix);
        }
        sInput /= iRadix;
    }
    System.out.println(sb.reverse().toString());
  }
}