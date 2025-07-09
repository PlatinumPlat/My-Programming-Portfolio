package Custom_Comparators_1;

import java.util.*;

public class Custom_Comparators_1_Boxes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        List<Box> boxes = new ArrayList<>();

        for (int a = 0; a < n; a++) {
            int[] ins = new int[3];

            ins[0] = in.nextInt();
            ins[1] = in.nextInt();
            ins[2] = in.nextInt();
            Arrays.sort(ins);

            Box l = new Box(ins[0], ins[1], ins[2]);
            boxes.add(l);
        }

        Collections.sort(boxes);
        int m = in.nextInt();

        for (int b = 0; b < m; b++) {
            int[] input = new int[3];
            input[0] = in.nextInt();
            input[1] = in.nextInt();
            input[2] = in.nextInt();
            Arrays.sort(input);
            boolean found = false;

            for (int c = 0; c < boxes.size(); c++) {
                if (input[0] <= boxes.get(c).first && input[1] <= boxes.get(c).second && input[2] <= boxes.get(c).third) {
                    long fir = (long) boxes.get(c).first;
                    long sec = (long) boxes.get(c).second;
                    long thir = (long) boxes.get(c).third;
                
                    System.out.println(fir*sec*thir);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Item does not fit.");
            }
        }
    }

    static class Box implements Comparable<Box> {
        int first;
        int second;
        int third;

        Box(int f, int s, int t) {
            first = f; 
            second = s; 
            third = t; 
        }

        public int compareTo(Box b) {
            long myVol = this.first * this.second * this.third;
            long bVol = b.first * b.second * b.third;
            if ((myVol-bVol)>0) {
                return 1;
            } else if ((myVol-bVol)<0) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}