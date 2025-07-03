package SetsAndMaps_3;

import java.util.*;

public class SetsAndMaps_3_Snakes_And_Ladders {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int pos = 1;
        while (in.hasNextLine()) {
            int m;
            try {
                m = in.nextInt();
            } catch (Exception e) {
                System.out.println("You Quit!");
                return;
            }

            if (m == 0) {
                System.out.println("You Quit!");
                return;
            }

            int newPos = pos + m;
            if (newPos == 100) {
                System.out.print("You are now on square 100");
                System.out.println();
                System.out.println("You Win!");
                return;
            } else if (newPos > 100) {
                System.out.print("You are now on square ");
                System.out.print(pos);
                System.out.println();
                continue;
            } else {
                if (newPos == 9) {
                    pos = 34;
                } else if (newPos == 40) {
                    pos = 64;
                } else if (newPos == 67) {
                    pos = 86;
                } else if (newPos == 57) {
                    pos = 19;
                } else if (newPos == 90) {
                    pos = 48;
                } else if (newPos == 99) {
                    pos = 77;
                } else {
                    pos = newPos;
                }

                System.out.print("You are now on square ");
                System.out.print(pos);
                System.out.println();
            }
        }
    }
}
