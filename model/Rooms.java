package model;

public class Rooms {
    private String id;
    private String type;
    private String capacity;
    private String modStatus;
    private String booking;
    private String price;

    public Rooms() {
    }

    public Rooms(String id, String type, String capacity, String modStatus, String booking, String price) {
        this.setId(id);
        this.setType(type);
        this.setCapacity(capacity);
        this.setModStatus(modStatus);
        this.setBooking(booking);
        this.setPrice(price);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getModStatus() {
        return modStatus;
    }

    public void setModStatus(String modStatus) {
        this.modStatus = modStatus;
    }

    public String getBooking() {
        return booking;
    }

    public void setBooking(String booking) {
        this.booking = booking;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
