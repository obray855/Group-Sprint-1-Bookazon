import java.util.ArrayList;

public class Cart {
    private ArrayList<CartItem> items;
    
    public Cart() {
        items = new ArrayList<>();
    }
    
    public void addItem(CartItem item) {
        items.add(item);
    }

    public void removeItem(CartItem item) {
        items.remove(item);
    }
    
    public CartItem findItem(CartItem item){
        for (CartItem cartItem : items){
            if (cartItem.equals(item)){
                return item;
                }
            }
            return null;
        }   

    public void updateQuantity(CartItem item, int quantity) {
        CartItem cartItem = findItem(item);
        cartItem.setQuantity(quantity);        
    }
    
    public void viewCartDetails() {
        System.out.println("Cart Details:");
        for (CartItem item : items) {
            System.out.println(item.getName() + " - Quantity: " + item.getQuantity());
        }
        System.out.println("\n");
    }
    
    public ArrayList<CartItem> getItems() {
        return items;
    }
}
