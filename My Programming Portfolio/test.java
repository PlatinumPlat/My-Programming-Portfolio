import java.util.*;

public class test {

    public static void main(String[] args) {
        student A = new student("John", 8, 14);
        student B = new student("Alice", 5, 11);
        System.out.println(A.name + " " + A.grade + " " + A.age);

        AgeComparator agecmp = new AgeComparator();
        // Arrays.sort(, agecmp);
    }

    class student {
        String name;
        int grade;
        int age;

        student(String s, int g, int a) {
            name = s;
            grade = g;
            age = a;
        }
    }

    class AgeComparator implements Comparator<student> {
        public int compare(student a, student b) {
            return Integer.compare(a.age, b.age);
        }
    }
}