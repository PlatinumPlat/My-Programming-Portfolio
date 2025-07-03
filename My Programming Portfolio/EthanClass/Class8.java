package EthanClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Class8 {

    //1.
    static void placeBids(HashMap<String, Integer> Auction, String name, Integer bid) {
        for (String i : Auction.keySet()) {
            if (i.equals(name)) {
                if (Auction.get(i) < bid) {
                    Auction.put(name, bid);
                    break;
                }
            }
        }
        Auction.put(name, bid);
    }

    //1.
    static void displayBids(HashMap<String, Integer> Auction) {
        for (String i : Auction.keySet()) {
            System.out.println("Item: " + i + "\n" + "Highest Bid: " + Auction.get(i) + "\n");
        }
    }

    public static void main(String[] args) {
        //1.
        HashMap<String, Integer> Auction = new HashMap<>();
        Auction.put("Diamond", 10000);
        Auction.put("Mona Lisa", 5000000);

        placeBids(Auction, "Necklace", 60000);
        displayBids(Auction);

        //2.
        Scanner scanner= new Scanner(System.in);
        ArrayList<Integer> numberList = new ArrayList<>();

        System.out.println("Enter your first number between 1 and 49.");
        int num1 = scanner.nextInt();
        if (num1 < 2 || num1 > 48) {
            System.exit(0);
        } else {
            numberList.add(num1);
        }

        System.out.println("Enter your second number between 1 and 49.");
        int num2 = scanner.nextInt();
        for (Integer i : numberList) {
            if (i == num2) {
                System.exit(0);
            }
        }

        if (num2 < 2 || num2 > 48) {
            System.exit(0);
        } else {
            numberList.add(num2);
        }

        System.out.println("Enter your third number between 1 and 49.");
        int num3 = scanner.nextInt();
        for (Integer i : numberList) {
            if (i == num3) {
                System.exit(0);
            }
        }

        if (num3 < 2 || num3 > 48) {
            System.exit(0);
        } else {
            numberList.add(num3);
        }

        System.out.println("Enter your fourth number between 1 and 49.");
        int num4 = scanner.nextInt();
        for (Integer i : numberList) {
            if (i == num4) {
                System.exit(0);
            }
        }

        if (num4 < 2 || num4 > 48) {
            System.exit(0);
        } else {
            numberList.add(num4);
        }

        System.out.println("Enter your fifth number between 1 and 49.");
        int num5 = scanner.nextInt();
        for (Integer i : numberList) {
            if (i == num5) {
                System.exit(0);
            }
        }

        if (num5 < 2 || num5 > 48) {
            System.exit(0);
        } else {
            numberList.add(num5);
        }

        System.out.println("Enter your sixth number between 1 and 49.");
        int num6 = scanner.nextInt();
        for (Integer i : numberList) {
            if (i == num6) {
                System.exit(0);
            }
        }

        if (num6 < 2 || num6 > 48) {
            System.exit(0);
        } else {
            numberList.add(num6);
        }

        System.out.println("Your six numbers are: ");
        for (Integer i : numberList) {
            System.out.print(i + " ");
        }
    }
}
