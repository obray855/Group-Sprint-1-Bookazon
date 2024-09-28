public class PrimeDiscount implements Subscription {
    @Override
    public double calculate(double amount) {
        return amount * 0.15; // 15% discount for prime members
    }
}
