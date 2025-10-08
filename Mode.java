import java.util.*;

public class Mode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] m = new int[200001];

        for (int i = 0; i < N; i++) {
            int num = in.nextInt();
            m[num + 100000]++;
        }

        int largest = 0;
        for (int i = 0; i < 200001; i++) {
            largest = Math.max(largest, m[i]);
        }
        boolean first = false;
        for (int i = 0; i < 200001; i++) {
            if (m[i] == largest) {
                if (!first) {
                    System.out.print(i - 100000);
                    first = true;
                } else {
                    System.out.print(" " + (i - 100000));
                }
            }
        }

        System.out.println();
    }
}
