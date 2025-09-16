import java.util.*;

public class Missing_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long N = in.nextLong();
        long total = 0L;
        for (int a=0; a<N-1; a++) {
            total += in.nextLong();
        }

        System.out.println(((N+1)*N/2)-total);
    }
}