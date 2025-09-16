import java.util.*;

public class DWITE_09_R1_3_That_Missing_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int i=0; i<5; i++) {
            int N = in.nextInt();
            int total = 0;
            for (int b=0; b<N; b++) {
                total += in.nextInt();
            }

            System.out.println(((N+2)*(N+1)/2)-total);
        }
    }
}
