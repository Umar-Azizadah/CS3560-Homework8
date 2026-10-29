package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ToppingDecoratorTest {

    @Test
    void testCheeseCost() {
        FoodItem burger = new Burger();
        FoodItem cheeseBurger = new CheeseDecorator(burger);

        double cost = cheeseBurger.getCost();

        assertEquals(6.00, cost, 0.001);
    }

    @Test
    void testKetchupCost() {
        FoodItem fries = new Fries();
        FoodItem ketchupFries = new KetchupDecorator(fries);

        double cost = ketchupFries.getCost();

        assertEquals(3.25, cost, 0.001);
    }

    @Test
    void testOnionCost() {
        FoodItem hotdog = new HotDog();
        FoodItem onionHotdog = new OnionDecorator(hotdog);

        double cost = onionHotdog.getCost();

        assertEquals(4.50, cost, 0.001);
    }

    @Test
    void testMultipleToppings() {
        FoodItem burger = new Burger();

        burger = new CheeseDecorator(burger);
        burger = new OnionDecorator(burger);
        burger = new KetchupDecorator(burger);

        double cost = burger.getCost();

        assertEquals(6.75, cost, 0.001);
    }
}
