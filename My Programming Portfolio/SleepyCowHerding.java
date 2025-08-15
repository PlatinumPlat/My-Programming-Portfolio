import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import java.util.*;
import java.lang.Math;

public class SleepyCowHerding {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("herding.in");
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter("herding.out");

        long[] cows = new long[3];
        cows[0] = in.nextLong();
        cows[1] = in.nextLong();
        cows[2] = in.nextLong();
        Arrays.sort(cows);

        long A = cows[0];
        long B = cows[1];
        long C = cows[2];

        long minC = 0L;
        if (B - A == 2 || C - B == 2) {
            minC = 1;
        } else if (A+1 != B || A+2 !=C) {
            minC = 2;
        }

        long maxC = 0L;

        if (A + 1 != B || A + 2 != C) {
            maxC = Math.max(B - A, C - B) - 1;
        }
        out.println(minC);
        out.println(maxC);
        out.close();
    }
}
