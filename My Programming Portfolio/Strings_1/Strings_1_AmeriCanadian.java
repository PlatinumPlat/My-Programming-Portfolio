package Strings_1;

import java.util.Scanner;
import java.util.ArrayList;

public class Strings_1_AmeriCanadian {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        ArrayList<String> words = new ArrayList<>();

        while (true) {
            input = scanner.next();
            if (input.equals("quit!")) {
                break;
            }

            if (input.length() > 4 && input.endsWith("or")) {
                if (input.charAt(input.length()-3) != 'a' && input.charAt(input.length()-3) != 'e' && input.charAt(input.length()-3) != 'i' && input.charAt(input.length()-3) != 'o' && input.charAt(input.length()-3) != 'u' && input.charAt(input.length()-3) != 'y') {
                    words.add(input.substring(0, input.length() - 2) + "our");
                } else {
                    words.add(input);
                }
            } else {
                words.add(input);
            }
        }

        for (Object word : words) {
            System.out.println(word);
        }
    }
}
