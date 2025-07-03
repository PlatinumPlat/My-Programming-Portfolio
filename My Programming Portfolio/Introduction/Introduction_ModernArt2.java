package Introduction;

import java.util.Scanner;

public class Introduction_ModernArt2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int r = in.nextInt();
        int c = in.nextInt();

        boolean[] rows = new boolean[r];
        boolean[] cols = new boolean[c];

        int a = in.nextInt();
        for (int i = 0; i <a; i++) {
            String type = in.next();
            int n = in.nextInt()-1;
            if (type.equals("R")) {
                if (rows[n] == false) {
                    rows[n] = true;
                } else {
                    rows[n] = false;
                }
            } else {
                if (cols[n] == false) {
                    cols[n] = true;
                } else {
                    cols[n] = false;
                }
            }
        }

        int Rcount = 0;
        int Ccount = 0;
        for (int row = 0; row < rows.length; row++) {
            if (rows[row]) {
                Rcount += 1;
            }

        }

        for (int col = 0; col < cols.length; col++) {
            if (cols[col]) {
                Ccount += 1;
            }
        }

        System.out.println(Rcount*c + Ccount*r - 2*Rcount*Ccount);
    }
}
