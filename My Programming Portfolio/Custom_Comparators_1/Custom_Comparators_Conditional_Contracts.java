package Custom_Comparators_1;
import java.util.*;

public class Custom_Comparators_Conditional_Contracts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        Map<Integer, Integer> x = new HashMap<>();
        
        for (int i=0; i<N; i++) {
            int a = in.nextInt();
            x.put(a, x.getOrDefault(a, 0)+1);
        }

        int first = 0;
        int second = 0;

        for (int b : x.values()) {
            if (b > first) {
                second = first;
                first = b;
            } else if (b > second) {
                second = b;
            }
        }

        System.out.println(first + second);
    }
}
