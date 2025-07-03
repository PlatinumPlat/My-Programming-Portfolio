import java.io.*;
import java.util.*;

public class Sets_And_Maps_Nixin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] arr = new int[N];

        for (int a = 0; a < N; a++) {
            arr[a] = in.nextInt();
        }

        int indx1 = 0;
        int indx2 = N - 1;
        int count = 0;

        while (indx1 <= indx2) {
            if (arr[indx1] == arr[indx2]) {
                indx1++;
                indx2--;
            } else if (arr[indx1] < arr[indx2]) {
                indx1++;
                arr[indx1] += arr[indx1 - 1];
                count++;
            } else {
                indx2--;
                arr[indx2] += arr[indx2 + 1];
                count++;
            }
        }

        System.out.println(count);
    }
}