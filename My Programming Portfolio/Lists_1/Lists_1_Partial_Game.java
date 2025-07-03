package Lists_1;
import java.util.Scanner;

public class Lists_1_Partial_Game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        long Dmoves = 0;
        long Amoves = 0;

        for (int i=0; i<N; i++) {
            long pile = in.nextLong();

            if (pile%2 == 0) {
                Dmoves += pile/2;
            } else {
                Amoves += (pile + 1)/2;
            }
        }

        if (Dmoves>Amoves) {
            System.out.println("Duke");
        } else {
            System.out.println("Alice");
        }
    }
}
