import java.util.*;

public class DMOPC_14_Contest_1_P3_New_Students {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int total = 0;
        for (int ai = 0; ai < a; ai++) {
            total += in.nextInt();
        }

        int b = in.nextInt();
        for (int bi = 0; bi < b; bi++) {
            total += in.nextInt();
            double d = (double) total / (a+bi+1);
            System.out.println(d);
        }
    }
}
