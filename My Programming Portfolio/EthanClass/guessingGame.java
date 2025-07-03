package EthanClass;

import java.util.Scanner;

public class guessingGame {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Guess the randomly generated number from 1-100.");

        double randomInt = Math.random() * 101;
        Integer targetNum = (int)randomInt;
        int guesses = 0;

        while (true) {
            int guess = scanner.nextInt();
            if (guess != targetNum) {
                guesses += 1;
                if (guess < targetNum) {
                    System.out.println("Higher");
                } else {
                    System.out.println("Lower");
                }
            } else {
                guesses += 1;
                System.out.println("Correct!\nThe target number was " + targetNum + ".\nNumber of guesses: " + guesses);
                break;
            }
        }
    }
}
