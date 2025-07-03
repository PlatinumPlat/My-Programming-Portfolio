package Lists_1;
import java.util.Scanner;
import java.util.Arrays;

public class Lists_1_Phone_Microwave {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int h = in.nextInt();
        String[] date = in.next().split("/");
        String[] time = in.next().split(":");

        int y = Integer.parseInt(date[0]);
        int m = Integer.parseInt(date[1]);
        int d = Integer.parseInt(date[2]);

        int hours = Integer.parseInt(time[0]);

        hours -= h;
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (hours<0) {
            int times = ((24+(hours%24))-hours)/24;
            hours = 24+(hours%24);
            d -= times;
            if (d <= 0) {
                while (d <= 0) {
                    if (m != 1) {
                        d += monthDays[m - 2];
                        m --;
                    } else {
                        y -= 1;
                        m = 12;
                        d += 31;
                    }
                }
            }
        }

        System.out.print(y);
        System.out.print("/");

        if (m < 10) {
            System.out.print(0);

        }
        System.out.print(m);
        System.out.print("/");

        if (d < 10) {
            System.out.print(d);
        }

        System.out.print(d);
        System.out.print(" ");

        if (hours < 10) {
            System.out.print(0);
        }

        System.out.print(hours);
        System.out.print(":");
        System.out.print(time[1]);
        System.out.print(":");
        System.out.print(time[2]);
        System.out.println();

    }
}
