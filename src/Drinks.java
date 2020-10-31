public class Drinks {

    private String name;
    private String description;
    private double price;
    private int quantity;

    public Drinks() {
    }

    public Drinks(String name, String description, double price, int quantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
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

    public int getQuantity() {
        return quantity;
    }



    @Override
    public String toString() {
        return "Drinks{" +
                "name: '" + name + '\'' +
                ", description: '" + description + '\'' +
                ", price: " + price +
                ", quantity: " + quantity +
                '}';
    }
}
