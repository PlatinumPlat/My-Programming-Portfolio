package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_BoringBusiness {
    static boolean check(int[][] a, int[]b) {
        for (int i=0; i<a.length; i++) {
            if (Arrays.equals(b, a[i])) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] holes = {{0, -1}, {0, -2}, {0, -3}, {1, -3}, {2, -3}, {3, -3}, {3, -4}, {3, -5}, {4, -5}, {5, -5}, {5, -4}, {5, -3}, {6, -3}, {7, -3}, {7, -4}, {7, -5}, {7, -6}, {7, -7}, {6, -7}, {5, -7}, {4, -7}, {3, -7}, {2, -7}, {1, -7}, {0, -7}, {-1, -7}, {-1, -6}, {-1, -5}};
        int[][] holes2 = new int[1000][2];

        int[] point = {-1, -5};

        String [] start = new String[1000];
        int count = 0;
        int count1 = 0;
        boolean danger = false;
        boolean end = false;


        while (true) {
            String direct = in.next();
            int a = in.nextInt();

            if (direct.equals("q")) {
                break;
            } else if (direct.equals("l")) {
                int[] point2 = {point[0], point[1]};
                for (int i=point2[0]-1; i>point2[0]-a-1; i--) {
                    int[] hole = {point[0]-1, point[1]};
                    if (check(holes,hole) || check(holes2, hole)) {
                        danger = true;
                    }

                    if (danger) {
                        start[count] = (point2[0]-a) + " " + point2[1] + " " + "DANGER";
                        end = true;
                        break;
                    }

                    holes2[count1] = hole;
                    count1++;
                    point[0] = point[0]-1;

                }
                if (end) {
                    count++;
                    break;
                }
                start[count] = point[0] + " " + point[1] + " " + "safe";
                count++;

            } else if (direct.equals("r")) {
                int[] point2 = {point[0], point[1]};
                for (int i=point2[0]+1; i<point2[0]+a+1; i++) {
                    int[] hole = {point[0]+1, point[1]};
                    if (check(holes,hole) || check(holes2, hole)) {
                        danger = true;
                    }

                    if (danger) {
                        start[count] = (point2[0]+a) + " " + point2[1] + " " + "DANGER";
                        end = true;
                        break;
                    }

                    holes2[count1] = hole;
                    count1++;
                    point[0] = point[0]+1;

                }
                if (end) {
                    count++;
                    break;
                }
                start[count] = point[0] + " " + point[1] + " " + "safe";
                count++;

            } else if (direct.equals("u")) {
                int[] point2 = {point[0], point[1]};
                for (int i=point2[1]+1; i<point2[1]+a+1; i++) {
                    int[] hole = {point[0], point[1]+1};
                    if (check(holes,hole) || check(holes2, hole)) {
                        danger = true;
                    }

                    if (danger) {
                        start[count] = point2[0] + " " + (point2[1]+a) + " " + "DANGER";
                        end = true;
                        break;
                    }

                    holes2[count1] = hole;
                    count1++;
                    point[1] = point[1]+1;

                }
                if (end) {
                    count++;
                    break;
                }
                start[count] = point[0] + " " + point[1] + " " + "safe";
                count++;

            } else if (direct.equals("d")) {
                int[] point2 = {point[0], point[1]};
                for (int i=point2[1]-1; i>point2[1]-a-1; i--) {
                    int[] hole = {point[0], point[1]-1};
                    if (check(holes,hole) || check(holes2, hole)) {
                        danger = true;
                    }

                    if (danger) {
                        start[count] = point2[0] + " " + (point2[1]-a) + " " + "DANGER";
                        end = true;
                        break;
                    }

                    holes2[count1] = hole;
                    count1++;
                    point[1] = point[1]-1;
                }

                if (end) {
                    count++;
                    break;
                }
                start[count] = point[0] + " " + point[1] + " " + "safe";
                count++;
            }
        }

        for (int a = 0; a<count; a++) {
            System.out.println(start[a]);
        }
    }
}
