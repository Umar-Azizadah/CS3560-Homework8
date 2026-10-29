
package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class BridgeDriverTest {

    @Test
    void testMain() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        try {
            BridgeDriver.main(new String[0]);

            String result = output.toString();

            assertTrue(result.contains("Email: Online payment successful!"));
            assertTrue(result.contains("SMS: Online payment successful!"));
            assertTrue(result.contains("Email: Please pay when your order arrives."));
            assertTrue(result.contains("SMS: Please pay when your order arrives."));
            assertTrue(result.contains("Email: Bitcoin payment confirmed!"));
            assertTrue(result.contains("SMS: Bitcoin payment confirmed!"));

        } finally {
            System.setOut(originalOut);
        }
    }
}
