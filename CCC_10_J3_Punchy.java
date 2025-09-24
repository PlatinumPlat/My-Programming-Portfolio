import java.util.*;

public class CCC_10_J3_Punchy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long A = 0;
        long B = 0;

        while (true) {
            int n = in.nextInt();

            if (n == 1) {
                char X = in.next().charAt(0);
                if (X == 'A') {
                    long num = in.nextLong();
                    A = num;
                } else {
                    long num = in.nextLong();
                    B = num;
                }
            } else if (n==2) {
                char X = in.next().charAt(0);
                if (X == 'A') {
                    System.out.println(A);
                } else {
                    System.out.println(B);
                }
            } else if (n==3) {
                char X = in.next().charAt(0);
                if (X == 'A') {
                    char Y = in.next().charAt(0);
                    if (Y == 'A') {
                        A+=A;
                    } else {
                        A+=B;
                    }
                } else {
                    char Y = in.next().charAt(0);
                    if (Y == 'A') {
                        B+=A;
                    } else {
                        B+=B;
                    }
                }
            } else if (n == 4) {
                char X = in.next().charAt(0);
                if (X == 'A') {
                    char Y = in.next().charAt(0);
                    if (Y == 'A') {
                        A *= A;
                    } else {
                        A *= B;
                    }
                } else {
                    char Y = in.next().charAt(0);
                    if (Y == 'A') {
                        B *= A;
                    } else {
                        B *= B;
                    }
                }
            } else if (n == 5) {
                char X = in.next().charAt(0);
                if (X == 'A') {
                    char Y = in.next().charAt(0);
                    if (Y == 'A') {
                        A -= A;
                    } else {
                        A -= B;
                    }
                } else {
                    char Y = in.next().charAt(0);
                    if (Y == 'A') {
                        B -= A;
                    } else {
                        B -= B;
                    }
                }
            } else if (n == 6) {
                char X = in.next().charAt(0);
                if (X == 'A') {
                    char Y = in.next().charAt(0);
                    if (Y == 'A') {
                        A /= A;
                    } else {
                        A /= B;
                    }
                } else {
                    char Y = in.next().charAt(0);
                    if (Y == 'A') {
                        B /= A;
                    } else {
                        B /= B;
                    }
                }
            } else {
                break;
            }
        }
    }
}
