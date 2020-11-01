import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    static Scanner scannerInt = new Scanner(System.in);
    static Scanner scannerStr = new Scanner(System.in);
    // Salad, Soups, Sushi uchun Mapni ozi yetarkan, uni orniga MyOrders class yaratamiz
    public static void main(String[] args) {
        // 5 sushi, 5 salad, 3 beverages, 4 soups, 2 desserts ==> total 19;
        List<MyOrders> ordersList = new ArrayList<>();
        // 1. Sushi
        // 2. Soups
        // 3. Salads
        // 4. Desserts
        // 5. Beverages
        // SUSHI
        ordersList.add(new MyOrders("KURUME", "Salmon, eel, cream cheese, spice sauce, flying fish roe 6pcs",65000.0));
        ordersList.add(new MyOrders("BAKED MIX", "Snow crab, cucumber, salmon, eel, shrimp, mayonnaise, flying fish roe 6 pcs",55000.0));
        ordersList.add(new MyOrders("YAKUZA", "Fried salmon, spice sauce, shrimps, flying fish roe, cucumber 6 pcs.",63000.0));
        ordersList.add(new MyOrders("SHIZUOKA", "Eel, chicken, cucumber, mayonnaise, mozzarella cheese, cream cheese, salmon, sesame 6 pcs",43000.0));
        ordersList.add(new MyOrders("SASEBO", "Eel, cream cheese, cucumber, spice sauce, flying fish roe, green onions, sesame seeds 6 pcs",45000.0));
        // SOUPS
        ordersList.add(new MyOrders("FO-BO-SOUP","Rice noodles, chicken, green onions, mint, cilantro, lime, garlic",55000.0));
        ordersList.add(new MyOrders("COOK-SEA","Classic soup Kuk-Si",30000.0));
        ordersList.add(new MyOrders("MISO","Seaweed, tofu, onion, nameko mushrooms",33000.0));
        ordersList.add(new MyOrders("RAMEN-SOUP","Ramen noodles, shrimp, octopus, mussels, green onion",52000.0));
        // SALADS
        ordersList.add(new MyOrders("COOK-SEA","Classic soup Kuk-Si",30000.0));
        ordersList.add(new MyOrders("COOK-SEA","Classic soup Kuk-Si",30000.0));
        ordersList.add(new MyOrders("COOK-SEA","Classic soup Kuk-Si",30000.0));
        ordersList.add(new MyOrders("COOK-SEA","Classic soup Kuk-Si",30000.0));
        ordersList.add(new MyOrders("COOK-SEA","Classic soup Kuk-Si",30000.0));
        // DESSERTS
        ordersList.add(new MyOrders("SWEET ROLL","Rice pudding, pear, banana, apple",45000.0));
        ordersList.add(new MyOrders("FRUIT ROLL","Rice paper, sweet cream cheese, banana, cherry",60000.0));
        // BEVERAGES
        ordersList.add(new MyOrders("LEMON TEA","With sugar",10000.0));
        ordersList.add(new MyOrders("FLAT WHITHE","Coffee de-caff",13000.0));
        ordersList.add(new MyOrders("SUNRISE","Lemon, Cherry, Ice",15000.0));
//          USER
        // 2 ta user login qilingan bolsin va massiv.length = 10 bosin
        List<User> userList = new ArrayList<>();
        userList.add(new User("Anvar","anvar@gmail.com","111","13-uy 43-kv. Shayxontohur, Toshkent","+99899"));
        userList.add(new User("Sardor","sardor@gmail.com","222","34-uy. 12-kv. Yunusobod, Toshkent","+998*********"));
        userList.add(new User("Kamol","kamol@gmail.com","333","Karshi","+998*********"));
        boolean b1 = true;
        while (b1) {
            printEntrySection();
            System.out.print("Choose operation: ");
            int operation = scannerInt.nextInt();
            System.out.println();
            switch (operation){}
//            1) Login
//            2) Create account & Sign up
//            3) Log out
//            4) Our Schedule
        }
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

    static void printMenu(){
        System.out.println("1. Sushi");
        System.out.println("2. Soups");
        System.out.println("3. Salads");
        System.out.println("4. Desserts");
        System.out.println("5. Beverages");
    }

    static void printEntrySection(){
        System.out.println("1) Login");
        System.out.println("2) Create account & Sign up");
        System.out.println("3) Log out");
        System.out.println("4) Our Schedule");
    }
}
