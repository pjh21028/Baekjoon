import java.io.*;

public class Main {
  public static void main(String[] args) throws IOException  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int iButtonNum = Integer.parseInt(br.readLine());
    int iCnt1 = 1, iCnt2 = 0, iCant = 9321321;
    String sInput = br.readLine();
    String sExpect = br.readLine();

    int[] iFirstOn = new int[iButtonNum];
    int[] iFirstOff = new int[iButtonNum];
    int[] ExpectArray = new int[iButtonNum];

    for(int i = 0; i < iButtonNum; i++) {
      iFirstOn[i] = sInput.charAt(i)-'0';
      iFirstOff[i] = sInput.charAt(i)-'0';
      ExpectArray[i] = sExpect.charAt(i)-'0';
    }
    iFirstOn[0] = 1 - iFirstOn[0];
    iFirstOn[1] = 1 - iFirstOn[1];
    
    for(int i = 1; i < iButtonNum; i++) {
      if(iFirstOn[i-1] != ExpectArray[i-1]) {
        iFirstOn[i-1] = 1 - iFirstOn[i-1];
        iFirstOn[i] = 1 - iFirstOn[i];
        iCnt1++;
        if(i != iButtonNum - 1) {
          iFirstOn[i+1] = 1 - iFirstOn[i+1];
        }
      }
      if(iFirstOff[i-1] != ExpectArray[i-1]) {
        iFirstOff[i-1] = 1 - iFirstOff[i-1];
        iFirstOff[i] = 1 - iFirstOff[i];
        iCnt2++;
        if(i != iButtonNum - 1) {
          iFirstOff[i+1] = 1 - iFirstOff[i+1];
        }
      }
    }
      if(iFirstOn[iButtonNum-1] != ExpectArray[iButtonNum-1]) {
        iCnt1 = iCant;
      }
      if(iFirstOff[iButtonNum-1] != ExpectArray[iButtonNum-1]) {
        iCnt2 = iCant;
      }
      if(iCnt1 == iCant && iCnt2 == iCant) {
        System.out.println(-1);
      }
      else {
        System.out.println(Math.min(iCnt1, iCnt2));
      }
  }
}