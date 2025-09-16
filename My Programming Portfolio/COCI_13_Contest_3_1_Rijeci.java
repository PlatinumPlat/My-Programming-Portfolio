import java.util.*;
public class COCI_13_Contest_3_1_Rijeci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int K = in.nextInt();
        int A = 1;
        int B = 0;

        for (int i=0; i<K; i++) {
            int Ap = A;
            A = B;
            B = B+Ap;
        }

        System.out.println(A + " " + B);
    }
}
