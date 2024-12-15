
# Restaurant Ordering System 🍽️

The Restaurant Ordering System is a console-based Java application that allows users to view a restaurant's menu, place orders, and view current orders. It also includes an admin functionality to update the menu by adding or removing food items, protected by a password.


## Features

1. Menu Management
- View the menu with food items and their prices.
- Dynamic updates to the menu by the admin.

2. Order Management
- Place orders by selecting items from the menu.
- View current orders with details of each item and total prices.

3. Admin Features
- Admin-only access to menu updates via password authentication.
- Add new food items or remove existing ones.
## Technologies Used

- **Programming Language:** Java
- **Java Concepts:** Classes, Objects, ArrayLists, Encapsulation, Method Overloading
- **Development Tools:** IntelliJ IDEA, Eclipse, or any Java IDE


## Installation

1. Clone the repository to your local machine:
```bash
git clone https://github.com/nipun-munasinghe/restaurantOrderingSystem-java-backend.git
```
2. Navigate to the project directory:
```bash
cd restaurantOrderingSystem-java-backend
```
3. Compile and run files
## How to Use

1. User Role:
- **Viewing Menu:** Choose option 1 to see the available food items.
- **Placing an Order:** Choose option 2, select food items by their IDs, and confirm the order.
```bash
Welcome to the Restaurant Ordering System!

Menu:
1. View menu
2. Place an order
3. View current orders
4. Update menu (Admin Only)
5. Exit
Enter your choice: 2

Menu Items:
1. Burger - Rs.250.00
2. Pizza - Rs.1200.00
3. Noodles - Rs.750.00

Enter the food item ID to add your order (Enter 0 to finish): 1
Burger added to your order.
Enter the food item ID to add your order (Enter 0 to finish): 0

Order placed successfully.
Order ID: 1
Items:
- Burger: Rs.250.00
Total: Rs.250.00
```
2. Admin Role:

- **Updating Menu:** Choose option 4 and provide the admin password to access this functionality.
```bash
Enter Admin password: systemAdmin100

Admin Menu:
1. Add a food item
2. Remove a food item
Enter your choice: 1
Enter name of the food: Salad
Enter Price: 300
Food item added successfully.
```
## Admin Password
The default admin password is: *systemAdmin100*
## Classes and Responsibilities

1. **Main.java**
- Contains the main program loop and user interaction logic.
- Handles menu navigation and calls relevant methods based on user input.

2. **FoodItem.java**
- Represents individual food items with attributes like ID, name, and price.

3. **MenuManager.java**
- Manages the menu, including adding, removing, and retrieving food items.

4. **OrderManager.java**
- Manages order placement and retrieval.

5. **Order.java**
- Represents an individual order, containing order ID, list of items, and total price.
## Future Improvements

- Add a graphical user interface (GUI) using JavaFX or Swing.
- Store menu and order data in a database.
- Implement a user login system with different roles (e.g., Admin, Customer).
## Acknowledgements

- Java Documentation: [https://docs.oracle.com/javase/](https://docs.oracle.com/javase/)


## Contributing

Contributions are welcome! If you want to improve the Student Management System, feel free to fork the repository and submit a pull request.


## Contact

- Developer: Nipun Munasinghe
- LinkedIn: [Nipun Lakmal](https://www.linkedin.com/in/nipun-lakmal-b5b3652bb?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=ios_app)
- Email: nipunlakmal884@gmail.com
- GitHub: [nipun-munasinghe](https://github.com/nipun-munasinghe)
