import java.io.*;
import java.util.*;
import java.lang.Math;

public class SetsAndMaps_Gates {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        
        StringTokenizer st = new StringTokenizer(r.readLine());
        int G = Integer.parseInt(st.nextToken());
        StringTokenizer tt = new StringTokenizer(r.readLine());
        int P = Integer.parseInt(tt.nextToken());

        ArrayList<Integer> arr = new ArrayList<>();
        for (int b=1; b<G+1; b++) {
            arr.add(b);
        }

        int total = 0;

        for (int i=0; i<Math.min(G, P); i++) {
            StringTokenizer nxt = new StringTokenizer(r.readLine());
            int m = Integer.parseInt(nxt.nextToken());
            int start = 0;
            int end = arr.size()-1;
            int middle = -1;
            while (start <= end) {
                if (arr.get((start + end) / 2) < m) {
                    middle = (start + end) / 2;
                    start = (start + end) / 2 +1;
                } else if (arr.get((start + end) / 2) == m) {
                    middle = (start + end) / 2;
                    break;
                } else {
                    end = (start + end)/2 -1;
                }
            }

            if (middle != -1 && arr.get(middle) <= m) {
                total ++;
                arr.remove(middle);
            } else {
                break;
            }
        }

        System.out.println(total);
    }
}
