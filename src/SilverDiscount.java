public class SilverDiscount implements Subscription {
    @Override
    public double calculate(double amount) {
        return amount * 0.10; // 10% discount for silver members
    }
}
