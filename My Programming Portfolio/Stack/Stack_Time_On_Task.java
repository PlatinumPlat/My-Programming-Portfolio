package Stack;

import java.util.Scanner;
import java.util.Arrays;

public class Stack_Time_On_Task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        int c = in.nextInt();
        int[] cTimes = new int[c];

        for (int i=0; i<c; i++) {
            cTimes[i] = in.nextInt();
        }

        Arrays.sort(cTimes);

        int count = 0;
        int total = 0;
        for (int a=0; a<c; a++) {
            if (cTimes[a] + total <= t) {
                count ++;
                total += cTimes[a];
            } else {
                break;
            }
        }

        System.out.println(count);
    }
}
