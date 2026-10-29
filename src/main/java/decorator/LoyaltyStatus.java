
package decorator;

public class LoyaltyStatus {

    public enum Status {
        REGULAR,
        SILVER,
        GOLD
    }

    private Status status;

    public LoyaltyStatus(Status status) {
        this.status = status;
    }

    public double applyDiscount(double total) {
        switch (status) {
            case SILVER:
                return total * 0.90;

            case GOLD:
                return total * 0.80;

            default:
                return total;
        }
    }
}
