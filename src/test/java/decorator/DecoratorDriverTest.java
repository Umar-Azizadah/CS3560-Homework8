
package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DecoratorDriverTest {

    @Test
    void testMain() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(output));

        try {
            DecoratorDriver.main(new String[0]);

            String result = output.toString();

            assertTrue(result.contains("Burger with Cheese and Onions: $6.5"));
            assertTrue(result.contains("Fries with Ketchup: $3.25"));
            assertTrue(result.contains("HotDog with Cheese: $5.0"));
            assertTrue(result.contains("Total: $14.75"));
            assertTrue(result.contains("Total after loyalty discount: $11.80"));

        } finally {
            System.setOut(originalOut);
        }
    }
}
