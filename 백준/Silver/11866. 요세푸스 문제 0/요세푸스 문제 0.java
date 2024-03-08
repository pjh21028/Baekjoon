import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    LinkedList<Integer> list = new LinkedList<Integer>();
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int iPeopleNum = Integer.parseInt(st.nextToken());
    int iOutingSequence = Integer.parseInt(st.nextToken());

    for(int i = 1; i <= iPeopleNum; i++) {
      list.add(i);
    }
    StringBuilder sb = new StringBuilder();
    sb.append('<');
    int index = 0;

    while(iPeopleNum > 1) {
      index = (index + (iOutingSequence - 1)) % iPeopleNum;
      sb.append(list.remove(index)).append(", "); 
      iPeopleNum--;
    }
    sb.append(list.remove()).append('>');
    System.out.println(sb);
  }
}