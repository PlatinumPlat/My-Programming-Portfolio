package Binary_Search_2;
import java.util.*;
import java.io.*;

public class Uneven_Sand {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int min = 1;
        int max = 2000000000;
        while (true) {
            int output = (max-min)/2 + min;
            if (output%1 == 0) {
                out.println(output);
                out.flush();
            } else {
                output += 0.5;
                System.out.println(output);
                out.flush();
            }
            StringTokenizer st = new StringTokenizer(r.readLine());
            String indicator = st.nextToken();
            if (indicator.equals("SINKS")) {
                min = output+1;
            } else if (indicator.equals("FLOATS")) {
                max = output-1;
            } else {
                out.flush();
                out.close();
                return;
            }
        }

    }
}
