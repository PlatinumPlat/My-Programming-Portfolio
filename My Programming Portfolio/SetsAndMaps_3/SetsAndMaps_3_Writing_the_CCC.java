package SetsAndMaps_3;
import java.util.*;
import java.io.*;

public class SetsAndMaps_3_Writing_the_CCC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int T = in.nextInt();
        String order[] = new String[T];
        Map<String, ArrayList<Integer>> map = new HashMap<>();

        for (int a=0; a<T; a++) {
            order[a] = in.next();

            ArrayList<Integer> v = new ArrayList<>();
            map.put(order[a], v);
        }

        int N = in.nextInt();

        for (int i=0; i<N; i++) {
            ArrayList<Integer> vs = new ArrayList<>();
            String type = in.next();
            vs = map.get(type);
            vs.add(i+1);
            map.put(type, vs);
        }

        for (int z=0; z<T; z++) {
            ArrayList<Integer> vs = new ArrayList<>();
            vs = map.get(order[z]);
            for (int y=0; y<vs.size(); y++) {
                System.out.println(vs.get(y));
            }
        }

    }
}
