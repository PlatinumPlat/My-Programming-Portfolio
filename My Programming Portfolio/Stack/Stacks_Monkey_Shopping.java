package Stack;

import java.util.Scanner;

public class Stacks_Monkey_Shopping {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] e = in.nextLine().split(" ");
        boolean s = false;
        boolean tp = false;

        if (Integer.parseInt(e[0]) < Integer.parseInt(e[1])) {
            s = true;
        } if (Integer.parseInt(e[2]) < Integer.parseInt(e[3])) {
            tp = true;
        }

        if (s & tp) {
            System.out.println("Go to the department store");
        } else if (s & !tp) {
            System.out.println("Go to the grocery store");
        } else if (!s & tp) {
            System.out.println("Go to the pharmacy");
        } else {
            System.out.println("Stay home");
        }
    }
}
