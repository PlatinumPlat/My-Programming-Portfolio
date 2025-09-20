import java.util.*;

public class COCI_19_Contest_3_1_Preokret {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int city = 0;
        int opp = 0;
        int ties = 1;
        int lar = 0;
        int curr = 0;
        int team = 0;
        for (int i = 0; i < N; i++) {
            int c = in.nextInt();

            if (c == 1) {
                city++;

                if (team == 1) {
                    curr++;
                } else {
                    if (city - 1 < opp) {
                        curr = 1;
                        team = 1;
                    } else {
                        team = 0;
                        curr = 0;
                    }
                }
            } else {
                opp++;

                if (team == 2) {
                    curr++;
                } else {
                    if (opp - 1 < city) {
                        curr = 1;
                        team = 2;
                    } else {
                        team = 0;
                        curr = 0;
                    }
                }
            }

            if (city == opp) {
                ties++;
            }

            if (team == 1) {
                if (city > opp) {
                    lar = Math.max(lar, curr);
                }
            } else if (team == 2) {
                if (city < opp) {
                    lar = Math.max(lar, curr);
                }
            }
        }

        System.out.println(city + " " + opp);
        System.out.println(ties);
        System.out.println(lar);
    }
}
