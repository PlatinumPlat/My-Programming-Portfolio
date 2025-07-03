package SetsAndMaps_3;

import java.util.*;

public class SetsAndMaps_3_Slot_Machines {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int Q = in.nextInt();

        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        int Atimes = A + 1;
        int Btimes = B + 1;
        int Ctimes = C + 1;
        int c = 0;
        while (Q > 0) {
            if (Q > 0) {
                if (Atimes % 35 == 0) {
                    Q += 29;
                    c++;
                } else {
                    Q--;
                    c++;
                }
                Atimes++;
            }

            if (Q > 0) {
                if (Btimes % 100 == 0) {
                    Q += 59;
                    c++;
                } else {
                    Q--;
                    c++;
                }
                Btimes++;
            }

            if (Q > 0) {
                if (Ctimes % 10 == 0) {
                    Q += 8;
                    c++;
                } else {
                    Q--;
                    c++;
                }
                Ctimes++;
            }
        }

        System.out.println("Martha plays " + c + " times before going broke.");
    }
}