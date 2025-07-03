import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Math;


public class Lists_2_Year_Of_The_Cow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> secondNames = new ArrayList<>();
        ArrayList<String> yearCorresponds = new ArrayList<>();
        ArrayList<String> zodiacYears = new ArrayList<String>();
        zodiacYears.add("Rat");
        zodiacYears.add("Ox");
        zodiacYears.add("Tiger");
        zodiacYears.add("Rabbit");
        zodiacYears.add("Dragon");
        zodiacYears.add("Snake");
        zodiacYears.add("Horse");
        zodiacYears.add("Goat");
        zodiacYears.add("Monkey");
        zodiacYears.add("Rooster");
        zodiacYears.add("Dog");
        zodiacYears.add("Pig");
        int[] differences = new int[N];
        yearCorresponds.add("Ox");
        firstNames.add("Bessie");


        in.nextLine();
        for (int i=0; i<N; i++) {
            String[] input = in.nextLine().split(" ");


            String name1 = input[0];
            String name2 = input[7];
            firstNames.add(name1);
            secondNames.add(name2);
            String indicator = input[3];
            String year = input[4];
            String year2 = yearCorresponds.get(firstNames.indexOf(name2));
            yearCorresponds.add(year);


            if (indicator.equals("previous")) {
                if (zodiacYears.indexOf(year) < zodiacYears.indexOf(year2)) {
                    differences[i] = -1 * (zodiacYears.indexOf(year2) - zodiacYears.indexOf(year));
                } else if (zodiacYears.indexOf(year2) == zodiacYears.indexOf(year)) {
                    differences[i] = -12;
                } else {
                    differences[i] = -1 * (zodiacYears.indexOf(year2) - zodiacYears.indexOf(year) + 12);
                }
            } else {
                if (zodiacYears.indexOf(year2) < zodiacYears.indexOf(year)) {
                    differences[i] = zodiacYears.indexOf(year) - zodiacYears.indexOf(year2);
                } else if (zodiacYears.indexOf(year) == zodiacYears.indexOf(year2)) {
                    differences[i] = 12;
                } else {
                    differences[i] = zodiacYears.indexOf(year) - zodiacYears.indexOf(year2) + 12;
                }
            }
            if (name1.equals("Elsie")) {
                break;
            }
        }
        int difference = 0;
        int indexTracker = firstNames.indexOf("Elsie");
        String nameTracker = "Elsie";
        while (!nameTracker.equals("Bessie")) {
            difference += differences[indexTracker-1];
            nameTracker = secondNames.get(indexTracker-1);
            indexTracker = firstNames.indexOf(nameTracker);
        }

        System.out.println(Math.abs(difference));
    }
}


