public class NormalDiscount implements Subscription {
    @Override
    public double calculate(double amount) {
        return amount * 0.05; // 5% discount for Normal members
    }
}
