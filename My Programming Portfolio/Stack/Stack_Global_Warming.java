package Stack;
import java.util.Scanner;
import java.util.Arrays;


public class Stack_Global_Warming {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] out = new int[5];
        Arrays.fill(out, -1);
        int count =0;

        while (true) {
            String[] nums = in.nextLine().split(" ");
            int N = Integer.parseInt(nums[0]);
            if (N==0) {
                break;
            } else if (N==1) {
                out[count] = 0;
                count++;
                continue;
            } else {
                int[] years = new int[N];
                int[] diff = new int[N-1];
                int before = Integer.parseInt(nums[1]);
                years[0] = before;
                for (int i=1; i<N; i++) {
                    years[i] = Integer.parseInt(nums[i+1]);
                    diff[i-1] = years[i]-before;
                    before = years[i];
                }

                int smallest = N;

                for (int a=1; a<N; a++) {
                    boolean found = true;
                    int patternIndx = 0;
                    int indx = 0;

                    while (true) {
                        if (diff[indx] != diff[patternIndx]) {
                            found = false;
                            break;
                        } else {
                            indx++;
                            if (patternIndx == a-1) {
                                patternIndx = 0;
                            } else {
                                patternIndx++;
                            }

                            if (indx == diff.length) {
                                break;
                            }
                        }
                    }

                    if (found) {
                        smallest = a;
                        break;
                    }
                }

                out[count] = smallest;
                count++;
            }
        }

        for (int c=0; c<5; c++) {
            if (out[c] != -1) {
                System.out.println(out[c]);
            }
        }
    }
}
