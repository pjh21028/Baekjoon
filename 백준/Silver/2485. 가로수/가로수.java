import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int iNum = Integer.parseInt(br.readLine());

        int[] iStreetTree =new int[iNum];

        for(int i = 0; i < iNum; i++){
          iStreetTree[i]= Integer.parseInt(br.readLine());
        }

        br.close();

        int iGCD = 0; //가로수 간격의 최대 공약수를 저장하는 변수

        for(int i = 0; i < iNum - 1; i++){
            int distance = iStreetTree[i+1] - iStreetTree[i];
            iGCD = getGCD(distance, iGCD); //가로수 간격의 최대 공약수
        }
        bw.write((iStreetTree[iNum-1]-iStreetTree[0])/iGCD+1-(iStreetTree.length) + "");
        bw.flush();
        bw.close();

    }

    static int getGCD(int A, int B){
        while(B != 0){
            int R = A%B;
            A = B;
            B = R;
        }
        return A;
    }
}