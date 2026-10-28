package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SmsChannelTest {
    @Test
    void testSend() {
        SmsChannel sms = new SmsChannel();

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        try {
            sms.send("Payment successful!");
            assertTrue(output.toString().contains("SMS: Payment successful!"));
        }
        finally {
            System.setOut(originalOut);
        }
    }
}
