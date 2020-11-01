import java.util.List;

public class Manager implements CheckManager {
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private String managerKey = "&t%Z{e)V>RXpQ5Y";

    Manager(String name, String email, String password, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean login(String email, String password) {
        return getEmail().equals(email) && getPassword().equals(password);
    }

    @Override
    public boolean loginManager(String managerKey) {
        return getManagerKey().equals(managerKey);
    }

    public String getManagerKey() {
        return managerKey;
    }

    public String getName() {
        return name;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return " | " + getName()+" | "+getEmail()+" | "+getPhoneNumber()+" | ";
    }

    public static void  add(List<MyOrders> ordersList,String name, String description, double price){
        ordersList.add(new MyOrders(name.toUpperCase(),description,price));
    }
    public static void  remove(List<MyOrders> ordersList, String name){
        for (int i = 0; i < ordersList.size(); i++) {
            if (ordersList.get(i).getName().equals(name)){
                ordersList.remove(i);
            }
        }
    }
// ERROR! with setPrice and Contructor
    public static void editPrice(List<MyOrders> ordersList, String name ,double newPrice){
        for (int j = 0; j < ordersList.size(); j++) {
            if (ordersList.get(j).getName().equals(name)){
                ordersList.get(j).setPrice(newPrice);
            }
        }
    }
}



























