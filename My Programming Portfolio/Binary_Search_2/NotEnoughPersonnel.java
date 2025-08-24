package Binary_Search_2;
import java.util.*;

public class NotEnoughPersonnel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        List<veteran> veterans = new ArrayList<>();

        for (int a = 0; a < N; a++) {
            veteran newV = new veteran(in.next(), in.nextInt(), a);
            veterans.add(newV);
        }

        Collections.sort(veterans);

        int M = in.nextInt();
        for (int i = 0; i < M; i++) {
            int skillLevel = in.nextInt();
            int diff = in.nextInt();
            veteran searchFor = new veteran(null, skillLevel, 0);
            int index = Collections.binarySearch(veterans, searchFor);
            if (index < 0) {
                index = -1 * (index + 1);
            }
            if (index == -1) {
                index = 0;
            }

            if (index < 0 || index >= N) {
                System.out.println("No suitable teacher!");
            } else {
                int skillLevelofvet = veterans.get(index).skill;
                if (skillLevelofvet > skillLevel + diff) {
                    System.out.println("No suitable teacher!");
                } else {
                    System.out.println(veterans.get(index).name);
                }
            }
        }
    }

    public static class veteran implements Comparable<veteran> {
        String name;
        int skill;
        int indx;

        veteran(String s, int g, int i) {
            name = s;
            skill = g;
            indx = i;
        }

        public int compareTo(veteran b) {
            if (this.skill == b.skill) {
                return this.indx - b.indx;
            } else {
                return this.skill - b.skill;
            }
        }
    }
}
