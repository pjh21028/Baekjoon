import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String sString = br.readLine();
    HashMap<String, Integer> hm = new HashMap<>();

    for (int i = 0; i < sString.length(); i++) {
        for (int j = i+1; j <= sString.length(); j++) {
          hm.put(sString.substring(i, j), i);
        }
    }
    bw.write(String.valueOf(hm.size()));
    bw.flush();
    bw.close();
  }
}