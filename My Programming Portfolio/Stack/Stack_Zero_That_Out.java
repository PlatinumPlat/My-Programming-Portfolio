package Stack;
import java.util.Scanner;
import java.util.Stack;

public class Stack_Zero_That_Out {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int K = in.nextInt();
        Stack<Integer> s = new Stack<>();

        for (int i=0; i<K; i++) {
            int next = in.nextInt();
            if (next==0) {
                s.pop();
            } else {
                s.push(next);
            }
        }

        int count = 0;
        for (int a=0; a<s.size(); a++) {
            count += s.get(a);
        }

        System.out.println(count);
    }
}
