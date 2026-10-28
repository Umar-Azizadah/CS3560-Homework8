package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class EmailChannelTest {

    @Test
    void testSend() {
        EmailChannel email = new EmailChannel();

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        try {
            email.send("Payment successful!");
            assertTrue(output.toString().contains("Email: Payment successful!"));
        }
        finally {
            System.setOut(originalOut);
        }

    }

}
