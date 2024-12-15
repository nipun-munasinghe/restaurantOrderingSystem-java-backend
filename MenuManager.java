import java.util.ArrayList;
import java.util.Scanner;

public class MenuManager {
    private ArrayList<FoodItem> menu;

    public MenuManager() {
        this.menu = new ArrayList<>();
    }

    // method to add a food item
    public void addFoodItem(FoodItem item) {
        menu.add(item);
    }

    //method to display menu
    public void displayMenu() {
        if(menu.isEmpty()) {
            System.out.println("\nThe menu is currently empty.\n");
        }
        else {
            System.out.println("\nMenu Items:");

            //for-each loop to read all objects in menu array
            for (FoodItem item : menu) {
                System.out.println(item);
            }
        }
    }

    public FoodItem getFoodItemById(int id) {
        for(FoodItem item : menu) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    //method to update the menu
    public void updateMenu(Scanner scanner) {
        System.out.print("\nAdmin Menu:\n" +
                "1. Add a food item\n" +
                "2. Remove a food item\n" +
                "Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch(choice) {
            case 1:
                System.out.print("Enter name of the food: ");
                String name = scanner.nextLine();
                System.out.print("Enter Price: ");
                double price = scanner.nextDouble();
                int newId = menu.size()+1;
                menu.add(new FoodItem(newId, name, price));
                System.out.println("Food item added successfully.");
                break;
            case 2:
                System.out.print("Enter food item id to remove: ");
                int id = scanner.nextInt();
                FoodItem item = getFoodItemById(id);

                //check item
                if(item != null) {
                    menu.remove(item);
                    System.out.println("Food item removed successfully.");
                }
                else {
                    System.out.println("Item not found.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
