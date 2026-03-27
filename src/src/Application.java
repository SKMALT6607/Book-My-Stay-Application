/**
 * @author Sri Koushik JK
 * @version 0.0.1
 * */

import room.*;

/**
 * ================================================================
 * MAIN CLASS - UseCase3RoomInventory
 * ================================================================
 *
 * Demonstrates centralized inventory management using HashMap.
 *
 * @version 3.0
 */

 void main(String[] args) {

        // Initialize inventory (Single Source of Truth)
        RoomInventory inventory = new RoomInventory();

        // Create room objects (Domain Model)
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        // Display room details + availability
        System.out.println("=== SINGLE ROOM ===");
        singleRoom.displayRoomDetails();
        System.out.println("Available: " + inventory.getAvailability("Single"));

        System.out.println("\n=== DOUBLE ROOM ===");
        doubleRoom.displayRoomDetails();
        System.out.println("Available: " + inventory.getAvailability("Double"));

        System.out.println("\n=== SUITE ROOM ===");
        suiteRoom.displayRoomDetails();
        System.out.println("Available: " + inventory.getAvailability("Suite"));

        // Demonstrate booking (controlled update)
        System.out.println("\n--- Booking a Double Room ---");
        inventory.bookRoom("Double");

        // Display updated inventory
        System.out.println();
        inventory.displayInventory();
    }
