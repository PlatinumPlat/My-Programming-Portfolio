package Binary_Search_3;

import java.util.*;

public class Online_Shopping {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        for (int i = 0; i < T; i++) {
            Map<String, List<storeItem>> itemsMap = new HashMap<>();
            int stores = in.nextInt();
            for (int b = 0; b < stores; b++) {
                int items = in.nextInt();
                for (int a = 0; a < items; a++) {
                    String itemName = in.next();
                    int price = in.nextInt();
                    int stock = in.nextInt();
                    if (!itemsMap.containsKey(itemName)) {
                        itemsMap.put(itemName, new ArrayList<>());
                    }

                    storeItem itemMapValue = new storeItem(price, stock);
                    itemsMap.get(itemName).add(itemMapValue);
                }
            }

            for (String itemName : itemsMap.keySet()) {
                List<storeItem> curritem = itemsMap.get(itemName);
                Collections.sort(curritem);
                itemsMap.put(itemName, curritem);
            }

            int mimiItems = in.nextInt();
            long total = 0L;
            for (int c = 0; c < mimiItems; c++) {
                String itemNameMimi = in.next();
                int amount = in.nextInt();
                List<storeItem> curr = itemsMap.get(itemNameMimi);
                int left = amount;
                while (left > 0) {
                    if (curr.get(0).stock >= left) {
                        total += curr.get(0).price * left;
                        left = 0;
                    } else {
                        total += curr.get(0).price * curr.get(0).stock;
                        left -= curr.get(0).stock;
                        curr.remove(0);
                    }
                }
            }

            System.out.println(total);
            System.out.flush();
        }
    }

    public static class storeItem implements Comparable<storeItem> {
        int price;
        int stock;

        storeItem(int p, int s) {
            price = p;
            stock = s;
        }

        public int compareTo(storeItem a) {
            return Integer.compare(this.price, a.price);
        }
    }
}
