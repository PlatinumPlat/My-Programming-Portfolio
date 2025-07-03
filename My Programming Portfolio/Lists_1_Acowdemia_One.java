import java.util.Scanner;
import java.util.Arrays;

public class Lists_1_Acowdemia_One {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int L = in.nextInt();
        int[] papers = new int[N];

        for (int i=0; i<N; i++) {
            papers[i] = in.nextInt();
        }

        int best = -1;
        Arrays.sort(papers);
        int count = 0;
        for (int a=N-1; a>=0; a--) {
            if (a != 0) {
                if (papers[a-1] != papers[a]) {
                    count = 0;
                    int prev = N-a;
                    boolean allGood = true;
                    if (prev < papers[a] && prev+L >= papers[a]) {
                        for (int b = 1; b <= L; b++) {
                            if (papers[a - b] + 1 < papers[a]) {
                                allGood = false;
                                break;
                            }
                        }

                        if (allGood) {
                            best = papers[a];
                            break;
                        }
                    } else if (prev >= papers[a]) {
                        if (count >= papers[a] + 1 && papers[a] <= L) {
                            best = papers[a]+1;
                            break;
                        } else {
                            best = papers[a];
                            break;
                        }
                    } if (prev == papers[a] -1) {
                        best = papers[a] - 1;
                        break;
                    }
                } else {
                    count++;
                }
            } else {
                count ++;
                if (best == -1) {
                    if (count+N >= papers[a] + 1 && L >= papers[a]+1-(N-count)) {
                        best = papers[a]+1;
                    } else if (N == papers[a] -1) {
                        best = papers[a] - 1;
                    } else if (papers[a] != 0) {
                        best = papers[a];
                    } else {
                        best = 1;
                    }
                }
            }
        }

        System.out.println(best);

    }
}
