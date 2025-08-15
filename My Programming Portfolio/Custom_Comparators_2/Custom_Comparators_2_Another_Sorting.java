package Custom_Comparators_2;
import java.util.*;
import java.lang.*;
public class Custom_Comparators_2_Another_Sorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        Integer[] data = new Integer[N];

        for (int a=0; a<N; a++) {
            data[a] = in.nextInt();
        }

        Arrays.sort(data, new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                if ((o1 % 10) != (o2 % 10)) {
                    return o1%10-o2%10;
                } else {
                    return o2-o1;
                }
            }
        });

        System.out.print(data[0]);
        for (int i=1; i<N; i++) {
            System.out.print(" " + data[i]);
        }
    }
}
