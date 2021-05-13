package business.entities;

public class CarportItem {
    private int quantity;
    private int  length;
private String description;
    private String info;

    public CarportItem(int quantity, int length, String discription, String info) {
        this.quantity = quantity;
        this.length = length;
        this.description = discription;
        this.info = info;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
