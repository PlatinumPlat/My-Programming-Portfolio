package Binary_Search_3;
import java.lang.Math;
import java.util.*;
public class Crazy_Fencing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] heights = new int[N+1];
        for (int a=0; a<N+1; a++) {
            heights[a] = in.nextInt();
        }

        double total = 0.0;
        for (int b=0; b<N; b++) {
            int width = in.nextInt();
            int heightSum = heights[b] + heights[b+1];
            double area = (double) (width * heightSum) / 2;
            total += area;
        }

        // if (total % 1==0) {
        //     String out = String.valueOf(total);
        //     String outfinal = out.substring(0, out.length()-2);
        //     System.out.println(outfinal);
        // } else {
            System.out.println(total);
        // }
    }
}
