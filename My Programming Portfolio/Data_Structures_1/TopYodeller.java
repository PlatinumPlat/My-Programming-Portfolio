package Data_Structures_1;

import java.util.*;

public class TopYodeller {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int Y = in.nextInt();
        int R = in.nextInt();
        int[] scores = new int[Y];
        int[] ranks = new int[Y];
        List<Integer> output = new ArrayList<>();
        int best = 0;

        for (int i=0; i<R; i++) {
            List<Pair> round = new ArrayList<>();
            for (int b=0; b<Y; b++) {
                int add = in.nextInt();
                scores[b] += add;
                round.add(new Pair(b, scores[b]));
            }
            Collections.sort(round);
            
            if (i==R-1) {
                best = round.get(0).score;
                int prevrank = 0;
                int prevscore = best;
                for (int c = 0; c < Y; c++) {
                    if (round.get(c).score==prevscore) {
                        ranks[round.get(c).num] = Math.max(ranks[round.get(c).num], prevrank);
                    } else {
                        ranks[round.get(c).num] = Math.max(ranks[round.get(c).num], prevrank + 1);
                        prevrank++;
                        prevscore = round.get(c).score;
                    }
                    
                    if (round.get(c).score==best) {
                        output.add(round.get(c).num);
                    }
                }
            } else {
                int prevrank = 0;
                int prevscore = round.get(0).score;
                for (int c = 0; c < Y; c++) {
                    if (round.get(c).score == prevscore) {
                        ranks[round.get(c).num] = Math.max(ranks[round.get(c).num], prevrank);
                    } else {
                        ranks[round.get(c).num] = Math.max(ranks[round.get(c).num], prevrank + 1);
                        prevrank++;
                        prevscore = round.get(c).score;
                    }
                }
            }
        }

        Collections.sort(output);
        for (int e=0; e<output.size(); e++) {
            System.out.println("Yodeller " + (output.get(e) + 1) + " is the TopYodeller: score " + scores[output.get(e)] + ", worst rank " + (ranks[output.get(e)] + 1));
        }
    }
    
    static class Pair implements Comparable<Pair> {
        int num;
        int score;

        Pair (int a, int b) {
            num = a;
            score = b;
        }

        public int compareTo(Pair b) {
            return b.score- this.score;
        }
    }
}