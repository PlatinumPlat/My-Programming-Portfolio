package Custom_Comparators_2;

import java.util.*;

public class Custom_Comparators_2_Box_and_Whiskers {
    public static String median(int[] array, int indxStart, int indxEnd) {
        if ((indxEnd - indxStart + 1) % 2 == 1) {
            return String.valueOf(array[indxStart + ((indxEnd - indxStart + 1) / 2)]);
        } else {
            int indx1 = indxStart + ((indxEnd - indxStart + 1) / 2) - 1;
            int indx2 = indxStart + ((indxEnd - indxStart + 1) / 2);
            double med = (double) (array[indx1] + array[indx2]) / 2;

            if (med % 1 != 0) {
                return String.valueOf(med);
            } else {
                int med2 = (int) med;
                return String.valueOf((med2));
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] data = new int[N];

        for (int a = 0; a < N; a++) {
            data[a] = in.nextInt();
        }

        Arrays.sort(data);

        System.out.print(data[0] + " " + data[N - 1]);

        if (N % 2 == 1) {
            String Q2 = median(data, 0, N - 1);

            String Q1 = median(data, 0, N / 2 - 1);
            String Q3 = median(data, N / 2 + 1, N - 1);

            System.out.print(" " + Q1 + " " + Q2 + " " + Q3);
        } else {
            String Q2 = median(data, 0, N - 1);

            String Q1 = median(data, 0, N / 2 - 1);
            String Q3 = median(data, N / 2, N - 1);
            System.out.print(" " + Q1 + " " + Q2 + " " + Q3);
        }
        System.out.println();
    }
}