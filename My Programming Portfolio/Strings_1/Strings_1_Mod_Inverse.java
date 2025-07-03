package Strings_1;

import java.util.Scanner;

public class Strings_1_Mod_Inverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int m = scanner.nextInt();
        int count = 0;

        for (int i = 1; i<m; i++) {
            if (((x*i)%m) == 1) {
                System.out.println(i);
                count++;
                break;
            }
        }

        if (count == 0) {
            System.out.println("No such integer exists.");
        }
    }
}
