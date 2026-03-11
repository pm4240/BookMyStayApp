import java.util.HashMap;
import java.util.Map;

class RoomInventory {

    // HashMap to store room type and available count
    private Map<String, Integer> inventory;

    // Constructor to initialize inventory
    public RoomInventory() {
        inventory = new HashMap<>();

        // Register room types with initial availability
        inventory.put("Standard", 10);
        inventory.put("Deluxe", 5);
        inventory.put("Suite", 2);
    }

    // Method to get availability of a specific room type
    public int getAvailability(String roomType) {
        return inventory.getOrDefault(roomType, 0);
    }

    // Method to update room availability
    public void updateAvailability(String roomType, int newCount) {
        inventory.put(roomType, newCount);
    }

    // Method to display current inventory state
    public void displayInventory() {
        System.out.println("Current Room Inventory:");

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

public class BookMyStayApp {

    public static void main(String[] args) {

        // System initializes the inventory component
        RoomInventory inventory = new RoomInventory();

        // Display current inventory
        inventory.displayInventory();

        // Retrieve availability
        System.out.println("\nAvailable Deluxe Rooms: " +
                inventory.getAvailability("Deluxe"));

        // Update availability
        inventory.updateAvailability("Deluxe", 3);

        // Display updated inventory
        System.out.println("\nInventory After Update:");
        inventory.displayInventory();
    }
}