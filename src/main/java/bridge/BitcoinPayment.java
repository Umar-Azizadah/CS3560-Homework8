package bridge;

public class BitcoinPayment extends PaymentNotification {
    public BitcoinPayment(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void notifyPayment() {
        channel.send("Bitcoin payment confirmed!");
    }
}
