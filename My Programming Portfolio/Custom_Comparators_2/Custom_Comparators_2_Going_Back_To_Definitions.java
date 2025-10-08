package Custom_Comparators_2;

import java.util.*;

public class Custom_Comparators_2_Going_Back_To_Definitions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        Long[] input = new Long[N];

        for (int a = 0; a < N; a++) {
            input[a] = in.nextLong();
        }

        Arrays.sort(input, new Comparator<Long>() {
            public int compare(Long o1, Long o2) {
                String num1 = String.valueOf(o1);
                String num2 = String.valueOf(o2);

                long op1 = Long.parseLong(num1 + num2);
                long op2 = Long.parseLong(num2 + num1);
                if (op1 > op2) {
                    return -1;
                } else if (op1 < op2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        for (int i = 0; i <N; i++) {
            System.out.print(input[i]);
        }
    }
}
