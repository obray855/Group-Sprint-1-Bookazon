import java.util.ArrayList;

public class Order {
    private String dateCreated;
    private String dateShipped;
    private String userName;
    private boolean orderPlaced;
    private Address shippingAddress;
    private Address billingAddress;
    private ArrayList<CartItem> items;
    private double orderPrice;

    public Order(Cart cart, String subscription) {
        this.items = cart.getItems();
        this.orderPrice = calculatePrice(subscription);
        this.orderPlaced = false;
    }

    public void setShippingAddress(String line1, String line2, String city, String state, String zip, String country) {
        if (!this.orderPlaced){
            this.shippingAddress.setAddress(line1, line2, city, state, zip, country);
        }
    }

    public void setBillingAddress(String line1, String line2, String city, String state, String zip, String country) {
        if (!this.orderPlaced){
            this.billingAddress.setAddress(line1, line2, city, state, zip, country);
        }
    }

    public void setPlaced(boolean status) {
        this.orderPlaced = status;
    }

    public void setDateCreated(String date) {
        this.dateCreated = date;
    }

    public void setDateShipped(String date) {
        this.dateShipped = date;
    }

    public void setUserName(String name) {
        this.userName = name;
    }

    public void printOrderDetails() {
        System.out.println("Order Details:");
        System.out.println("Date Created: " + dateCreated);
        System.out.println("Date Shipped: " + dateShipped);
        System.out.println("User Name: " + userName);
        System.out.println("Order Placed: " + orderPlaced);
        System.out.println("Shipping Address: " + shippingAddress.printAddress());
        System.out.println("Billing Address: " + billingAddress.printAddress());
        System.out.println("Order Price: $" + orderPrice);
    }

    public double calculatePrice(String subscription) {
        double totalPrice = 0.0;

        for (CartItem item : items) {
            totalPrice += item.getTotalPrice();
        }

        if (subscription == "gold") {
            totalPrice *= 0.15; // 15% discount for prime members
        } else if (subscription == "platinum") {
            totalPrice *= 0.10; // 10% discount for platinum members
        } else if (subscription == "silver") {
            totalPrice *= 0.05; // 5% discount for silver members
        } 

        return totalPrice;
    }
}
