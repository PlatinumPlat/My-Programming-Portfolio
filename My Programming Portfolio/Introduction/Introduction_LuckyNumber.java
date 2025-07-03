package Introduction;

import java.util.Scanner;

public class Introduction_LuckyNumber {
    static int digitSum(String x) {
        int count = 0;
        for (int j = 0; j<x.length(); j++) {
            count += Integer.parseInt(String.valueOf(x.charAt(j)));
        }

        if (String.valueOf(count).length() != 1) {
            return digitSum(String.valueOf(count));
        } else {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int[] nums = new int[a];

        for (int i = 0; i<a; i++) {
            nums[i] = digitSum(in.next());
        }

        for (int k=0; k<nums.length; k++) {
            System.out.println(nums[k]);
        }
    }
}
