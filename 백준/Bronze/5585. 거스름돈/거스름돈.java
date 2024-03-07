import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
public class Main { 	
  public static void main(String[] args) throws IOException {		
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
    int iCost = Integer.parseInt(br.readLine());
    int[] coinArr = {500, 100, 50, 10, 5, 1};
    iCost = 1000 - iCost;
    int iNum =0;
    for(int i=0; i < 6 ; i++){
      if(iCost/coinArr[i]>0) {		
        iNum += iCost/coinArr[i];		
        iCost = iCost%coinArr[i];		
      }		
    }		
    System.out.println(iNum);	
  }
}