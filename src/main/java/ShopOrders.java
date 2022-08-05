import java.util.*;

public class ShopOrders {
    public static void main(String[] args) {

        ArrayList<String> orders = new ArrayList<>();
        orders.add("order1");
        orders.add("order1");
        orders.add("order2");
        orders.add("order2");




        Set<String> treeSet = new TreeSet<>(orders);
        Set <String> hashSet = new HashSet<>(orders);
        System.out.println("hashSet" + hashSet);
        System.out.println("treeset" + treeSet);

        String[] orders1 = new String[7];
        orders1[0] = "Order1";
        orders1[1] = "Order1";
        orders1[2] = "Order2";
        orders1[3] = "Order2";
        orders1[4] = "Order3";
        orders1[5] = "Order4";
        orders1[6] = "Order5";

        HashSet<String> orderHashSet = new HashSet<>(Arrays.asList(orders1));
        TreeSet<String> orderTreeSet = new TreeSet<>(Arrays.asList(orders1));
        System.out.println("hashSet" + orderHashSet);
        System.out.println("treeset" + orderTreeSet);
    }
}
