import java.util.*;
public class CCC_02_S1_The_Students_Council_Breakfast {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int P = in.nextInt();
        int G = in.nextInt();
        int R = in.nextInt();
        int O = in.nextInt();
        int amount = in.nextInt();
        int combinationsAmount = 0;
        int smallestTicketNum = amount+1000;
        for (int a=0; a*P<=amount; a++) {
            for (int b=0; b*G<=amount; b++) {
                for (int c=0; c*R<=amount; c++) {
                    for (int d=0; d*O<=amount; d++) {
                        if (a*P+b*G+c*R+d*O== amount) {
                            System.out.println("# of PINK is " + a + " # of GREEN is " + b + " # of RED is " + c + " # of ORANGE is " + d);
                            combinationsAmount++;
                            smallestTicketNum = Math.min(a+b+c+d, smallestTicketNum);
                        }
                    }
                }
            }
        }
        System.out.println("Total combinations is " + combinationsAmount + ".");
        System.out.println("Minimum number of tickets to print is " + smallestTicketNum + ".");
    }
}
