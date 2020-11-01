public class Main {
    // Salad, Soups, Sushi uchun Mapni ozi yetarkan, uni orniga MyOrders class yaratamiz
    public static void main(String[] args) {
        // 5 sushi, 5 salad, 5 beverages, 4 soups, 5 desserts ==> total 24;
        MyOrders[] myOrders = new MyOrders[30];
        // 1. Sushi
        // 2. Soups
        // 3. Salads
        // 4. Desserts
        // 5. Beverages
        // SUSHI
        myOrders[0] = new MyOrders("BAKED MIX", "Snow crab, cucumber, salmon, eel, shrimp, mayonnaise, flying fish roe 6 pcs",55000.0);
        myOrders[1] = new MyOrders("KURUME", "Salmon, eel, cream cheese, spice sauce, flying fish roe 6pcs",65000.0);
        myOrders[2] = new MyOrders("YAKUZA", "Fried salmon, spice sauce, shrimps, flying fish roe, cucumber 6 pcs.",63000.0);
        myOrders[3] = new MyOrders("SHIZUOKA", "Eel, chicken, cucumber, mayonnaise, mozzarella cheese, cream cheese, salmon, sesame 6 pcs",43000.0);
        myOrders[4] = new MyOrders("SASEBO", "Eel, cream cheese, cucumber, spice sauce, flying fish roe, green onions, sesame seeds 6 pcs",45000.0);
        // SOUPS
        myOrders[5] = new MyOrders("FO-BO-SOUP","Rice noodles, chicken, green onions, mint, cilantro, lime, garlic",55000.0);
        myOrders[6] = new MyOrders("COOK-SEA","Classic soup Kuk-Si",30000.0);
        myOrders[7] = new MyOrders("MISO","Seaweed, tofu, onion, nameko mushrooms",33000.0);
        myOrders[8] = new MyOrders("RAMEN-SOUP","Ramen noodles, shrimp, octopus, mussels, green onion",52000.0);
        // SALADS
        myOrders[9] = new MyOrders("COOK-SEA","Classic soup Kuk-Si",30000.0);
        myOrders[10] = new MyOrders("COOK-SEA","Classic soup Kuk-Si",30000.0);
        myOrders[11] = new MyOrders("COOK-SEA","Classic soup Kuk-Si",30000.0);
        myOrders[12] = new MyOrders("COOK-SEA","Classic soup Kuk-Si",30000.0);
        myOrders[13] = new MyOrders("COOK-SEA","Classic soup Kuk-Si",30000.0);
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
