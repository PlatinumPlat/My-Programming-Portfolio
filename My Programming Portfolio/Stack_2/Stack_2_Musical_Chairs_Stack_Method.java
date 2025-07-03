package Stack_2;
import java.util.Scanner;
import java.util.Stack;

public class Stack_2_Musical_Chairs_Stack_Method {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int K = in.nextInt();
        int KK = K;
        boolean[] chairs = new boolean[N];

        for (int i=0; i< K; i++) {
            chairs[in.nextInt()-1] = true;
        }

        int[] indexes = new int[N];
        for (int a=0; a<K+1; a++) {
            int n = in.nextInt();
            if (chairs[n-1]) {
                chairs[n-1] = false;
                KK--;
            } else {
                indexes[n-1] = a+1;
            }
        }

        Stack<Integer> c = new Stack<>();
        int count = 0;
        int b =0;
        boolean done = false;
        while (true) {
            if (count != KK || !done) {
                 if (!chairs[b]) {
                    if (indexes[b] != 0) {
                        c.push(indexes[b]);
                        indexes[b] = 0;
                    }
                 } else if (chairs[b] && c.size()>0) {
                    c.pop();
                    chairs[b] = false;
                    count ++;
                }
            } else {
                break;
            }

            if (b == N-1) {
                b = 0;
                done = true;
            } else {
                b = b + 1;
            }
        }

        System.out.println(c.pop());
    }
}
