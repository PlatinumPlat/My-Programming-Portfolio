package PSA_DSA_1;

import java.util.*;

public class Battle_Decisions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int I = in.nextInt();
        int minN = in.nextInt();
        int waves = in.nextInt();
        int[] PSA = new int[I];

        for (int i=0; i<waves; i++) {
            int x1 = in.nextInt()-1;
            int x2 = in.nextInt()-1;
            int K = in.nextInt();   

            PSA[x1] += K;
            if (x2+1 < I) {
                PSA[x2+1] -= K;
            }            
        }

        int total = 0;
        int count = 0;
        
        for (int a=0; a<I; a++) {
            total += PSA[a];
            PSA[a] = total;

            if (total < minN) {
                count++;
            }
        }

        System.out.println(count);
    }
}
