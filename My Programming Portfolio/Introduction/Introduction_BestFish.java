package Introduction;

import java.util.Scanner;

public class Introduction_BestFish {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cLargest = 0;
        int nLargest = 0;

        int c = in.nextInt();
        for (int i =0; i<c; i++) {
            int len = in.nextInt();
            int wid = in.nextInt();

            if (len*wid > cLargest) {
                cLargest = len*wid;
            }
        }

        int n = in.nextInt();
        for (int j =0; j<n; j++) {
            int len = in.nextInt();
            int wid = in.nextInt();

            if (len*wid > nLargest) {
                nLargest = len*wid;
            }
        }

        if (cLargest != nLargest) {
            if (cLargest>nLargest) {
                System.out.println("Casper");
            } else {
                System.out.println("Natalie");
            }
        } else {
            System.out.println("Tie");
        }

    }
}
