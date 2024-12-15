import java.util.ArrayList;
import java.util.Scanner;

public class OrderManager {
    private ArrayList<Order> orders;
    private int nextOrderId;

    public OrderManager() {
        this.orders = new ArrayList<>();
        this.nextOrderId = 1;
    }

    //method tp place an order
    public void placeOrder(MenuManager menuManager, Scanner scanner) {
        Order order = new Order(nextOrderId++);
        boolean addingItems = true;

        while (addingItems) {
            menuManager.displayMenu();
            System.out.print("Enter the food item ID to add your order" +
                    "(Enter 0 to finish): ");
            int id = scanner.nextInt();

            if (id == 0) {
                addingItems = false;
            }
            else {
                FoodItem item = menuManager.getFoodItemById(id);

                if (item != null) {
                    order.addItem(item);
                    System.out.println(item.getName() + " added to your order.");
                }
                else {
                    System.out.println("Invalid food item ID.");
                }
            }
        }

        orders.add(order);
        System.out.println("\nOrder placed successfully.");
        System.out.println(order);
    }
}
