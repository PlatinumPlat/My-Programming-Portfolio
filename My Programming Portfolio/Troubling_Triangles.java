import java.util.*;

public class Troubling_Triangles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        for (int a = 0; a < N; a++) {
            double x1 = in.nextLong();
            double y1 = in.nextLong();
            double x2 = in.nextLong();
            double y2 = in.nextLong();
            double x3 = in.nextLong();
            double y3 = in.nextLong();

            double s1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
            double s2 = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
            double s3 = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
            double semi = (s1+s2+s3)/2;
            System.out.print(Math.sqrt(semi * (semi-s1) * (semi-s2) * (semi-s3)));
            System.out.print(" ");
            System.out.println(s1+s2+s3);
        }
    }
}
