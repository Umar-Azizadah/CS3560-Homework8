
package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BitcoinPaymentTest {

    @Test
    void testNotifyPayment() {
        NotificationChannel channel = new EmailChannel();
        BitcoinPayment payment = new BitcoinPayment(channel);

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        try {
            payment.notifyPayment();

            assertTrue(output.toString().contains("Email: Bitcoin payment confirmed!"));
        }
        finally {
            System.setOut(originalOut);
        }
    }
}
