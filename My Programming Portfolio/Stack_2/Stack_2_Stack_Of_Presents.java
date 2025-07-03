package Stack_2;
import java.util.Arrays;
import java.util.Scanner;

public class Stack_2_Stack_Of_Presents {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] weights = new int[N];
        for (int i=0; i<N; i++) {
            weights[i] = in.nextInt();
        }
        Arrays.sort(weights);

        int current = 0;
        int count = 0;

        for (int a=0; a<N; a++) {
            if (weights[a] >= current) {
                current += weights[a];
                count++;
            }
        }
        System.out.println(count);
    }
}
