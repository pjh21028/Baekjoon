import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
  static int iBoardSize;
  static char [][] cBoard;
  static int iMax = 0;
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    iBoardSize = Integer.parseInt(br.readLine());
    cBoard = new char[iBoardSize][iBoardSize];

    for(int i = 0; i < iBoardSize; i++) {
      String iColor = br.readLine();
      for(int j = 0; j < iBoardSize; j++) {
        cBoard[i][j] = iColor.charAt(j);
      }
    }
    for (int i = 0; i < iBoardSize; i++) {
      for (int j = 0; j < iBoardSize - 1; j++) {
        swap(i, j, i, j + 1); 
        search();           
        swap(i, j + 1, i, j);
      }       
    }
    for (int i = 0; i < iBoardSize; i++) {
      for (int j = 0; j < iBoardSize - 1; j++) {
        swap(j, i, j + 1, i); 
        search();           
        swap(j + 1, i, j, i);
      }       
    }
    System.out.println(iMax);
  }
  public static void swap(int x1, int y1, int x2, int y2) {
    char cTemp = cBoard[x1][y1];
    cBoard[x1][y1] = cBoard[x2][y2];
    cBoard[x2][y2] = cTemp;
  }
  public static void search() {
    for (int i = 0 ; i < iBoardSize; i++) {   
      int iCount = 1;                
      for (int j = 0; j < iBoardSize - 1; j++) {     
        if (cBoard[i][j] == cBoard[i][j + 1]) {            
          iCount++;   
          iMax = Math.max(iCount, iMax);       
        } else {
          iCount = 1;
        }
      }
    }
    
    for (int i = 0 ; i < iBoardSize; i++) {   
      int iCount = 1;                
      for (int j = 0; j < iBoardSize - 1; j++) {     
        if (cBoard[j][i] == cBoard[j + 1][i]) {            
          iCount++;   
          iMax = Math.max(iCount, iMax);       
        } else {
          iCount = 1;
        }
      }
    }
  }
}