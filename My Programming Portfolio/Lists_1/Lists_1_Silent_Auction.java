package Lists_1;
import java.util.Scanner;

public class Lists_1_Silent_Auction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int indx = 0;
        int biggest = 0;
        String[] names = new String[N];

        for (int i = 0; i<N; i++) {
            names[i] = in.next();
            int bid = in.nextInt();
            if (bid > biggest) {
                biggest = bid;
                indx = i;
            }
        }

        System.out.println(names[indx]);
    }
}
