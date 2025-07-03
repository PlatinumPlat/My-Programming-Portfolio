package Strings_2;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;


public class Strings_2_Laugh_Graphs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String hello = in.next();

        String[][] out = new String[2*n][n];
        for (int b=0; b< 2*n; b++) {
            for(int c=0; c< n; c++) {
                out[b][c] = ".";
            }
        }

        int[] current = {n, 0};

        if (hello.charAt(0) == 'v') {
            out[current[0]][current[1]] = "\\";
            current[1] ++;
        } else if (hello.charAt(0) == '^') {
            out[current[0]][current[1]] = "/";
            current[0] --;
            current[1] ++;
        } else {
            out[current[0]][current[1]] = "_";
            current[1] ++;
        }

        for(int a=1; a<hello.length(); a++) {
            if (hello.charAt(a) == 'v') {
                current[0] ++;
                out[current[0]][current[1]] = "\\";
                current[1] ++;
            } else if (hello.charAt(a) == '^') {
                out[current[0]][current[1]] = "/";
                current[0] --;
                current[1] ++;
            } else {
                out[current[0]][current[1]] = "_";
                current[1] ++;
            }
        }

        for (int c=0; c<out.length; c++) {
            String[] Empty = new String[n];
            Arrays.fill(Empty, ".");
            if (!Arrays.equals(out[c],Empty)) {
                for (int d = 0; d < n; d++) {
                    System.out.print(out[c][d]);
                }
                System.out.println();
            }
        }

    }
}

