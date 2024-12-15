import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MenuManager menuManager = new MenuManager();
        OrderManager orderManager = new OrderManager();
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        //predefined menu items

        System.out.println("Welcome to the Restaurant Ordering System!");

        while (run) {
            System.out.print("Menu:\n" +
                    "1. View Menu\n" +
                    "2. Place an order\n" +
                    "3. View current orders\n" +
                    "4. Update menu (Admin Only)\n" +
                    "5. Exit\n" +
                    "Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
        }
    }
}