public class GoldDiscount implements Subscription {
    @Override
    public double calculate(double amount) {
        return amount * 0.15; // 15% discount for gold members
    }
}
