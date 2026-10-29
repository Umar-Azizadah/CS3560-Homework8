package bridge;

public class BridgeDriver {
    public static void main(String[] args) {

        // Scenario 1: Online Payment with Email
        NotificationChannel email = new EmailChannel();
        PaymentNotification onlineEmail = new OnlinePaymentNotification(email);
        onlineEmail.notifyPayment();

        // Scenario 2: Online Payment with SMS
        NotificationChannel sms = new SmsChannel();
        PaymentNotification onlineSms = new OnlinePaymentNotification(sms);
        onlineSms.notifyPayment();

        // Scenario 3: Cash Payment with Email
        PaymentNotification cashEmail = new CashOnDeliveryPayment(email);
        cashEmail.notifyPayment();

        // Scenario 4: SMS Payment with Email
        PaymentNotification cashSms = new CashOnDeliveryPayment(sms);
        cashSms.notifyPayment();
    }
}
