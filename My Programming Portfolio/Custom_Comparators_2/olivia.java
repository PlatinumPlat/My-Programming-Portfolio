package Custom_Comparators_2;
import java.util.Scanner;
import java.util.Arrays;

public class olivia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            int number = in.nextInt();
            array[i] = number;
        }
        Arrays.sort(array);
        int min = array[0];
        int max = array[N - 1];
        double Q1;
        double Q3;
        double Q2;
        int half;
        if (N % 2 == 0) {
            half = N / 2;
            Q2 = (array[half - 1] + array[half]) / 2.0;
        } else {
            half = (N - 1) / 2;
            Q2 = array[half];
        }
        if (half % 2 == 0) {
            Q1 = (array[half / 2 - 1] + array[half / 2]) / 2.0;
            Q3 = (array[half + half / 2 - 1] + array[half + half / 2]) / 2.0;
        } else {
            Q1 = array[(half - 1) / 2];
            Q3 = array[N - 1 - ((half - 1) / 2)];
        }
        System.out.println(min + " " + max + " " + Q1 + " " + Q2 + " " + Q3);
    }
}