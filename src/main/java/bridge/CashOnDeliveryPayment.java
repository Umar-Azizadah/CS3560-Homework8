package bridge;

public class CashOnDeliveryPayment extends PaymentNotification{
    public CashOnDeliveryPayment(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void notifyPayment() {

    }
}
