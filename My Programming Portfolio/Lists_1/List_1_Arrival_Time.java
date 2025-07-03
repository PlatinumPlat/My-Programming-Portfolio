package Lists_1;
import java.util.Scanner;

public class List_1_Arrival_Time {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] hM = in.nextLine().split(":");
        int hours = Integer.parseInt(hM[0]);
        int minutes = Integer.parseInt(hM[1]);

        if (hours == 5) {
             if (minutes == 0) {
                 System.out.print("07:00");
             } else if (minutes == 20) {
                 System.out.print("07:40");
             } else {
                 System.out.print("08:20");
             }
        } else if (hours == 6) {
            if (minutes == 0) {
                System.out.print("10:00");
            } else if (minutes == 20) {
                System.out.print("09:40");
            } else {
                System.out.print("10:10");
            }
        } else if (hours > 6 && hours < 10) {
             int t = (600-hours*60-minutes);
             if (t < 240) {
                int r = 120 - (t/2);
                int mod = r % 60;
                int q = (r-mod) / 60;
                System.out.print(10 + q);
                System.out.print(":");
                if (mod == 0) {
                    System.out.print(0);
                }
                System.out.print(mod);
             } else {
                System.out.print(hours+4);
                System.out.print(":");
                System.out.print(minutes);
             }
        } else if (hours == 13) {
            if (minutes == 0) {
                System.out.print("15:00");
            } else if (minutes == 20) {
                System.out.print("15:40");
            } else {
                System.out.print("16:20");
            }
        }  else if (hours == 14) {
            if (minutes == 0) {
                System.out.print("17:00");
            } else if (minutes == 20) {
                System.out.print("17:40");
            } else {
                System.out.print("18:20");
            }
        } else if (hours > 14 && hours < 19) {
            int t = (1140-hours*60-minutes);
            if (t < 240) {
                int r = 120 - (t/2);
                int mod = r % 60;
                int q = (r-mod) / 60;
                System.out.print(19 + q);
                System.out.print(":");
                System.out.print(mod);
            } else {
                System.out.print(hours+4);
                System.out.print(":");
                System.out.print(minutes);
            }
        } else {
            int hrs = (hours+2) % 24;
            if (hrs < 10) {
                System.out.print(0);
            }
            System.out.print(hrs);
            if (minutes == 0) {
                System.out.print(":00");
            } else {
                System.out.print(":");
                System.out.print(minutes);
            }
        }
        System.out.println();
    }
}
