package Stack;
import java.util.Scanner;
import java.util.Stack;

public class Stack_The_Geneva_Confection {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        String[] out = new String[T];

        for(int i=0; i<T; i++) {
            int N = in.nextInt();
            Stack<Integer> cars = new Stack<>();
            Stack<Integer> branch = new Stack<>();

            for (int a=0; a<N; a++) {
                cars.push(in.nextInt());
            }

            boolean None = true;
            for (int b=1; b<N+1; b++) {
                boolean Found = false;
                if (branch.size() > 0) {
                    if (branch.peek() == b) {
                        branch.pop();
                        Found = true;
                    }
                }
                if (cars.size() > 0 && !Found) {
                    while (cars.size() > 0) {
                        if (cars.peek() == b) {
                            cars.pop();
                            Found = true;
                            break;
                        } else {
                            branch.push(cars.pop());
                        }
                    }
                }

                if (!Found) {
                    None = false;
                    break;
                }
            }

            if (!None) {
                out[i] = "N";
            } else {
                out[i] = "Y";
            }
        }

        for (int z=0; z<T; z++) {
            System.out.println(out[z]);
        }
    }
}
