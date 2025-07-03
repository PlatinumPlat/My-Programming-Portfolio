import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class SetsAndMaps_2_Bosses {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        long H = in.nextLong();
        long P = in.nextLong();

        long[] levels = new long[N + 1];
        levels[0] = 0L;
        for (int i = 1; i < N + 1; i++) {
            levels[i] = in.nextLong();
        }

        Arrays.sort(levels);
        long min = Long.MAX_VALUE;
        long sum = 0;
        long count = 0;

        for (int a = N; a >= 0; a--) {
            long height = levels[a];
            long hpCost = height * H;
            long potionCost = (sum - count * height) * P;
            min = Math.min(min, hpCost + potionCost);

            sum += levels[a];
            count++;
        }

        System.out.println(min);
    }
}