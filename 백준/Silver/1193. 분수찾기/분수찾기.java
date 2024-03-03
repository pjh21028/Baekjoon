import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine()); 
        br.close();
      
        int iSquareCount = 1; 
        int iSquareSum =  0; 
      
        while(true){
            if(X <= iSquareSum + iSquareCount){
                if(iSquareCount % 2 == 1){ 
                    System.out.println((iSquareCount-(X - iSquareSum -1) + "/" + (X - iSquareSum)));
                    break;
                }else{ 
                    System.out.println((X - iSquareSum) + "/" + (iSquareCount-(X - iSquareSum -1)));
                    break;
                }
            }else{ 
                iSquareSum += iSquareCount;
                iSquareCount++; 
            }
        }
    }
}