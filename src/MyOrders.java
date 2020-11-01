public class MyOrders {
    private String type;
   private String name;
   private String description;
   private double price;
//   private int quantity = 1;

    public MyOrders(String name, String description, double price,String type) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //    public int getQuantity() {
//        return quantity;
//    }
}
