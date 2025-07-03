package Arrays;

import java.util.Scanner;

public class Arrays_Tides {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        int[] tides = new int[t];
        int small = 10001;
        int sIndex = 0;
        int big = 0;
        int bIndex = 0;


        for (int i=0; i<t; i++) {
            tides[i] = in.nextInt();
            if (tides[i] > big) {
                big = tides[i];
                bIndex = i;
            } if (tides[i] < small) {
                small = tides[i];
                sIndex = i;
            }
        }

        if (sIndex < bIndex) {
            for (int j = sIndex; j < bIndex; j++) {
                if (tides[j] > tides[j + 1]) {
                    System.out.println("unknown");
                    System.exit(0);
                }
            }
        } else {
            System.out.println("unknown");
            System.exit(0);
        }

        System.out.println(big-small);
    }
}
