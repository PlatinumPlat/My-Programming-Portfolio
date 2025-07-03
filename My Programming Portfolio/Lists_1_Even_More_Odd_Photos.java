import java.util.Scanner;
import java.util.ArrayList;

public class Lists_1_Even_More_Odd_Photos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        boolean e = true;

        for (int i=0; i<N; i++) {
            int num = in.nextInt();
            if (num % 2==0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }

        int count = 0;
        while (true) {
            if (even.size()!=0 || odd.size() != 0) {
                if (e) {
                    if (even.size() > 0) {
                        even.remove(0);
                        count++;
                        e = false;
                    } else {
                        if (odd.size() > 1) {
                            odd.remove(0);
                            odd.remove(0);
                            count++;
                            e = false;
                        } else {
                            System.out.println(count - 1);
                            return;
                        }
                    }
                } else {
                    if (odd.size() > 0) {
                        odd.remove(0);
                        count++;
                        e = true;
                    } else {
                        System.out.println(count);
                        return;
                    }
                }
            } else {
                System.out.println(count);
                return;
            }
        }
    }
}
