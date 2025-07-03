import java.util.Scanner;
import java.io.IOException;
import java.util.Arrays;

public class Stack_2_DoYouKnowYourABCs {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int[] nums = new int[7];
        for (int i=0; i<7; i++) {
            nums[i] = in.nextInt();
        }
        in.close();
        Arrays.sort(nums);

        int total = nums[6];
        int a = nums[0];
        int b = nums[1];
        int c = total-a-b;

        System.out.println(a + " " + b + " " + c);
        System.out.close();
    }
}
