import java.util.ArrayList;

public class Order {
    private int orderId;
    private ArrayList<FoodItem> items;
    private double totalPrice;

    public Order(int orderId) {
        this.orderId = orderId;
        this.items = new ArrayList<>();
        this.totalPrice = 0.00;
    }

    public void addItem(FoodItem item) {
        items.add(item);
        totalPrice += item.getPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        StringBuilder orderDetails = new StringBuilder("Order ID: " + orderId +
                "\nItems:\n");
        for (FoodItem item : items) {
            orderDetails.append("- ").append(item.getName())
                    .append(": Rs.").append(String.format("%.2f", item.getPrice()))
                    .append("\n");
        }
        orderDetails.append("Total: Rs.").append(String.format("%.2f", totalPrice));

        return orderDetails.toString();
    }
}
