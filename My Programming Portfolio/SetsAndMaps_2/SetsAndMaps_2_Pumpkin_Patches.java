import java.util.Scanner;

public class SetsAndMaps_2_Pumpkin_Patches {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int minX = 10000001;
        int maxX = -10000001;

        int minY = 10000001;
        int maxY = -10000001;
        for (int a=0; a<N; a++) {
            int x = in.nextInt();
            int y = in.nextInt();

            if (x>maxX) {
                maxX = x;
            } if (x<minX) {
                minX = x;
            } if (y>maxY) {
                maxY = y;
            } if (y<minY) {
                minY = y;
            }
        }

        System.out.println(2*((maxX-minX)+(maxY-minY)));
    }
}