package room;

public class SingleRoom extends Room {

    public SingleRoom() {
        super();
        this.roomType = "Single";
        this.price = 1000;
        this.amenities = "WiFi, TV";
    }
}