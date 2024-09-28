public class PlatinumDiscount implements Subscription {
    @Override
    public double calculate(double amount) {
        return amount * 0.10; // 10% discount for platinum members
    }
}
