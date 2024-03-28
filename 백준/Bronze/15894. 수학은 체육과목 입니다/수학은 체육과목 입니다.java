import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long iRegtangleNum = Integer.parseInt(br.readLine());
    long iResult;

    iResult = iRegtangleNum*4;
    System.out.println(iResult);
  }
}
