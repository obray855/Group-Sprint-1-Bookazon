public class PlatinumDiscount implements Subscription {
    @Override
    public double calculate(double amount) {
        return amount * 0.20; // 20% discount for platinum members
    }
}
