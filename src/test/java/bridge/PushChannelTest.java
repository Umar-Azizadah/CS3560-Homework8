package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class PushChannelTest {

    @Test
    void testSend() {
        PushChannel push = new PushChannel();

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        try {
            push.send("Payment successful!");

            assertTrue(output.toString().contains("Push: Payment successful!"));
        } finally {
            System.setOut(originalOut);
        }
    }
}
