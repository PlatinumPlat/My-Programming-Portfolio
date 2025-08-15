package Custom_Comparators_1;

import java.util.*;

public class Custom_Comparators_1_Cross_Spiral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tL = in.nextInt();
        int tW = in.nextInt();
        boolean[][] canvas = new boolean[tW][tL];

        int cL = in.nextInt();
        int cW = in.nextInt();

        for (int a = 0; a < cW; a++) {
            for (int b = 0; b < cL; b++) {
                canvas[a][b] = true;
            }
        }

        for (int a = tW - cW; a < tW; a++) {
            for (int b = 0; b < cL; b++) {
                canvas[a][b] = true;
            }
        }

        for (int a = 0; a < cW; a++) {
            for (int b = tL - cL; b < tL; b++) {
                canvas[a][b] = true;
            }
        }

        for (int a = tW - cW; a < tW; a++) {
            for (int b = tL - cL; b < tL; b++) {
                canvas[a][b] = true;
            }
        }

        int steps = in.nextInt();
        int[] direction = new int[2];
        int part = 1;

        int x = 0;
        int y = cL;
        direction[0] = 1;
        int s = 0;
        // check if its not work.
        while (true) {
            if (part == 1) {
                // check if the next one works, make the first one truel.
                if (direction[0] == 1) {
                    while (!canvas[x][y] & s < steps) {
                        canvas[x][y] = true;
                        y++;
                        s++;
                    }
                    y--;
                    direction[0] = 0;
                    direction[1] = 1;
                } else {
                    //check if the next one works, make the first one true.
                    while (canvas[x + 1][y + 1] & s < steps) {
                        canvas[x + 1][y] = true;
                        x++;
                        s++;
                    }
                    part = 2;
                    direction[1] = 0;
                    direction[0] = 1;
                }
            } else if (part == 2) {
                if (direction[0] == 1) {
                    while (!canvas[x][y + 1] & s < steps) {
                        y++;
                        s++;
                    }
                    direction[0] = 0;
                    direction[1] = 1;
                } else {
                    while (canvas[x + 1][y + 1] & s < steps) {
                        y++;
                        s++;
                    }
                    part = 3;
                    direction[1] = 0;
                    direction[0] = -1;
                }
            } else if (part == 3) {
                if (direction[0] == -1) {
                    while (!canvas[x + 1][y - 1] & s < steps) {
                        y--;
                        s++;
                    }
                    direction[0] = 0;
                    direction[1] = 1;
                } else {
                    while (canvas[x + 1][y + 1] & s < steps) {
                        y++;
                        s++;
                    }
                    part = 4;
                    direction[0] = -1;
                    direction[1] = 0;
                }
            } else if (part == 4) {
                if (direction[0] == -1) {
                    while (!canvas[x][y + 1] & s < steps) {
                        y++;
                        s++;
                    }
                    direction[0] = 0;
                    direction[1] = 1;
                } else {
                    while (canvas[x + 1][y + 1] & s < steps) {
                        y++;
                        s++;
                    }
                    part = 1;
                    direction[0] = 1;
                    direction[1] = 0;
                }
            }
        }

    }
}
