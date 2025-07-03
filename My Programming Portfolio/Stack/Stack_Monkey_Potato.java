package Stack;
import java.util.Scanner;
import java.util.Arrays;

public class Stack_Monkey_Potato {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] KD = in.nextLine().split(" ");
        int K = Integer.parseInt(KD[0]);
        String[] digits = in.nextLine().split(" ");
        Arrays.sort(digits);

        if (!digits[0].equals("0")) {
            for (int i=0; i<K; i++) {
                System.out.print(digits[0]);
            }
            System.out.println();
            System.exit(0);
        } else {
            if (digits.length > 1) {
                if (K>1) {
                    System.out.print(digits[1]);
                    for (int i = 1; i < K - 1; i++) {
                        System.out.print("0");
                    }
                    System.out.print(digits[1]);
                    System.out.println();
                    System.exit(0);
                } else {
                    System.out.print(digits[1]);
                    System.out.println();
                    System.exit(0);
                }
            } else {
                System.out.println(-1);
                System.exit(0);
            }
        }
    }
}
