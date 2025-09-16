package Data_Structures_1;

import java.util.*;

public class BambooCookies {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int evenCount = 0;
        int oddCount = 0;

        for (int a = 0; a < N; a++) {
            if (in.nextLong() % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println(evenCount/2+oddCount/2);
    }
}
