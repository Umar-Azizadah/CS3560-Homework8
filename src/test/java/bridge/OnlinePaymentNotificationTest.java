package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class OnlinePaymentNotificationTest {

    @Test
    void testNotifyPayment() {
        NotificationChannel channel = new EmailChannel();
        OnlinePaymentNotification payment = new OnlinePaymentNotification(channel);

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        try {
            payment.notifyPayment();

            assertTrue(output.toString().contains("Email: Online payment successful!"));
        }
        finally {
            System.setOut(originalOut);
        }
    }
}
