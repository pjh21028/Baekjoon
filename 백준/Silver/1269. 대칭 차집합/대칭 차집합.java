import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int iASet = Integer.parseInt(st.nextToken()); 
    int iBSet = Integer.parseInt(st.nextToken()); 

    HashSet<Integer> hs = new HashSet<Integer>(); 

    st = new StringTokenizer(br.readLine()); 
    for(int i = 0; i < iASet; i++) {
      hs.add(Integer.parseInt(st.nextToken()));
    }

    st = new StringTokenizer(br.readLine()); 
    for(int i = 0; i < iBSet; i++) {
      hs.add(Integer.parseInt(st.nextToken()));
    }
    
    br.close();
    bw.write((hs.size() - iASet) + (hs.size() - iBSet) + "");
    bw.flush();
    bw.close();
    }
}