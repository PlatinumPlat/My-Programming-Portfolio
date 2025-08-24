package Binary_Search_3;

import java.util.*;

public class Nightmare_A_thon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int Q = in.nextInt();
        Map<Integer, ArrayList<Integer>> c = new HashMap<>();

        for (int a = 0; a < N; a++) {
            int rating = in.nextInt();
            if (!c.containsKey(rating)) {
                c.put(rating, new ArrayList<>());
            }
            c.get(rating).add(a);
        }

        for (int e = 10; e > 0; e--) {
            if (c.containsKey(e)) {
                ArrayList<Integer> change = c.get(e);
                Collections.sort(change);
                c.put(e, change);
            }
        }

        for (int b = 0; b < Q; b++) {
            int start = in.nextInt() - 1;
            int end = in.nextInt() - 1;

            for (int d = 10; d > 0; d--) {
                if (c.containsKey(d)) {
                    ArrayList<Integer> currList = c.get(d);
                    if (start == end) {
                        if (currList.contains(start)) {
                            if (currList.size() > 1) {
                                System.out.print(d + " ");
                                System.out.println(currList.size() - 1);
                            } else {
                                continue;
                            }
                        } else {
                            System.out.print(d + " ");
                            System.out.println(currList.size());
                        }
                        break;
                    }

                    int endP = Collections.binarySearch(currList, end);
                    int startP = Collections.binarySearch(currList, start);
                    if ((startP == 0 || startP == -1)
                            && (endP == currList.size() - 1 || endP == (currList.size()) * -1 - 1)) {
                        continue;
                    } else {
                        if (startP < 0) {
                            startP = startP * -1 -1;
                        }
                        if (endP < 0) {
                            endP = endP * -1 -2;
                        }
                        System.out.print(d + " ");
                        System.out.println(currList.size() - (endP - startP+1));
                        break;
                    }
                }
            }
        }
    }
}
