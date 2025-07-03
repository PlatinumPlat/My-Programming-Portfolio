import java.io.*;
import java.util.*;

public class SetsAndMapsTester {
    public static void main(String[] args) {
        for (int test = 0; test < 1000; test++) {
            StringBuilder input = new StringBuilder();
            Random rand = new Random();

            int G = rand.nextInt(10) + 1;
            int P = rand.nextInt(10) + 1;
            input.append(G).append("\n");
            input.append(P).append("\n");

            for (int i = 0; i < P; i++) {
                int gate = rand.nextInt(G) + 1;
                input.append(gate).append("\n");
            }

            String inputStr = input.toString();
            int fastResult = runFast(new Scanner(inputStr));
            int slowResult = runSlow(new Scanner(inputStr));

            if (fastResult != slowResult) {
                System.out.println("Test failed:");
                System.out.println("Input:\n" + inputStr);
                System.out.println("Fast output: " + fastResult);
                System.out.println("Slow output: " + slowResult);
                break; // stop on first failing case
            }
        }
    }

    public static int runFast(Scanner sc) {
        int G = sc.nextInt();
        int P = sc.nextInt();

        int[] corresp = new int[G];
        for (int b = 1; b <= G; b++) {
            corresp[b - 1] = b;
        }

        int total = 0;

        for (int i = 0; i < P; i++) {
            int m = sc.nextInt();
            boolean done = false;
            while (true) {
                if (corresp[m - 1] != 0) {
                    if (corresp[m - 1] != m) {
                        m = corresp[m - 1];
                    } else {
                        total++;
                        corresp[m - 1] = m - 1;
                        done = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!done)
                break;
        }

        return total;
    }

    public static int runSlow(Scanner sc) {
        int G = sc.nextInt();
        int P = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for (int b = 1; b <= G; b++) {
            arr.add(b);
        }

        int total = 0;

        for (int i = 0; i < P; i++) {
            int m = sc.nextInt();
            int start = 0;
            int end = arr.size() - 1;
            int middle = 0;
            while (start <= end) {
                if (arr.get((start + end) / 2) < m) {
                    middle = (start + end) / 2;
                    start = (start + end) / 2 + 1;
                } else if (arr.get((start + end) / 2) == m) {
                    middle = (start + end) / 2;
                    break;
                } else {
                    end = middle - 1;
                }
            }

            if (arr.get(middle) <= m) {
                total++;
                arr.remove(middle);
            } else {
                break;
            }
        }

        return total;
    }
}
