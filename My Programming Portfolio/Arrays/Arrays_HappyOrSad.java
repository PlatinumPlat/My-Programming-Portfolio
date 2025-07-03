package Arrays;

import java.util.Scanner;

public class Arrays_HappyOrSad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int h = 0;
        int s = 0;

        String text = in.nextLine();

        if (text.length() < 3) {
            System.out.println("none");
            System.exit(0);
        }

        for (int i=0; i< text.length()-2; i++) {
            String sub = text.substring(i, i+3);
            if (sub.equals(":-)")) {
                h += 1;
            } else if (sub.equals(":-(")) {
                s += 1;
            }
        }

        if (h==0 && s==0) {
            System.out.println("none");
        } else if (h==s) {
            System.out.println("unsure");
        } else if (h>s) {
            System.out.println("happy");
        } else {
            System.out.println("sad");
        }
    }
}
