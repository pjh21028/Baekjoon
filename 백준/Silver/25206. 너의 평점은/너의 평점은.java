import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String sInputScoreArray[] = new String[20];
        double dTotalSum = 0;
        double dScoreSum = 0;
        double dAverage;
        String sGradeArray[] = {"A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F", "P"};
        double dGradeScoreArray[] = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};

        for (int i = 0; i < 20; i++) {
            sInputScoreArray[i] = br.readLine();
            StringTokenizer st = new StringTokenizer(sInputScoreArray[i], " ");
            String sSubject = st.nextToken();
            double dScore = Double.parseDouble(st.nextToken());
            String sGrade = st.nextToken();

            for (int j = 0; j < 10; j++) {
                if (sGrade.equals(sGradeArray[j])) {
                    dTotalSum += dScore * dGradeScoreArray[j];
                    if (j != 9) {
                        dScoreSum += dScore;
                    }
                }
            }
        }

        dAverage = dTotalSum / dScoreSum;
        System.out.printf("%.6f\n", dAverage);

        br.close();
    }
}