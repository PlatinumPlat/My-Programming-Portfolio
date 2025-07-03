package Introduction;

import java.util.Scanner;

public class Introduction_DressingUp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int col = 2*l;
        int count = 1;
        boolean add = true;

        for (int i = 1; i <= l; i ++) {
            for (int j = 1; j <= col; j++) {
                if (j <= count) {
                    System.out.print("*");
                } if (j > count && j <= (col-count)){
                    System.out.print(" ");
                } if (j > col-count) {
                    System.out.print("*");
                }
            }

            System.out.println("");
            if (count == l) {
                add = false;
            }

            if (add) {
                count += 2;
            } else {
                count -= 2;
            }
        }
    }
}
