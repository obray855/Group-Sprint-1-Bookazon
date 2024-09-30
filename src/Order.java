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
    private User orderUser;

    public Order(Cart cart, User orderUser) {
        this.items = cart.getItems();
        this.shippingAddress = new Address();
        this.billingAddress = new Address();
        this.orderUser = orderUser;
        this.orderPrice = calculatePrice();
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

    public double calculatePrice() {
        // make sure that .orderUser subscription reference is used in update
        double totalPrice = 0.0;

        for (CartItem item : items) {
            totalPrice += item.getTotalPrice();
        }

        Subscription sub = orderUser.getSubscription();
        
        totalPrice -= sub.calculate(totalPrice);

        return totalPrice;
    }
}
