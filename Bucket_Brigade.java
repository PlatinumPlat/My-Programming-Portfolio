import java.util.*;
import java.io.*;

public class Bucket_Brigade {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);

        int bx = 0;
        int by = 0;
        int rx = 0;
        int ry = 0;
        int lx = 0;
        int ly = 0;

        for (int a = 0; a < 10; a++) {
            String s = in.next();
            for (int b = 0; b < 10; b++) {
                if (s.charAt(b) == 'B') {
                    bx = b;
                    by = a;
                } else if (s.charAt(b) == 'R') {
                    rx = b;
                    ry = a;
                } else if (s.charAt(b) == 'L') {
                    lx = b;
                    ly = a;
                }
            }
        }

        if (lx==bx) {
            if (rx==lx && ((ry<ly && ry>by) || (ry>ly && ry<by))) {
                System.out.println(Math.abs(ly-by)+1);
            } else {
                System.out.println(Math.abs(ly-by)-1);
            }
        } else if (ly == by) {
            if (ry == ly && ((rx < lx && rx > bx) || (rx > lx && rx < bx))) {
                System.out.println(Math.abs(lx - bx) + 1);
            } else {
                System.out.println(Math.abs(lx - bx) - 1);
            }
        } else {
            System.out.println(Math.abs(lx-bx) + Math.abs(ly-by)-1);
        }
    }
}
