import java.util.*;

public class Trailing_Zeros {
    public static void main(String[] args) {
        java.util.Scanner in = new Scanner(System.in);

        long N = in.nextLong();

        long total = 0L;
        for (int i=1; Math.pow(5, i)<=N; i++) {
            total += N/(Math.pow(5, i));
        }

        System.out.println(total);
    }
}
