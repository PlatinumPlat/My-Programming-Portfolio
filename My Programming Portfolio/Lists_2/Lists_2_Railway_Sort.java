package Lists_2;
import java.util.Scanner;
import java.util.ArrayList;


public class Lists_2_Railway_Sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] out = new int[10];

        for (int i=0; i<10; i++) {
            int N = in.nextInt();
            ArrayList<Integer> cars = new ArrayList<>();

            for (int a=0; a<N; a++) {
                cars.add(in.nextInt());
            }
            int cost =0;
            for (int b=N-1; b>0; b--) {
                int last = cars.indexOf(b+1);

                int curr = cars.indexOf(b);
                if (curr>last) {
                    cost += curr;
                    cars.remove(curr);
                    cars.add(0, b);
                }
            }
            out[i] = cost;
        }

        for (int a=0; a<10; a++) {
            System.out.println(out[a]);
        }
    }
}
