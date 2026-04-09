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



import java.util.*;

// Room class (same idea as before)
class Room {
    String type;
    int beds;
    double price;

    Room(String type, int beds, double price) {
        this.type = type;
        this.beds = beds;
        this.price = price;
    }

    void display() {
        System.out.println(type + " | Beds: " + beds + " | Price: ₹" + price);
    }
}

// Inventory (read-only access)
class RoomInventory {
    private Map<String, Integer> inventory = new HashMap<>();

    public void addRoom(String type, int count) {
        inventory.put(type, count);
    }

    public int getAvailability(String type) {
        return inventory.getOrDefault(type, 0);
    }

    public Map<String, Integer> getAllRooms() {
        return inventory;
    }
}

// Search Service
class SearchService {

    public void searchAvailableRooms(RoomInventory inventory, List<Room> rooms) {

        System.out.println("\n---- Available Rooms ----");

        for (Room room : rooms) {
            int available = inventory.getAvailability(room.type);

            if (available > 0) {
                room.display();
                System.out.println("Available: " + available);
                System.out.println("------------------------");
            }
        }
    }
}

// Main class
public class BookMyStayApp1 {

    public static void main(String[] args) {

        System.out.println("Book My Stay App - Version 4.0");

        // Inventory setup
        RoomInventory inventory = new RoomInventory();
        inventory.addRoom("Single Room", 5);
        inventory.addRoom("Double Room", 0); // unavailable
        inventory.addRoom("Suite Room", 2);

        // Room details
        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room("Single Room", 1, 2000));
        rooms.add(new Room("Double Room", 2, 3500));
        rooms.add(new Room("Suite Room", 3, 6000));

        // Search
        SearchService service = new SearchService();
        service.searchAvailableRooms(inventory, rooms);
    }
}