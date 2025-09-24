import java.util.*;

public class CCC_01_S1_Keeping_Score {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String cards = in.next();

        System.out.println("Cards Dealt              Points");
        System.out.print("Clubs");
        int clubTotal = 0;
        int i = 1;
        int clubsCount = 0;
        while (i < cards.length()) {
            char c = cards.charAt(i);
            if (c != 'D') {
                if (c == 'A') {
                    clubTotal += 4;
                } else if (c == 'K') {
                    clubTotal += 3;
                } else if (c == 'Q') {
                    clubTotal += 2;
                } else if (c == 'J') {
                    clubTotal += 1;
                }

                System.out.print(" " + c);
                clubsCount++;
                i++;
            } else {
                i++;
                break;
            }
        }
        if (clubsCount == 0) {
            clubTotal += 3;
        } else if (clubsCount == 1) {
            clubTotal += 2;
        } else if (clubsCount == 2) {
            clubTotal += 1;
        }
        System.out.println("             " + clubTotal);

        System.out.print("Diamonds");
        int dTotal = 0;
        int dCount = 0;
        while (i < cards.length()) {
            char c = cards.charAt(i);
            if (c != 'H') {
                if (c == 'A') {
                    dTotal += 4;
                } else if (c == 'K') {
                    dTotal += 3;
                } else if (c == 'Q') {
                    dTotal += 2;
                } else if (c == 'J') {
                    dTotal += 1;
                }

                System.out.print(" " + c);
                dCount++;
                i++;
            } else {
                i++;
                break;
            }
        }
        if (dCount == 0) {
            dTotal += 3;
        } else if (dCount == 1) {
            dTotal += 2;
        } else if (dCount == 2) {
            dTotal += 1;
        }
        System.out.println("             " + dTotal);

        System.out.print("Hearts");
        int hTotal = 0;
        int hCount = 0;
        while (i < cards.length()) {
            char c = cards.charAt(i);
            if (c != 'S') {
                if (c == 'A') {
                    hTotal += 4;
                } else if (c == 'K') {
                    hTotal += 3;
                } else if (c == 'Q') {
                    hTotal += 2;
                } else if (c == 'J') {
                    hTotal += 1;
                }

                System.out.print(" " + c);
                hCount++;
                i++;
            } else {
                i++;
                break;
            }
        }
        if (hCount == 0) {
            hTotal += 3;
        } else if (hCount == 1) {
            hTotal += 2;
        } else if (hCount == 2) {
            hTotal += 1;
        }
        System.out.println("             " + hTotal);

        System.out.print("Spades");
        int sTotal = 0;
        int sCount = 0;
        while (i < cards.length()) {
            char c = cards.charAt(i);
            if (c == 'A') {
                sTotal += 4;
            } else if (c == 'K') {
                sTotal += 3;
            } else if (c == 'Q') {
                sTotal += 2;
            } else if (c == 'J') {
                sTotal += 1;
            }

            System.out.print(" " + c);
            sCount++;
            i++;
        }
        if (sCount == 0) {
            sTotal += 3;
        } else if (sCount == 1) {
            sTotal += 2;
        } else if (sCount == 2) {
            sTotal += 1;
        }
        System.out.println("             " + sTotal);

        System.out.println("Total " + (clubTotal + dTotal + hTotal + sTotal));
    }
}
