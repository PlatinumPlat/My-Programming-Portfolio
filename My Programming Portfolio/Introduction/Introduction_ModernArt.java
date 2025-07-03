package Introduction;

import java.util.Scanner;

public class Introduction_ModernArt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int r = in.nextInt();
        int col = in.nextInt();

        int[][] canvas = new int[r][col];

        int a = in.nextInt();
        for (int i = 0; i <a; i++) {
            String type = in.next();
            int n = in.nextInt()-1;
            if (type.equals("R")) {
                for (int b=0; b<col; b++) {
                    if (canvas[n][b] == 0) {
                        canvas[n][b] = 1;
                    } else {
                        canvas[n][b] = 0;
                    }
                }
            } else {
                for (int c=0; c<r; c++) {
                    if (canvas[c][n] == 0) {
                        canvas[c][n] = 1;
                    } else {
                        canvas[c][n] = 0;
                    }
                }
            }
        }

        int count = 0;
        for (int row = 0; row < r; row++) {
            for (int c = 0; c < col; c++) {
                count += canvas[row][c];
            }
        }
        System.out.println(count);
    }
}
