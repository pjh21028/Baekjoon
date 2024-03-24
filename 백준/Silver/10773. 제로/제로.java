import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int iTop = -1;

    int iLine = Integer.parseInt(br.readLine());
    int[] iArray = new int[iLine];


    for(int i = 0; i < iLine; i++) {

      int iNum = Integer.parseInt(br.readLine());	

      if (iNum == 0) {	
        iTop--;	
      } 
      else {
        iTop++;	
        iArray[iTop] = iNum;
      }
    }
    int sum = 0;
    for (int i = 0; i <= iTop; i++) {	
      sum += iArray[i];
    }
    System.out.println(sum);

  }

}