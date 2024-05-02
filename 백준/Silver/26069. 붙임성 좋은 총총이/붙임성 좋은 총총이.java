import java.io.*;
import java.util.*;

class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    String person1, person2; 
    HashSet<String> hs = new HashSet<String>();
      hs.add("ChongChong");

    int iPeopleNum = Integer.parseInt(br.readLine());

    for(int i = 0; i < iPeopleNum; i++){
        st = new StringTokenizer(br.readLine());
        person1 = st.nextToken();
        person2 = st.nextToken();

        if(hs.contains(person1) || hs.contains(person2)){
            hs.add(person1);
            hs.add(person2);
        }
    }
    System.out.println(hs.size());
  }

}