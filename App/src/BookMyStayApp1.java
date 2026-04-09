/**
 * Hotel Booking Management System
 * Use Case 1: Application Entry & Welcome Message
 *
 * This class serves as the entry point for the application.
 * It demonstrates how a Java program starts execution and
 * prints output to the console.
 *
 * @author Hansika
 * @version 1.0
 */



import java.util.HashMap;
import java.util.Map;

/**
 * Hotel Booking System
 * Use Case 3: Centralized Inventory using HashMap
 *
 * @version 3.0
 */

// Inventory Class
class RoomInventory {

    private Map<String, Integer> inventory;

    // Constructor
    public RoomInventory() {
        inventory = new HashMap<>();
    }

    // Add room type
    public void addRoom(String type, int count) {
        inventory.put(type, count);
    }

    // Get availability
    public int getAvailability(String type) {
        return inventory.getOrDefault(type, 0);
    }

    // Update availability
    public void updateAvailability(String type, int newCount) {
        if (inventory.containsKey(type)) {
            inventory.put(type, newCount);
        } else {
            System.out.println("Room type not found!");
        }
    }

    // Display all rooms
    public void displayInventory() {
        System.out.println("\n---- Room Inventory ----");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

// Main Class
public class BookMyStayApp1 {

    public static void main(String[] args) {

        System.out.println("Book My Stay App - Version 3.0");

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Add rooms
        inventory.addRoom("Single Room", 5);
        inventory.addRoom("Double Room", 3);
        inventory.addRoom("Suite Room", 2);

        // Display inventory
        inventory.displayInventory();

        // Update availability
        inventory.updateAvailability("Single Room", 4);

        // Display updated inventory
        inventory.displayInventory();
    }
}