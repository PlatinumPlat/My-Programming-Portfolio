import java.util.*;

public class Fast_Exponents {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        int N = in.nextInt();
        for (int i=0; i<N; i++) {
            long x = in.nextLong();
            while (x%2==0) {
                x/=2;
            }
            if (x==1) {
                System.out.println("T");
            } else {
                System.out.println("F");
            }
        }
    }
}
