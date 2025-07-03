package Strings_1;

import java.util.Scanner;

public class Strings_1_Lexicographically_Least_Substring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        int len = in.nextInt();
        String least = s.substring(0, len);

        for (int i=1; i<(s.length()-len); i++) {
            String a = s.substring(i, i+len);
            if (a.compareTo(least) < 0) {
                least = a;
            }
        }

        System.out.println(least);
    }
}