package EthanClass;

import java.lang.instrument.IllegalClassFormatException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class LastHomework {

    public static void main(String[] args) throws IllegalClassFormatException {
        // 1.
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(9);
        nums1.add(7);
        nums1.add(33);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(62);
        nums2.add(3);
        nums2.add(0);

        Iterator<Integer> iterator1 = nums1.iterator();
        Iterator<Integer> iterator2 = nums2.iterator();
        ArrayList<Integer> nums3 = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            nums3.add(iterator1.next());
            nums3.add(iterator2.next());
        }

        System.out.println(nums3);

        // 2.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password: ");
        String password = scanner.next();
        ArrayList<String> numList = new ArrayList<>();
        numList.add("0");
        numList.add("1");
        numList.add("2");
        numList.add("3");
        numList.add("4");
        numList.add("5");
        numList.add("6");
        numList.add("7");
        numList.add("8");
        numList.add("9");

        for (int i = 0; i < 10; i++) {
            if (password.contains(numList.get(i))) {
                if (password.length() >= 8) {
                    String newPassword = password.replaceAll("[0-9]", "");
                    String lowerPassword = newPassword.toLowerCase();
                    if (lowerPassword != newPassword) {
                        System.out.println("nice password");
                        return;
                    } else {
                        throw new IllegalClassFormatException("Need one capital letter");
                    }
                } else {
                    throw new IllegalClassFormatException("Need length of 8");
                }
            }

        }
        throw new IllegalClassFormatException("Need one number character");
    }
}