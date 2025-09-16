import java.util.*;

public class Two_Knights {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long N = in.nextLong();
        for (long i = 1; i <= N; i++) {
            System.out.println(i*i*(i*i-1)/2 - 4 * (i-1) * (i-2));
        }
    }
}
