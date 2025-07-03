package Strings_2;
import java.util.*;
import java.io.*;

public class Strings_2_Tandem_Bicycle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int ques = Integer.parseInt(in.nextLine());
        int c = Integer.parseInt(in.nextLine());
        String[] dmoj = in.nextLine().split(" ");
        int[] d = new int[c];
        for (int i = 0; i < c; i++) {
            d[i] = Integer.parseInt(dmoj[i]);
        }
        Arrays.sort(d);

        String[] peg = in.nextLine().split(" ");
        int[] p = new int[c];
        for (int a = 0; a < c; a++) {
            p[a] = Integer.parseInt(peg[a]);
        }
        Arrays.sort(p);

        int total =0;
        if (ques==1) {
            for (int j=0; j<c; j++) {
                total = total+ Math.max(p[j], d[j]);
            }
        } else {
            for (int j=0; j<c; j++) {
                total = total + Math.max(p[j], d[c-1-j]);
            }
        }

        System.out.println(total);
    }
}
