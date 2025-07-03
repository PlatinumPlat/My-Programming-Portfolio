package EthanClass;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        File file = new File("file.txt");
        try {
            FileWriter fileWriter = new FileWriter("file.txt");
            String userInput = scanner.nextLine();
            while (!userInput.equals("done")) {
                fileWriter.write(userInput + "\n");
                userInput = scanner.next();
            }
            fileWriter.close();
        } catch (Exception e) {
            System.out.println("File error.");
        }
    }
}
