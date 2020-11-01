import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    // Salad, Soups, Sushi uchun Mapni ozi yetarkan, uni orniga Order class yaratamiz
    public static void main(String[] args) {
        // 5 sushi, 5 salad, 5 beverages, 5 soups, 5 desserts ==> total 25;
        MyOrders[] myOrders = new MyOrders[30];
        myOrders[0] = new MyOrders("BAKED MIX", "Snow crab, cucumber, salmon, eel, shrimp, mayonnaise, flying fish roe 6 pcs",55000.0);
        myOrders[1] = new MyOrders("KURUME", "Salmon, eel, cream cheese, spice sauce, flying fish roe 6pcs",65000.0);
        myOrders[2] = new MyOrders("YAKUZA", "Fried salmon, spice sauce, shrimps, flying fish roe, cucumber 6 pcs.",63000.0);
        myOrders[3] = new MyOrders("SHIZUOKA", "Eel, chicken, cucumber, mayonnaise, mozzarella cheese, cream cheese, salmon, sesame 6 pcs",43000.0);
        myOrders[4] = new MyOrders("SASEBO", "Eel, cream cheese, cucumber, spice sauce, flying fish roe, green onions, sesame seeds 6 pcs",45000.0);
    }
    static void printScheduleRu(){
        System.out.println("||*** SCHEDULE ***||");
        System.out.println("Mon. 11.00 - 23.00");
        System.out.println("Tues. 11.00 - 23.00");
        System.out.println("Wed. 11.00 - 23.00");
        System.out.println("Thurs. 11.00 - 23.00");
        System.out.println("Fri. 11.00 - 23.00");
        System.out.println("Sat. 11.00 - 23.00");
        System.out.println("Sun. 11.00 - 23.00");
    }
}
