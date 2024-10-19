import java.io.*;
import java.util.*;

public class Main {
    public static int[][] iArr = new int[9][9];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < 9; j++) {
                iArr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        sudoku(0, 0);
    }
    public static void sudoku(int iRow, int iCol) {
        if (iCol == 9) {
            sudoku(iRow + 1, 0);
            return;
        }

        if (iRow == 9) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sb.append(iArr[i][j]).append(' ');
                }
                sb.append('\n');
            }
            System.out.print(sb);
            System.exit(0);
        }

        if (iArr[iRow][iCol] == 0) {
            for (int i = 1; i <= 9; i++) {
                if (possibility(iRow, iCol, i)) {
                    iArr[iRow][iCol] = i;
                    sudoku(iRow, iCol + 1);
                }
            }
            iArr[iRow][iCol] = 0;
            return;
        }

        sudoku(iRow, iCol + 1);
    }
    public static boolean possibility(int iRow, int iCol, int iValue) {
        for (int i = 0; i < 9; i++) {
            if (iArr[iRow][i] == iValue) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (iArr[i][iCol] == iValue) {
                return false;
            }
        }

        int iSet_r = (iRow / 3) * 3; 
        int iSet_c = (iCol / 3) * 3; 

        for (int i = iSet_r; i < iSet_r + 3; i++) {
            for (int j = iSet_c; j < iSet_c + 3; j++) {
                if (iArr[i][j] == iValue) {
                    return false;
                }
            }
        }

        return true; 
    }
}