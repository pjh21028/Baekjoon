import java.util.*;
import java.io.*;

public class Main{
    int[] iArray; 
    static int[] iTmp;
    static int iResult = -1; 
    static int iCount = 0; 
    static int SaveNum; 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int iArraySize = Integer.parseInt(st.nextToken()); 
        SaveNum = Integer.parseInt(st.nextToken()); 

        int[] iArray = new int[iArraySize];
        iTmp = new int[iArraySize];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < iArraySize; i++){ 
            iArray[i] = Integer.parseInt(st.nextToken());
        }
        merge_sort(iArray, 0, iArraySize-1); 
        System.out.println(iResult);
    }

    static void merge_sort(int A[], int p, int r){
        if(iCount > SaveNum) return; 
        if(p < r){
            int q = (p+r)/2; 
            merge_sort(A, p, q);  
            merge_sort(A,q+1, r); 
            merge(A, p, q, r);
        }
    }
    static void merge(int Array[], int p, int q, int r){
        int i = p;
        int j = q + 1; //쪼갠 배열(2번째) 시작 인덱스
        int t = 0;

        //시작 인덱스가 중간 인덱스(1번쨰)보다 작고,
        //중간인덱스(2번째)가 마지막인덱스보다 작을 경우 반복
        while(i <= q && j <= r){
            if(Array[i] < Array[j]){ //만약 Array[i](=앞의 값)이/가 Array[j](=뒤의 값)보다 작을 경우
                iTmp[t++] = Array[i++]; //작은 값을 넣어주고
            }
            else{//만약 Array[i](=앞의 값)이/가 Array[j](=뒤의 값)보다 크거나 같을 경우
                iTmp[t++] = Array[j++]; //작은 값이 Array[j]이므로 작은 값을 차근차근 쌓는다.
            }
        }

        //다 정렬하고도 남은 경우
        while(i <= q){ //왼쪽 배열이 남은 경우
            iTmp[t++] = Array[i++]; //tmp배열에 저장하는 정수
        }

        while(j <= r){ //오른쪽 배열이 남은 경우
            iTmp[t++] = Array[j++]; //tmp배열에 저장하는 정수
        }

        i = p;
        t = 0;
        while(i <= r){ //결과를 배열 A에 저장한다. i(시작), r(끝)
            iCount++;

            if(iCount == SaveNum){ //저장횟수가 같다면
                iResult = iTmp[t]; //해당 증가한 만큼의 t인덱스의 값을 result변수에 담고
               break;
            }

            Array[i++] = iTmp[t++]; //A에 순서대로 정렬된 값을 저장
        }
    }
}