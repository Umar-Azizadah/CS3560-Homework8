package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CashOnDeliveryPaymentTest {
    @Test
    void testNotifyPayment() {
        NotificationChannel channel = new EmailChannel();
        CashOnDeliveryPayment payment = new CashOnDeliveryPayment(channel);

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        try {
            payment.notifyPayment();

            assertTrue(output.toString().contains("Email: Please pay when your order arrives."));
        } finally {
            System.setOut(originalOut);
        }
    }
}
