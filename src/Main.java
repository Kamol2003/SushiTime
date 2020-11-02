import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scannerDouble = new Scanner(System.in);
    static Scanner scannerInt = new Scanner(System.in);
    static Scanner scannerStr = new Scanner(System.in);
    private static Object MyOrders;

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
        ordersList.add(new MyOrders("KURUME", "Salmon, eel, cream cheese, spice sauce, flying fish roe 6pcs", 65000.0, "SUSHI"));
        ordersList.add(new MyOrders("BAKED MIX", "Snow crab, cucumber, salmon, eel, shrimp, mayonnaise, flying fish roe 6 pcs", 55000.0, "SUSHI"));
        // SOUPS
        ordersList.add(new MyOrders("FO-BO-SOUP", "Rice noodles, chicken, green onions, mint, cilantro, lime, garlic", 55000.0, "SOUP"));
        ordersList.add(new MyOrders("COOK-SEA", "Classic soup Kuk-Si", 30000.0, "SOUP"));
        // SALADS
        ordersList.add(new MyOrders("CHUKA SALAD", "Chuka salad, peanut sauce, lemon, sesame", 41000.0, "SALAD"));
        ordersList.add(new MyOrders("GREEK SALAD", "Iceberg, tomatoes, cucumbers, fetaki cheese, olives, onions, bell peppers, olive oil", 37000.0, "SALAD"));
        // DESSERTS
        ordersList.add(new MyOrders("SWEET ROLL", "Rice pudding, pear, banana, apple", 45000.0, "DESSERT"));
        ordersList.add(new MyOrders("FRUIT ROLL", "Rice paper, sweet cream cheese, banana, cherry", 60000.0, "DESSERT"));
        // BEVERAGES
        ordersList.add(new MyOrders("LEMON TEA", "With sugar", 10000.0, "BEVERAGE"));
        ordersList.add(new MyOrders("SUNRISE", "Lemon, Cherry, Ice", 15000.0, "BEVERAGE"));
//          USER
        // 2 ta user login qilingan bolsin va massiv.length = 10 bosin
        List<User> userList = new ArrayList<>();
        userList.add(new User("Anvar", "anvar@gmail.com", "c111", "13-uy 43-kv. Shayxontohur, Toshkent", "+998991234567"));
        userList.add(new User("Sardor", "sardor@gmail.com", "c222", "34-uy. 12-kv. Yunusobod, Toshkent", "+998997629087"));
        userList.add(new User("Sarvar", "sarvar@gmail.com", "c333", "5-uy 9-kv. Karshi", "+998976541234"));
