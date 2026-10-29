package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoyaltyStatusTest {

    @Test
    void testRegularDiscount() {
        LoyaltyStatus loyalty = new LoyaltyStatus(LoyaltyStatus.Status.REGULAR);

        double total = loyalty.applyDiscount(100.00);

        assertEquals(100.00, total, 0.001);
    }

    @Test
    void testSilverDiscount() {
        LoyaltyStatus loyalty = new LoyaltyStatus(LoyaltyStatus.Status.SILVER);

        double total = loyalty.applyDiscount(100.00);

        assertEquals(90.00, total, 0.001);
    }

    @Test
    void testGoldDiscount() {
        LoyaltyStatus loyalty = new LoyaltyStatus(LoyaltyStatus.Status.GOLD);

        double total = loyalty.applyDiscount(100.00);

        assertEquals(80.00, total, 0.001);
    }
}
