import java.util.ArrayList;

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
}