//           MANAGER
        List<CardInfo> cardInfoList = new ArrayList<>();
        cardInfoList.add(new CardInfo("Anvar", "8600111", "anvar111", 300000.0));
        cardInfoList.add(new CardInfo("Sardor", "8600222", "sardor222", 400000.0));
        cardInfoList.add(new CardInfo("Sarvar", "8600333", "sarvar333", 500000.0));
        List<Manager> managerList = new ArrayList<>();
        managerList.add(new Manager("Javlon", "javlon@gmail.com", "m111", "+998912345678"));
        managerList.add(new Manager("Aziz", "aziz@gmail.com", "m222", "+998912345678"));
        boolean b1 = true;
        while (b1) {
            System.out.println("                                 ||*********||||||||||||||||||||||||||||||*********||");
            System.out.println("                                 ||********* SUSHI_TIME ONLINE RESTAURANT *********||");
            System.out.println("                                 ||*********||||||||||||||||||||||||||||||*********||");
//            1) Login
//            2) Create account & Sign up
//            3) Delete account
//            4) Our Schedule
            printEntrySection();
            System.out.print("Choose operation: ");
            int operation = scannerInt.nextInt();
            System.out.println();
            boolean b2 = true;
//            while (b2) {
            switch (operation) {
                case 1:
                    // 1 ==> Manager
                    // 2 ==> Customer
                    // 0 ==> Back to main menu
                    printStatus();
                    System.out.print("||* Choose your status *|| ==> ");
                    int status = scannerInt.nextInt();
                    System.out.println();
                    switch (status) {
                        case 1:
                            System.out.print("Your Email: ");
                            String managerEmail = scannerStr.nextLine();
                            System.out.print("Confirm with Password: ");
                            String managerEmailPassword = scannerStr.nextLine();
                            System.out.println();
                            for (Manager manager : managerList) {
                                if (manager.login(managerEmail, managerEmailPassword)) {
                                    // 1) Add new food"
                                    // 2) Remove food")
                                    // 3) Change price"
                                    printManagerTasks();
                                    System.out.print("Choose task: ");
                                    int task = scannerInt.nextInt();
                                    System.out.println();
                                    switch (task) {
                                        case 1:
                                            System.out.println("Type? :");
                                            String newFoodType = scannerStr.nextLine();
                                            System.out.println("Name? : ");
                                            String newFoodName = scannerStr.nextLine();
                                            System.out.println("Write description: ");
                                            String newFoodDescription = scannerStr.nextLine();
                                            System.out.println("Set price: ");
                                            double setPrice = scannerDouble.nextDouble();
                                            Manager.add(ordersList, newFoodName, newFoodDescription, setPrice, newFoodType.toUpperCase());
                                            System.out.println("||****!!! Change alert !!!****||");
                                            System.out.println("============================================================");
                                            System.out.println("|===We have new food===|\nName: " + newFoodName + "\nDescription: "
                                                    + newFoodDescription + "\nPrice: " + setPrice + " UZS");
                                            System.out.println("============================================================");
                                            break;
                                        case 2:
                                            for (int a = 0; a < ordersList.size(); a++) {
                                                System.out.println("| " + ordersList.get(a).getName() + " |");
                                            }
                                            System.out.println("Which food we don't serve anymore? : ");
                                            String deletedFood = scannerStr.nextLine();
                                            Manager.remove(ordersList, deletedFood.toUpperCase());
                                            System.out.println("||****!!! Change alert !!!****||");
                                            System.out.println("============================================================");
                                            System.out.println(deletedFood + " is deleted from menu.");
                                            System.out.println("============================================================");
                                            break;
                                        case 3:
                                            for (int a = 0; a < ordersList.size(); a++) {
                                                System.out.println("| " + ordersList.get(a).getName() + " ==> " + ordersList.get(a).getPrice() + " UZS |");
                                            }
                                            System.out.println("Enter the food, you want to reset price: ");
                                            String resetPriceFoodName = scannerStr.nextLine();
                                               /* for (int b = 0; b < ordersList.size(); b++) {
                                                    if (ordersList.get(b).getName().equals(resetPriceFoodName)){
                                                        int holderSequence = b;
                                                        String holderSequenceName = ordersList.get(b).getName();
                                                        String holderSequenceDescription = ordersList.get(b).getDescription();
                                                        break;
                                                    }
                                                }*/
                                            System.out.println("Set new price: ");
                                            Double newPrice = scannerDouble.nextDouble();
                                            Manager.editPrice(ordersList, resetPriceFoodName.toUpperCase(), newPrice);
                                            System.out.println("||****!!! Change alert !!!****||");
                                            System.out.println("======================================================================");
                                            System.out.println(resetPriceFoodName + "'s price is changed to " + newPrice + " UZS");
                                            System.out.println("======================================================================");
                                            break;
                                    }
                                } /*else {
                                        System.out.println("\n!!! Either email or password is invalid !!!\n");
                                        return;
                                    }*/
                            }
                            break;
                        case 0:
                            b2 = false;
                            break;
                        case 2:
                            System.out.print("Your Email: ");
                            String userEmailLogin = scannerStr.nextLine();
                            System.out.print("Your Password: ");
                            String userPasswordLogin = scannerStr.nextLine();
                            System.out.println();
                            for (User user : userList) {
                                if (user.login(userEmailLogin, userPasswordLogin)) {
                                    System.out.println("||****** MENU ******||");
                                    // 1. Sushi
                                    // 2. Soups
                                    // 3. Salads
                                    // 4. Desserts
                                    // 5. Beverages
                                    printMenu();
                                    System.out.print("Choose category: ");
                                    String userFoodCategoryChoose = scannerStr.nextLine();
                                    System.out.println();
                                    System.out.println("||&&&&&&&& " + userFoodCategoryChoose.toUpperCase() + " &&&&&&&&||");
                                    ordersList.forEach(myOrders -> {
                                        if (myOrders.getType().equals(userFoodCategoryChoose.toUpperCase())) {
                                            System.out.println(myOrders.getName() + " == " + myOrders.getPrice());
                                        }
                                    });
                                    System.out.print("Which one do you want write its name: ");
                                    String displayFoodDescription = scannerStr.nextLine();
                                    System.out.println();
                                    ordersList.forEach(myOrders -> {
                                        if (myOrders.getName().equals(displayFoodDescription.toUpperCase())) {
                                            System.out.println("||*************** About " + myOrders.getName() + " ***************||");
                                            System.out.println("=========================================================================================");
                                            System.out.println("|| " + myOrders.getDescription());
                                            System.out.println("=========================================================================================");
//                                                        double holderPrice = myOrders.getPrice();
                                            System.out.println("Press \"2\" to order: ");
                                            int buyButtonTwo = scannerInt.nextInt();
                                            if (buyButtonTwo == 2) {
                                                System.out.println("How many? : ");
                                                int quantity = scannerInt.nextInt();
                                                for (CardInfo cardInfo : cardInfoList) {
                                                    if (cardInfo.getOwner().equals(user.getName())) {
                                                        System.out.print("Confirm your Card Password: ");
                                                        String cardPassword = scannerStr.nextLine();
                                                        if (cardPassword.equals(cardInfo.getCardPassword())) {
                                                            cardInfo.setMoney(cardInfo.getMoney() - myOrders.getPrice() * quantity);
                                                            System.out.println("Dear " + user.getName() + ", payment was successful!!!");
                                                            System.out.println("You ordered: " + quantity + " " + displayFoodDescription.toUpperCase());
                                                            System.out.println("Total price: " + myOrders.getPrice() * quantity + " UZS");
                                                            System.out.println("Your current balance = " + cardInfo.getMoney() + " UZS");
                                                            System.out.println("\n=================================================================\n");
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    });
                                }
                            }
                    }
                    break;
                case 2:
                    // 1 ==> Manager
                    // 2 ==> Customer
                    // 0 ==> Back to main menu
                    printStatus();
                    System.out.print("||* Choose your status *|| ==> ");
                    int statusSignUp = scannerInt.nextInt();
                    System.out.println();
                    switch (statusSignUp) {
                        case 1:
                            System.out.print("Confirm yourself with ManagerKey:");
                            String managerKeySignUp = scannerStr.nextLine();
                            if (managerKeySignUp.equals(Manager.getManagerKey())) {
                                System.out.println("||=== Your Manager status is confirmed ===||");
                                System.out.println();
                                // name
                                // email
                                // password
                                // phoneNumber
                                System.out.print("Enter your name: ");
                                String managerName = scannerStr.nextLine();
                                System.out.print("Enter your email: ");
                                String managerEmail = scannerStr.nextLine();
                                System.out.print("Set password: ");
                                String managerEmailPassword = scannerStr.nextLine();
                                System.out.print("Enter your Phone number: ");
                                String managerPhone = scannerStr.nextLine();
                                managerList.add(new Manager(managerName, managerEmail, managerEmailPassword, managerPhone));
                                System.out.println("\n|||$$$$$$ Welcome " + managerName + " You are now manager $$$$$$|||\n");
                                // 1) Add new food"
                                // 2) Remove food")
                                // 3) Change price"
                                printManagerTasks();
                                System.out.print("Choose task: ");
                                int task = scannerInt.nextInt();
                                System.out.println();
                                switch (task) {
                                    case 1:
                                        System.out.println("Type? :");
                                        String newFoodType = scannerStr.nextLine();
                                        System.out.println("Name? : ");
                                        String newFoodName = scannerStr.nextLine();
                                        System.out.println("Write description: ");
                                        String newFoodDescription = scannerStr.nextLine();
                                        System.out.println("Set price: ");
                                        double setPrice = scannerDouble.nextDouble();
                                        Manager.add(ordersList, newFoodName, newFoodDescription, setPrice, newFoodType.toUpperCase());
                                        System.out.println("||****!!! Change alert !!!****||");
                                        System.out.println("============================================================");
                                        System.out.println("|===We have new food===|\nName: " + newFoodName + "\nDescription: "
                                                + newFoodDescription + "\nPrice: " + setPrice + " UZS");
                                        System.out.println("============================================================");
                                        break;
                                    case 2:
                                        for (int a = 0; a < ordersList.size(); a++) {
                                            System.out.println("| " + ordersList.get(a).getName() + " |");
                                        }
                                        System.out.println("Which food we don't serve anymore? : ");
                                        String deletedFood = scannerStr.nextLine();
                                        Manager.remove(ordersList, deletedFood.toUpperCase());
                                        System.out.println("||****!!! Change alert !!!****||");
                                        System.out.println("============================================================");
                                        System.out.println(deletedFood + " is deleted from menu.");
                                        System.out.println("============================================================");
                                        break;
                                    case 3:
                                        for (int a = 0; a < ordersList.size(); a++) {
                                            System.out.println("| " + ordersList.get(a).getName() + " ==> " + ordersList.get(a).getPrice() + " UZS |");
                                        }
                                        System.out.println("Enter the food, you want to reset price: ");
                                        String resetPriceFoodName = scannerStr.nextLine();
                                               /* for (int b = 0; b < ordersList.size(); b++) {
                                                    if (ordersList.get(b).getName().equals(resetPriceFoodName)){
                                                        int holderSequence = b;
                                                        String holderSequenceName = ordersList.get(b).getName();
                                                        String holderSequenceDescription = ordersList.get(b).getDescription();
                                                        break;
                                                    }
                                                }*/
                                        System.out.println("Set new price: ");
                                        Double newPrice = scannerDouble.nextDouble();
                                        Manager.editPrice(ordersList, resetPriceFoodName.toUpperCase(), newPrice);
                                        System.out.println("||****!!! Change alert !!!****||");
                                        System.out.println("======================================================================");
                                        System.out.println(resetPriceFoodName + "'s price is changed to " + newPrice + " UZS");
                                        System.out.println("======================================================================");
                                        break;
                                }
                            }
                        case 2:
                            // name ==> owner CardInfo
                            // email
                            // password
                            // address
                            // phoneNumber
                            // CARD INFO
                            // cardNumber
                            // cardPassword
                            // money: double
                            System.out.println("\n|||********** SIGN UP **********|||\n");
                            System.out.print("Enter your name: ");
                            String userSignUpName = scannerStr.nextLine();
                            System.out.print("Enter your email: ");
                            String userSignUpEmail = scannerStr.nextLine();
                            System.out.print("Set Password: ");
                            String userSignUpEmailPassword = scannerStr.nextLine();
                            System.out.print("Your Address: ");
                            String userSignUpAddress = scannerStr.nextLine();
                            System.out.print("Your Phone Number: ");
                            String userSignUpPhoneNumber = scannerStr.nextLine();
                            System.out.print("Your Card Number: ");
                            String userCardNumber = scannerStr.nextLine();
                            System.out.print("Your Card Password: ");
                            String userCardPassword = scannerStr.nextLine();
                            System.out.print("Enter Some money in your SUSHI_TIME wallet: ");
                            double userSignUpMoney = scannerDouble.nextDouble();
                            userList.add(new User(userSignUpName, userSignUpEmail, userSignUpEmailPassword, userSignUpAddress, userSignUpPhoneNumber));
                            cardInfoList.add(new CardInfo(userSignUpName, userCardNumber, userCardPassword, userSignUpMoney));
                            System.out.println("\n|||====== Dear " + userSignUpName + " Welcome to our restaurant ======|||\n");
                            System.out.println("||****** MENU ******||");
                            for (User user1 : userList) {
                                // 1. Sushi
                                // 2. Soups
                                // 3. Salads
                                // 4. Desserts
                                // 5. Beverages
                                printMenu();
                                System.out.print("Choose category: ");
                                String userFoodCategoryChoose = scannerStr.nextLine();
                                System.out.println();
                                System.out.println("||&&&&&&&& " + userFoodCategoryChoose.toUpperCase() + " &&&&&&&&||");
                                ordersList.forEach(myOrders -> {
                                    if (myOrders.getType().equals(userFoodCategoryChoose.toUpperCase())) {
                                        System.out.println(myOrders.getName() + " == " + myOrders.getPrice());
                                    }
                                });
                                System.out.print("Which one do you want write its name: ");
                                String displayFoodDescription = scannerStr.nextLine();
                                System.out.println();
                                ordersList.forEach(myOrders -> {
                                    if (myOrders.getName().equals(displayFoodDescription.toUpperCase())) {
                                        System.out.println("||*************** About " + myOrders.getName() + " ***************||");
                                        System.out.println("=========================================================================================");
                                        System.out.println("|| " + myOrders.getDescription());
                                        System.out.println("=========================================================================================");
//                                                        double holderPrice = myOrders.getPrice();
                                        System.out.println("Press \"2\" to order: ");
                                        int buyButtonTwo = scannerInt.nextInt();
                                        if (buyButtonTwo == 2) {
                                            System.out.println("How many? : ");
                                            int quantity = scannerInt.nextInt();
                                            for (CardInfo cardInfo1 : cardInfoList) {
                                                if (cardInfo1.getOwner().equals(user1.getName())) {
                                                    System.out.print("Confirm your Card Password: ");
                                                    String cardPassword = scannerStr.nextLine();
//                                                    if (cardPassword.equals(cardInfo1.getCardPassword())) {
                                                        cardInfo1.setMoney(cardInfo1.getMoney() - myOrders.getPrice() * quantity);
                                                        System.out.println("Dear " + user1.getName() + ", payment was successful!!!");
                                                        System.out.println("You ordered: " + quantity + " " + displayFoodDescription.toUpperCase());
                                                        System.out.println("Total price: " + myOrders.getPrice() * quantity + " UZS");
                                                        System.out.println("Your current balance = " + cardInfo1.getMoney() + " UZS");
                                                        System.out.println("\n=================================================================\n");
//                                                    }
                                                }
                                            }
                                        }
                                    }
                                });
                                break;
                            }
                            break;
                        case 3:
                            userList.forEach(user -> System.out.println(user.getName()));
                            System.out.println("\n=================================================================\n");
                            System.out.println("Enter your name: ");
                            String deleteAccountName = scannerStr.nextLine();
                            for (int i = 0; i < userList.size(); i++) {
                                if (userList.get(i).getName().equals(deleteAccountName)) {
                                    System.out.println("Confirm with your password: ");
                                    String deleteConfirmPassword = scannerStr.nextLine();
                                    if (userList.get(i).getPassword().equals(deleteConfirmPassword)) {
                                        userList.remove(i);
                                    }
                                }
                            }
                            System.out.println(deleteAccountName + " is removed from the list!!!");
                            System.out.println("\n=================================================================\n");
                            userList.forEach(user -> System.out.println(user.getName()));
                            break;
                        case 4:
                            printSchedule();
                            break;
                        default:
                            System.out.println("!!! Wrong command !!!");
                    }
            }
        }
    }
    static void printSchedule() {
        System.out.println("||*** SCHEDULE ***||");
        System.out.println("Mon. 11.00 - 23.00");
        System.out.println("Tues. 11.00 - 23.00");
        System.out.println("Wed. 11.00 - 23.00");
        System.out.println("Thurs. 11.00 - 23.00");
        System.out.println("Fri. 11.00 - 23.00");
        System.out.println("Sat. 11.00 - 23.00");
        System.out.println("Sun. 11.00 - 23.00");
    }

    static void printMenu() {
        System.out.println("1. Sushi");
        System.out.println("2. Soup");
        System.out.println("3. Salad");
        System.out.println("4. Dessert");
        System.out.println("5. Beverage");
    }

    static void printEntrySection() {
        System.out.println("1) Login");
        System.out.println("2) Create account & Sign up");
        System.out.println("3) Delete account & Log out");
        System.out.println("4) Our Schedule");
    }

    static void printStatus() {
        System.out.println("1 ==> Manager");
        System.out.println("2 ==> Customer");
        System.out.println("0 ==> Back to main menu");
    }

    static void printManagerTasks() {
        System.out.println("1) Add new food");
        System.out.println("2) Remove food");
        System.out.println("3) Change price");
    }
}