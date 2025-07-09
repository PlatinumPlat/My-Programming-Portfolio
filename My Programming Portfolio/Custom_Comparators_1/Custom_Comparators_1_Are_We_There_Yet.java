package Custom_Comparators_1;

import java.util.Scanner;

public class Custom_Comparators_1_Are_We_There_Yet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        System.out.println(0 + " " + a + " " + (a + b) + " " + (a + b + c) + " " + (a + b + c + d));
        System.out.println(a + " " + 0 + " " + (b) + " " + (b + c) + " " + (b + c + d));
        System.out.println((a + b) + " " + b + " " + 0 + " " + c + " " + (c + d));
        System.out.println((a + b + c) + " " + (b + c) + " " + (c) + " " + 0 + " " + d);
        System.out.println((a + b + c + d) + " " + (b + c + d) + " " + (c + d) + " " + (d) + " " + 0);
    }
}