package Introduction;

import java.util.*;

public class Introduction_Sunflowers {
    static int[][] rotate(int[][]Heights, int a) {
        int r;
        int c;
        int[][] Heights1 = new int[a][a];
        int[][] Heights2 = new int[a][a];

        for (r = 0; r < a; r++) {
            for (c = 0; c < a; c++) {
                if (r != c) {
                    Heights1[r][c] = Heights[c][r];
                } else {
                    Heights1[r][c] = Heights[r][c];
                }
            }
        }

        for (r = 0; r < a; r++) {
            for (c = 0; c < a; c++) {
                Heights2[r][c] = Heights1[r][a-1-c];
            }
        }

        return Heights2;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        int [][] Heights = new int[a][a];
        int row = 0;
        int col = 0;

        for (row = 0; row < a; row++) {
            for (col = 0; col < a; col ++) {
                Heights[row][col] = in.nextInt();
            }
        }

        int [][] Heights1 = new int[a][a];
        int [][] Heights2 = new int[a][a];
        if (Heights[0][0] > Heights[1][0] && Heights[0][0] > Heights[0][1]) {
            Heights2 = rotate(Heights,a);
            Heights2 = rotate(Heights2,a);

        } else if (Heights[0][0] > Heights[1][0] && Heights[0][0] < Heights[0][1]) {
            Heights2 = rotate(Heights,a);

        } else if (Heights[0][0] < Heights[1][0] && Heights[0][0] > Heights[0][1]) {
            int r;
            int c;

            for (r = 0; r < a; r++) {
                for (c = 0; c < a; c++) {
                    if (r != c) {
                        Heights1[r][c] = Heights[c][r];
                    } else {
                        Heights1[r][c] = Heights[r][c];
                    }
                }
            }

            for (r = 0; r < a; r++) {
                for (c = 0; c < a; c ++) {
                    Heights2[r][c] = Heights1[a-1-r][c];
                }
            }
        } else {
            Heights2 = Heights;
        }

        int r;
        int c;

        for (r = 0; r < a; r++) {
            System.out.print(Heights2[r][0]);
            for (c = 1; c < a; c++) {
                System.out.print(" "+Heights2[r][c]);
            }
            System.out.println();
        }
    }
}
