package Custom_Comparators_1;
import java.util.*;

public class Custom_Comparators_1_Hearth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        int T = in.nextInt();

        Map<String, Integer> cards = new HashMap<>();
        String[] names = new String[N];
        for (int a=0; a<N; a++) {
            String name = in.next();
            cards.put(name, in.nextInt());
            names[a] = name;
        }

        ArrayList<String> out = new ArrayList<>();
        for (int b=0; b<N; b++) {
            for (int c=b+1; c<N; c++) {
                for (int d=c+1; d<N; d++) {
                    String n1 = names[b];
                    String n2 = names[c];
                    String n3 = names[d];
                    String[] s = new String[3];
                    s[0] = n1;
                    s[1] = n2;
                    s[2] = n3;
                    Arrays.sort(s);

                    int c1 = cards.get(n1);
                    int c2 = cards.get(n2);
                    int c3 = cards.get(n3);
                    

                    if (c1+c2+c3<=T) {
                        StringBuffer o = new StringBuffer();

                        o.append(s[0]);
                        o.append(" ");
                        o.append(s[1]);
                        o.append(" ");
                        o.append(s[2]);
                        out.add(String.valueOf(o));
                    }
                }
            }
        }

        Collections.sort(out);
        for (int z=0; z<out.size(); z++) {
            System.out.println(out.get(z));
        }
    }
}
