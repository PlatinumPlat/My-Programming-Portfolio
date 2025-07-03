import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SetsAndMaps_2_Power_Rankings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int K = in.nextInt();
        
        Map<Integer, String> c = new HashMap<>();
        int[] times = new int[N];
        String[] names = new String[N];

        for (int a=0; a<N; a++) {
            names[a] = in.next();
        }

        for (int b=0; b<K; b++) {
            for (int d=0; d<N; d++) {
                times[d] += in.nextInt();
            }
        }

        for (int e=0; e<N; e++) {
            c.put(times[e], names[e]);
        }

        Arrays.sort(times);

        int z = 3;
        for (int i=N-1; i>=0; i--) {
            System.out.print(z);
            System.out.print(". ");
            System.out.print(c.get(times[i]));
            System.out.println();
            z++;
        }
    }
}