import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine()," ");

    int iRow = Integer.parseInt(st.nextToken());
    int iColumn = Integer.parseInt(st.nextToken());

    int[][] A = new int[iRow][iColumn];
    int[][] B = new int[iRow][iColumn];

    for(int i = 0; i < iRow; i++) {
      String sInput = br.readLine();
      for(int j = 0; j < iColumn; j++) {
        A[i][j] = sInput.charAt(j)-'0';
      }
    }
    for(int i = 0; i < iRow; i++) {
      String input = br.readLine();
      for(int j = 0; j < iColumn; j++) {
        B[i][j]=input.charAt(j)-'0';
      }
    }

    int iCount=0;
    if(iRow >= 3 && iColumn >= 3) {
      for(int i=0; i < iRow-2; i++) {
        for(int j=0; j < iColumn-2; j++) {
          if(A[i][j] != B[i][j]) {
            for(int x = i; x < i+3; x++) {
              for(int y=j; y < j+3; y++) {
                if(A[x][y] == 0) {
                  A[x][y] = 1;
                }
                else A[x][y] = 0;
              }
            }
            iCount++;
          }
        }
      }
    }

    for(int i = 0; i < iRow; i++) {
      for(int j=0; j < iColumn; j++) {
        if(A[i][j] != B[i][j]) {
          System.out.println(-1);
          return;
        }
      }
    }

    System.out.println(iCount);
  }
}