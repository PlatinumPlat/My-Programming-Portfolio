import java.util.*;

public class CCC_08_S1_Its_Cold_Here {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String coldest = "Waterloo";
        int temp = 300;
        while (true) {
            String city = in.next();
            int temperature = in.nextInt();
            if (temperature<temp) {
                temp = temperature;
                coldest = city;
            }

            if (city.equals("Waterloo")) {
                break;
            }
        }

        System.out.println(coldest);
    }
}
