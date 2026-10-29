package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FoodItemTest {

    @Test
    void testBurgerCost() {
        FoodItem burger = new Burger();

        double cost = burger.getCost();

        assertEquals(5.00, cost, 0.001);
    }

    @Test
    void testFriesCost() {
        FoodItem fries = new Fries();

        double cost = fries.getCost();

        assertEquals(3.00, cost, 0.001);
    }

    @Test
    void testHotDogCost() {
        FoodItem hotdog = new HotDog();

        double cost = hotdog.getCost();

        assertEquals(4.00, cost, 0.001);
    }
}
