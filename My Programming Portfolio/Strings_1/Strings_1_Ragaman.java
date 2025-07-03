package Strings_1;

import java.util.Scanner;

public class Strings_1_Ragaman {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuffer f = new StringBuffer();

        String a = in.nextLine();
        String b = in.nextLine();

        StringBuffer c = new StringBuffer(b);
        StringBuffer d = new StringBuffer(a);
        boolean e = true;

        for (int i = 0; i< c.length(); i++) {
            String letter = c.substring(i, i+1);
            if (letter.equals(" ")) {
                continue;
            }

            if (letter.equals("*")) {
                f.append("*");
                continue;
            }

            int index = d.indexOf(letter);
            if (index != -1) {
                d.deleteCharAt(index);
            } else {
                e = false;
                break;
            }
        }
        if (e) {
            if (d.toString().trim().length() != f.toString().length()) {
                System.out.println("N");
            } else {
                System.out.println("A");
            }
        } else {
            System.out.println("N");
        }
    }
}
