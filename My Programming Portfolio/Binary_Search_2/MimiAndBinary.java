package Binary_Search_2;

import java.util.*;

public class MimiAndBinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String binary = in.next();

        int[] PSA0 = new int[binary.length()];
        int[] PSA1 = new int[binary.length()];
        Map<Integer, Integer> c0 = new HashMap<>();
        Map<Integer, Integer> c1 = new HashMap<>();
        int integer0 = 1;
        int integer1 = 1;
        if (binary.charAt(0) == '0') {
            PSA0[0] = 1;
            PSA1[0] = 0;
            if (PSA0[0] == 1) {
                c0.put(1, 0);
                integer0++;
            }
        } else {
            PSA0[0] = 0;
            PSA1[0] = 1;
            if (PSA1[0] == 1) {
                c0.put(1, 0);
                integer1++;
            }
        }

        

        for (int a = 1; a < binary.length(); a++) {
            if (binary.charAt(a) == '0') {
                PSA0[a] = PSA0[a - 1] + 1;
                PSA1[a] = PSA1[a - 1];
                if (PSA0[a] == integer0) {
                    c0.put(integer0, a);
                    integer0++;
                }
            } else {
                PSA1[a] = PSA1[a - 1] + 1;
                PSA0[a] = PSA0[a - 1];
                if (PSA1[a] == integer1) {
                    c1.put(integer1, a);
                    integer1++;
                }
            }
        }

        int N = in.nextInt();

        for (int i = 0; i < N; i++) {
            int x = in.nextInt() - 1;
            int y = in.nextInt();
            char z = in.next().charAt(0);
            if (x == 0 && z == '0') {
                System.out.println(c0.getOrDefault(y, -2)+1);
            } else if (x == 0 && z == '1') {
                System.out.println(c1.getOrDefault(y, -2)+1);
            } else if (z == '0') {
                System.out.println(c0.getOrDefault(PSA0[x - 1] + y, -2)+1);
            } else {
                System.out.println(c1.getOrDefault(PSA1[x - 1] + y, -2)+1);
            }
        }

    }
}
