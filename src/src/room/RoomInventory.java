package room;

/**
 * ================================================================
 * CLASS - RoomInventory
 * ================================================================
 *
 * Centralized inventory manager for room availability.
 *
 * Uses a HashMap to store and manage room counts.
 *
 * @version 3.0
 */
import java.util.HashMap;
import java.util.Map;

public class RoomInventory {

    // Single source of truth for availability
    private Map<String, Integer> inventory;

    /**
     * Initializes room availability using constructor.
     */
    public RoomInventory() {
        inventory = new HashMap<>();

        // Register initial room availability
        inventory.put("Single", 10);
        inventory.put("Double", 5);
        inventory.put("Suite", 2);
    }

    /**
     * Retrieves availability for a given room type.
     *
     * @param roomType type of room (e.g., Single, Double, Suite)
     * @return available count
     */
    public int getAvailability(String roomType) {
        return inventory.getOrDefault(roomType, 0);
    }

    /**
     * Updates availability for a given room type.
     *
     * @param roomType type of room
     * @param newCount updated availability
     */
    public void updateAvailability(String roomType, int newCount) {
        if (newCount < 0) {
            System.out.println("Invalid update. Availability cannot be negative.");
            return;
        }
        inventory.put(roomType, newCount);
    }

    /**
     * Decreases availability when a room is booked.
     *
     * @param roomType type of room
     */
    public void bookRoom(String roomType) {
        int current = getAvailability(roomType);

        if (current > 0) {
            inventory.put(roomType, current - 1);
            System.out.println(roomType + " room booked successfully.");
        } else {
            System.out.println("No " + roomType + " rooms available.");
        }
    }

    /**
     * Displays full inventory state.
     */
    public void displayInventory() {
        System.out.println("=== ROOM INVENTORY ===");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + " Rooms Available: " + entry.getValue());
        }
    }
}