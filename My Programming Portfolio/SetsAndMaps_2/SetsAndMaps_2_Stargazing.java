import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsAndMaps_2_Stargazing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        Set<String> c = new HashSet<>();
        long[] xNums = new long[N];
        long[] yNums = new long[N];
        c.add("0,0");
        xNums[0] = 0;
        yNums[0] = 0;
        for (int i=0; i<N-1; i++) {
            int d = in.nextInt();
            long a = in.nextLong();
            long b = in.nextLong();

            a += xNums[d-1];
            b += yNums[d-1];
            c.add(String.valueOf(a) + "," + String.valueOf(b));
            xNums[i+1] = a;
            yNums[i+1] = b;
        }

        System.out.println(c.size());
    }
}