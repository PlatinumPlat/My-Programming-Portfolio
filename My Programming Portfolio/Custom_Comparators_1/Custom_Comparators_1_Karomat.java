package Custom_Comparators_1;

import java.util.*;

public class Custom_Comparators_1_Karomat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        String[] words = new String[N];

        for (int a = 0; a < N; a++) {
            words[a] = in.next();
        }

        String start = in.next();
        Set<Character> out = new HashSet<>();
        for (int i = 0; i < N; i++) {
            if (words[i].length() > start.length() && words[i].startsWith(start)) {
                out.add(words[i].charAt(start.length()));
            }
        }

        StringBuffer row1 = new StringBuffer("***ABCDE");
        StringBuffer row2 = new StringBuffer("FGHIJKLM");
        StringBuffer row3 = new StringBuffer("NOPQRSTU");
        StringBuffer row4 = new StringBuffer("VWXYZ***");

        for (int b = 3; b < 8; b++) {
            if (!out.contains(row1.charAt(b))) {
                row1.setCharAt(b, '*');
            }
        }

        for (int b = 0; b < 8; b++) {
            if (!out.contains(row2.charAt(b))) {
                row2.setCharAt(b, '*');
            }
        }

        for (int b = 0; b < 8; b++) {
            if (!out.contains(row3.charAt(b))) {
                row3.setCharAt(b, '*');
            }
        }

        for (int b = 0; b < 5; b++) {
            if (!out.contains(row4.charAt(b))) {
                row4.setCharAt(b, '*');
            }
        }

        System.out.println(String.valueOf(row1));
        System.out.println(String.valueOf(row2));
        System.out.println(String.valueOf(row3));
        System.out.println(String.valueOf(row4));
    }
}
