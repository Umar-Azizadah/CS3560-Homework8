package bridge;

public class OnlinePaymentNotification extends PaymentNotification {

    public OnlinePaymentNotification(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void notifyPayment() {
        channel.send("Online payment successful!");
    }
}
