package Stack_2;
import java.util.Scanner;

public class Stack_2_Crayola_Lightsaber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        in.nextLine();
        String[] colours = in.nextLine().split(" ");
        int cRed = 0;
        int cOrange = 0;
        int cYellow = 0;
        int cGreen = 0;
        int cBlue = 0;
        int cBlack = 0;

        for (int i=0; i<N; i++) {
            if (colours[i].equals("red")) {
                cRed ++;
            } else if (colours[i].equals("orange")) {
                cOrange++;
            } else if (colours[i].equals("orange")) {
                cOrange++;
            } else if (colours[i].equals("yellow")) {
                cYellow++;
            } else if (colours[i].equals("green")) {
                cGreen++;
            } else if (colours[i].equals("blue")) {
                cBlue++;
            } else if (colours[i].equals("black")) {
                cBlack++;
            }
        }

        int total = cRed + cOrange + cYellow + cGreen + cBlue + cBlack;
        if (total % 2 ==0) {
            if (cRed > total/2) {
                System.out.println((total-cRed)*2+1);
            } else if (cOrange>total/2) {
                System.out.println((total-cOrange)*2+1);
            } else if (cYellow>total/2) {
                System.out.println((total-cYellow)*2+1);
            } else if (cGreen>total/2) {
                System.out.println((total-cGreen)*2+1);
            } else if (cBlue>total/2) {
                System.out.println((total-cBlue)*2+1);
            } else if (cBlack>total/2) {
                System.out.println((total-cBlack)*2+1);
            } else {
                System.out.println(total);
            }
        } else {
            if (cRed > (total+1)/2) {
                System.out.println((total-cRed)*2+1);
            } else if (cOrange > (total+1)/2) {
                System.out.println((total-cOrange)*2+1);
            } else if (cYellow>(total+1)/2) {
                System.out.println((total-cYellow)*2+1);
            } else if (cGreen>(total+1)/2) {
                System.out.println((total-cGreen)*2+1);
            } else if (cBlue>(total+1)/2) {
                System.out.println((total-cBlue)*2+1);
            } else if (cBlack>(total+1)/2) {
                System.out.println((total-cBlack)*2+1);
            } else {
                System.out.println(total);
            }
        }
    }
}
