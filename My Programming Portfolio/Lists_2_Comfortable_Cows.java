import java.util.Scanner;

public class Lists_2_Comfortable_Cows {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] pastures = new int[1003][1003];
        int[][] cowExists = new int[1003][1003];
        int N = in.nextInt();
        int[] out = new int[N+1];
        out[0] = 0;

        for (int i=0; i<N; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            cowExists[x][y] = 1;

            int total = 0;
            if (y + 1 !=1001 && pastures[x][y+1] == 3 && cowExists[x][y+1] == 1) {
                total ++;
            } if (y - 1 != -1 && pastures[x][y-1] == 3 && cowExists[x][y - 1] == 1) {
                total ++;
            } if (x + 1 != 1001 && pastures[x+1][y] == 3 && cowExists[x+1][y] == 1) {
                total ++;
            } if (x - 1 != -1 && pastures[x-1][y] == 3 && cowExists[x-1][y] == 1) {
                total++;
            }

            if (y + 1 != 1001) {
                pastures[x][y + 1]++;
            } if (y - 1 != -1 ) {
                pastures[x][y - 1]++;
            } if (x + 1 != 1001) {
                pastures[x + 1][y]++;
            } if (x - 1 != -1) {
                pastures[x - 1][y]++;
            }

            int newTotal = 0;
            if (y + 1 != 1001 && pastures[x][y+1] == 3 && cowExists[x][y + 1] == 1) {
                newTotal ++;
            } if (y - 1 != -1 && pastures[x][y-1] == 3 && cowExists[x][y - 1] == 1) {
                newTotal ++; 
            } if (x + 1 != 1001 && pastures[x+1][y] == 3 && cowExists[x + 1][y] == 1) {
                newTotal ++;
            } if (x - 1 != -1 && pastures[x-1][y] == 3 && cowExists[x - 1][y] == 1) {
                newTotal ++;
            }

            int diff = newTotal - total;
            if (pastures[x][y] == 3) {
                diff++;
            }
            out[i + 1] = out[i] + diff;
        }

        for (int b=1; b<N+1; b++) {
            System.out.println(out[b]);
        }
    }
}
