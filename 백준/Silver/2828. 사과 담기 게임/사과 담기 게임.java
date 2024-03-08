import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main { 	
  public static void main(String[] args) throws IOException {		
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int iScreenLength = Integer.parseInt(st.nextToken());
    int iBasketLength = Integer.parseInt(st.nextToken());

    int iAppleNum = Integer.parseInt(br.readLine());

    int iBasketLeft = 1;  
    int iBasketRight = iBasketLength;  
    int iMovingSum = 0; 

    for(int i = 0; i < iAppleNum; i++) {
      int iFallingPosition = Integer.parseInt(br.readLine());
      
      if(iBasketLeft <= iFallingPosition && iFallingPosition <= iBasketRight) {
        continue;
      }
      
      if(iBasketLeft > iFallingPosition) {
            iMovingSum += (iBasketLeft - iFallingPosition);
            iBasketRight -= (iBasketLeft - iFallingPosition);
            iBasketLeft = iFallingPosition;
          }
      else{
        iMovingSum += (iFallingPosition - iBasketRight);
        iBasketLeft += (iFallingPosition - iBasketRight);
        iBasketRight = iFallingPosition;
      }
    }
    System.out.println(iMovingSum);
  }
}    