import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main { 	
  public static void main(String[] args) throws IOException {		
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
    int iTime = Integer.parseInt(br.readLine());
    int[] iButtonTime = {300, 60, 10};
    int[] iButtonCount = new int [3];
    
    for(int i=0; i < 3 ; i++){
      if(iTime/iButtonTime[i]>0) {
        iButtonCount[i] = iTime/iButtonTime[i];
        iTime = iTime % iButtonTime[i];
      }
    }
    for(int i=0; i < 3 ; i++){
      if(iTime != 0) {
        System.out.print("-1");
        break;
      }
      System.out.print(iButtonCount[i] + " ");	
    }
  }
}