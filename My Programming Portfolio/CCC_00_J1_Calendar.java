import java.util.*;

public class CCC_00_J1_Calendar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int s = in.nextInt();
        int d = in.nextInt();
        int curr = 1;
        System.out.println("Sun Mon Tue Wed Thr Fri Sat");
        for (int a = 1; a < s; a++) {
            System.out.print("    ");
        }

        for (int a = s; a <= 6; a++) {
            System.out.print("  " + curr + " ");
            curr++;
        }

        System.out.print("  " + curr);
        curr++;

        System.out.println();

        for (int b = 2; b <= 7; b++) {
            for (int a = 1; a <= 6; a++) {
                if (curr == d) {
                    System.out.println(" " + curr);
                    return;
                } else {
                    if (curr < 10) {
                        System.out.print("  " + curr + " ");
                    } else {
                        System.out.print(" " + curr + " ");
                    }
                    curr++;
                }
            }

            if (curr == d) {
                System.out.println(" " + curr);
                return;
            } else {
                if (curr < 10) {
                    System.out.print("  " + curr);
                } else {
                    System.out.print(" " + curr);
                }
                curr++;
            }
            System.out.println();
        }
    }
}
