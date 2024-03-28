import java.io.*;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int iWidth = Integer.parseInt(br.readLine());
    int iLength = Integer.parseInt(br.readLine());
    int iArea = iWidth*iLength;
    
    System.out.println(iArea);
  }
}