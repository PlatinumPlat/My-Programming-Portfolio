package Arrays;

import java.util.Scanner;

public class Arrays_Palindromes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] count = new int[5];

        for (int i=0; i<5; i++) {
            String[] words = in.nextLine().split("\\W+");
            for (int a=0; a<words.length; a++) {
                if (words[a].length() > 3) {
                    count[i] += 1;
                }
            }
        }

        for (int b : count) {
            System.out.println(b);
        }
    }
}
