import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int iPokemonNum = Integer.parseInt(st.nextToken());
    int iMatchNum = Integer.parseInt(st.nextToken());
    StringBuilder sb = new StringBuilder();
    
    HashMap<Integer, String> hash1 = new HashMap<Integer, String>();
    HashMap<String, Integer> hash2 = new HashMap<String, Integer>();

    for(int i = 1; i <= iPokemonNum; i++) {
      String sPokemonName = br.readLine();
      hash1.put(i, sPokemonName);
      hash2.put(sPokemonName, i);
    }

    for(int i = 0; i < iMatchNum; i++) {
      String sMatchQuestion = br.readLine();
      
      if(49 <= sMatchQuestion.charAt(0) && sMatchQuestion.charAt(0) <= 57) {
        sb.append(hash1.get(Integer.parseInt(sMatchQuestion))).append("\n");
      }else {
        sb.append(hash2.get(sMatchQuestion)).append("\n");
      }
    }
    System.out.println(sb);
  }
}