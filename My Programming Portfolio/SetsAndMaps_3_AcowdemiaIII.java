import java.util.*;

public class SetsAndMaps_3_AcowdemiaIII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();

        char[][] grid = new char[N][M];
        in.nextLine();
        for (int a = 0; a < N; a++) {
            grid[a] = in.nextLine().toCharArray();
        }
        int count = 0;
        for (int b = 0; b < N; b++) {
            for (int c = 0; c < M; c++) {
                if (grid[b][c] == 'G') {
                    if (b - 1 > -1 && b + 1 < N && grid[b - 1][c] == 'C' && grid[b + 1][c] == 'C') {
                        count++;
                        grid[b][c] = '.';
                    } else if (c - 1 > -1 && c + 1 < M && grid[b][c - 1] == 'C' && grid[b][c + 1] == 'C') {
                        count++;
                        grid[b][c] = '.';
                    }
                }
            }
        }
        for (int b = 0; b < N; b++) {
            for (int c = 0; c < M; c++) {
                if (grid[b][c] == 'C') {
                    if (b - 1 > -1 && c - 1 > -1 && grid[b - 1][c - 1] == 'C') {
                        if (grid[b][c - 1] == 'G') {
                            grid[b][c - 1] = '.';
                            count++;
                        } else if (grid[b - 1][c] == 'G') {
                            grid[b - 1][c] = '.';
                            count++;
                        }
                    } if (b - 1 > -1 && c + 1 < M && grid[b - 1][c + 1] == 'C') {
                        if (grid[b - 1][c] == 'G') {
                            grid[b - 1][c] = '.';
                            count++;
                        } else if (grid[b][c + 1] == 'G') {
                            grid[b][c + 1] = '.';
                            count++;
                        }
                    }
                }
            }
        }

        System.out.println(count);
    }
}