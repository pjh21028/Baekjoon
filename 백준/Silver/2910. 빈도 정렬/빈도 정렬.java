import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
      
        StringTokenizer st = new StringTokenizer(br.readLine());
        int iNum = Integer.parseInt(st.nextToken());
        int iNumRange = Integer.parseInt(st.nextToken());

        HashMap<Integer, Integer> Lhm = new LinkedHashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < iNum; i++) {
            int iSortNum = Integer.parseInt(st.nextToken());
            if (Lhm.containsKey(iSortNum)) {
                Lhm.put(iSortNum, Lhm.get(iSortNum) + 1);
            } else {
                Lhm.put(iSortNum, 1);
            }
        }

        List<Integer> list = new ArrayList<>(Lhm.keySet());

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return Integer.compare(Lhm.get(b), Lhm.get(a));
            }
        });
        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            Integer element = it.next();
            for (int i = 0; i < Lhm.get(element); i++) {
                sb.append(element + " ");
            }
        }
        System.out.println(sb);
    }
}