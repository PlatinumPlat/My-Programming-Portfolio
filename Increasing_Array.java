import java.util.*;

public class Increasing_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        long output = 0L;
        long p = in.nextLong();
        for (int i=1; i<N; i++) {
            long c = in.nextLong();
            if (c<=p) {
                output += p-c;
            } else {
                p = c;
            }
        } 

        System.out.println(output);
    }
}
