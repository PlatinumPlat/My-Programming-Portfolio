package Introduction;

import java.util.Scanner;
import java.util.Arrays;

public class Introduction_ListMinimum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int len = in.nextInt();
        int[] nums = new int[len];

        for (int i =0; i<len; i++) {
            nums[i] = in.nextInt();
        }

        Arrays.sort(nums);

        for (int j=0; j<nums.length; j++) {
            System.out.println(nums[j]);
        }
    }
}
