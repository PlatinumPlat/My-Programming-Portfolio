import java.util.*;

public class Good_Times {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int HM = in.nextInt();
        int h;
        int m;
        if (HM < 100) {
            h = 0;
            m = HM;
        } else {
            h = HM / 100;
            m = HM % 100;
        }
        System.out.println(timeFormat(h, m) + " in Ottawa");
        System.out.println(timeFormat(h - 3, m) + " in Victoria");
        System.out.println(timeFormat(h - 2, m) + " in Edmonton");
        System.out.println(timeFormat(h - 1, m) + " in Winnipeg");
        System.out.println(timeFormat(h, m) + " in Toronto");
        System.out.println(timeFormat(h + 1, m) + " in Halifax");
        System.out.println(timeFormat(h + 1, m + 30) + " in St. John's");
    }

    static String timeFormat(int hours, int minutes) {
        if (hours<0) {
            hours += 24;
        } if (minutes <0) {
            minutes += 60;
        }
        
        hours += minutes/60;
        hours %= 24;
        minutes %= 60;
        if (hours==0) {
            return String.valueOf(minutes);
        } else if (minutes<10) {
            return String.valueOf(hours) + "0" + String.valueOf(minutes);
        } else {
            return String.valueOf(hours) + String.valueOf(minutes);
        }
    }
}
