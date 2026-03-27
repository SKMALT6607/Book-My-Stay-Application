package room;

public class Room {
    String roomType;
    double price;
    String amenities;

    public Room(String roomType, double price, String amenities) {
        this.roomType = roomType;
        this.price = price;
        this.amenities = amenities;
    }

    public Room() {

    }

    public String getRoomType() {
        return roomType;
    }

    public double getPrice() {
        return price;
    }

    public String getAmenities() {
        return amenities;
    }

    @Override
    public String toString() {
        return "Room Type: " + roomType +
                ", Price: " + price +
                ", Amenities: " + amenities;
    }
}