package SetsAndMaps_3;
import java.util.*;

public class SetsAndMaps_3_Common_Words {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        for (int i=0; i<N; i++) {
            int t = in.nextInt();
            int v = in.nextInt();

            Map<String, Integer> n = new HashMap<>();
            Map<Integer, ArrayList<String>> times = new HashMap<>();

            for (int a=0; a<t; a++) {
                String let = in.next();
                if (n.containsKey(let)) {
                    ArrayList<String> curr = new ArrayList<>(times.get(n.get(let)));
                    curr.remove(let);
                    if (curr.size()>0) {
                        times.put(n.get(let), curr);
                    } else {
                        times.remove(n.get(let));
                    }
                    n.put(let, n.get(let) + 1);
                    if (times.containsKey(n.get(let))) {
                        ArrayList<String> next = new ArrayList<>(times.get(n.get(let)));
                        next.add(let);
                        times.put(n.get(let), next);
                    } else {
                        ArrayList<String> next = new ArrayList<>();
                        next.add(let);
                        times.put(n.get(let), next);
                    }
                } else {
                    n.put(let, 1);
                    if (times.containsKey(1)) {
                        ArrayList<String> next = new ArrayList<>(times.get(1));
                        next.add(let);
                        times.put(1, next);
                    } else {
                        ArrayList<String> next = new ArrayList<>();
                        next.add(let);
                        times.put(1, next);
                    }
                }
            }

            List<Integer> keyList = new ArrayList<>(times.keySet());
            Collections.sort(keyList);
            try {
                ArrayList<String> words = times.get(keyList.get(keyList.size() - v));

                if (v % 10 == 1) {
                    System.out.print(v);
                    if (v % 100 == 11) {
                        System.out.print("th");
                    } else {
                        System.out.print("st");
                    }
                } else if (v % 10 == 2) {
                    System.out.print(v);
                    if (v % 100 == 12) {
                        System.out.print("th");
                    } else {
                        System.out.print("nd");
                    }
                } else if (v % 10 == 3) {
                    System.out.print(v);
                    if (v % 100 == 13) {
                        System.out.print("th");
                    } else {
                        System.out.print("rd");
                    }
                } else {
                    System.out.print(v);
                    System.out.print("th");
                }

                System.out.print(" most common word(s):");
                System.out.println();
                for (int z = 0; z < words.size(); z++) {
                    System.out.println(words.get(z));
                }
                System.out.println("\n");
            } catch (Exception e) {
                if (v % 10 == 1) {
                    System.out.print(v);
                    if (v % 100 == 11) {
                        System.out.print("th");
                    } else {
                        System.out.print("st");
                    }
                } else if (v % 10 == 2) {
                    System.out.print(v);
                    if (v % 100 == 12) {
                        System.out.print("th");
                    } else {
                        System.out.print("nd");
                    }
                } else if (v % 10 == 3) {
                    System.out.print(v);
                    if (v % 100 == 13) {
                        System.out.print("th");
                    } else {
                        System.out.print("rd");
                    }
                } else {
                    System.out.print(v);
                    System.out.print("th");
                }

                System.out.print(" most common word(s):");
                System.out.println();

                System.out.println("\n");
            }
        }
    }
}
