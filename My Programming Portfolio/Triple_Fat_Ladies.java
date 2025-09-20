import java.util.*;

public class Triple_Fat_Ladies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i=0; i<t; i++) {
            long a = in.nextLong();
            if (a%10>2) {
                a = a/10;
                a*=10;
                a += 12;
            } else {
                a = a/10;
                a*=10;
                a += 2;
            }
            while ((a*a*a) % 1000 != 888) {
                a+=10;
            }

            System.out.println(a);
        }
    }
}
