package Lists_1;
import java.util.Scanner;

public class Lists_1_Boiling_Water {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bP = in.nextInt();
        System.out.println(5*bP-400);

        if (bP<100) {
            System.out.println(1);
        } else if (bP>100) {
            System.out.println(-1);
        } else {
            System.out.print(0);
        }
    }
}
