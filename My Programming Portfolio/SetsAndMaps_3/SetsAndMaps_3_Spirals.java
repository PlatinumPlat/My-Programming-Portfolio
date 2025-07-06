package SetsAndMaps_3;

import java.util.*;
import java.lang.Math;

public class SetsAndMaps_3_Spirals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int[][] spiral = new int[13][13];
        spiral[6][6] = a;
        int x = 6;
        int y = 7;
        int num = a + 1;
        String direction = "down";
        int top = 6;
        int bottom = 6;
        int right = 6;
        int left = 6;

        while (num < b + 1) {
            if (direction.equals("down")) {
                spiral[x][y] = num;
                bottom = Math.max(y, bottom);
                if (spiral[x + 1][y] == 0) {
                    direction = "right";
                    x++;
                } else {
                    y++;
                }
                num++;
            } else if (direction.equals("right")) {
                spiral[x][y] = num;
                right = Math.max(x, right);

                if (spiral[x][y - 1] == 0) {
                    direction = "up";
                    y--;
                } else {
                    x++;
                }
                num++;
            } else if (direction.equals("up")) {
                spiral[x][y] = num;
                top = Math.min(y, top);

                if (spiral[x - 1][y] == 0) {
                    direction = "left";
                    x--;
                } else {
                    y--;
                }
                num++;
            } else if (direction.equals("left")) {
                spiral[x][y] = num;
                left = Math.min(x, left);

                if (spiral[x][y + 1] == 0) {
                    direction = "down";
                    y++;
                } else {
                    x--;
                }
                num++;
            }
        }

        String[][] sl = new String[13][13];
        for (int l = left; l <= right; l++) {
            if (l != left) {
                System.out.print(" ");
            }
            if (spiral[l][top] == 0) {
                StringBuffer newS = new StringBuffer();
                for (int g = 0; g < String.valueOf(spiral[l][bottom]).length(); g++) {
                    System.out.print(" ");
                    newS.append(" ");
                }
                sl[l][top] = String.valueOf(newS);
            } else {
                System.out.print(spiral[l][top]);
                sl[l][top] = String.valueOf(spiral[l][top]);
            }
        }
        System.out.println();

        for (int t = top + 1; t <= bottom; t++) {
            if (t == bottom) {
                for (int l = left; l <= right; l++) {
                    if (l != left) {
                        System.out.print(" ");
                    }
                    if (spiral[l][bottom] == 0) {
                        StringBuffer newS = new StringBuffer();
                        for (int g =0; g< sl[l][bottom-1].length(); g++) {
                            System.out.print(" ");
                            newS.append(" ");
                        }
                        sl[l][bottom] = String.valueOf(newS);
                    } else {
                        StringBuffer newS = new StringBuffer();
                        for (int z = 0; z < sl[l][bottom - 1].length() - String.valueOf(spiral[l][bottom]).length(); z++) {
                            System.out.print(" ");
                            newS.append(" ");
                        }
                        System.out.print(spiral[l][bottom]);
                        newS.append(spiral[l][bottom]);
                        sl[l][bottom] = String.valueOf(newS);
                    }
                }
                System.out.println();
            } else {
                for (int l = left; l <= right; l++) {
                    if (l != left) {
                        System.out.print(" ");
                    }
                    if (spiral[l][t] == 0) {
                        StringBuffer newS = new StringBuffer();
                        for (int g = 0; g < sl[l][t - 1].length(); g++) {
                            System.out.print(" ");
                            newS.append(" ");
                        }
                        sl[l][t] = String.valueOf(newS);
                    } else {
                        StringBuffer newS = new StringBuffer();
                        if (sl[l][t-1].length() - String.valueOf(spiral[l][t]).length() > 0) {
                            for (int z = 0; z < sl[l][t - 1].length() - String.valueOf(spiral[l][t]).length(); z++) {
                                System.out.print(" ");
                                newS.append(" ");
                            }
                        }
                        System.out.print(spiral[l][t]);
                        newS.append(spiral[l][t]);
                        sl[l][t] = String.valueOf(newS);
                    }
                }
                System.out.println();
            }
        }

    }
}
