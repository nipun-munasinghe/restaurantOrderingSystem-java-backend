import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MenuManager menuManager = new MenuManager();
        OrderManager orderManager = new OrderManager();
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        //predefined menu items
        menuManager.addFoodItem(new FoodItem(1, "Burger", 250));
        menuManager.addFoodItem(new FoodItem(2, "Pizza", 1200));
        menuManager.addFoodItem(new FoodItem(3, "Noodles", 750));
        menuManager.addFoodItem(new FoodItem(4, "Coca-cola", 280));
        menuManager.addFoodItem(new FoodItem(5, "Coffee", 60));

        //Admin password
        final String ADMIN_PASSWORD = "systemAdmin100";

        System.out.println("Welcome to the Restaurant Ordering System!");

        while (run) {
            System.out.print("\nMenu:\n" +
                    "1. View menu\n" +
                    "2. Place an order\n" +
                    "3. View current orders\n" +
                    "4. Update menu (Admin Only)\n" +
                    "5. Exit\n" +
                    "Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 1:
                    menuManager.displayMenu();
                    break;
                case 2:
                    orderManager.placeOrder(menuManager, scanner);
                    break;
                case 3:
                    orderManager.viewOrders();
                    break;
                case 4:
                    System.out.print("Enter Admin password: ");
                    String enteredPwd = scanner.nextLine();
                    //Check password
                    if(enteredPwd.equals(ADMIN_PASSWORD)) {
                        menuManager.updateMenu(scanner);
                    }
                    else {
                        System.out.println("Incorrect Password. Action denied.");
                    }
                    break;
            }
        }
    }
}