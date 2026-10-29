package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {

    @Test
    void testEmptyOrder() {
        Order order = new Order();

        double total = order.getTotalCost();

        assertEquals(0.00, total, 0.001);
    }

    @Test
    void testAddItemAndTotalCost() {
        Order order = new Order();
        FoodItem burger = new Burger();
        FoodItem fries = new Fries();

        order.addItem(burger);
        order.addItem(fries);

        assertEquals(8.00, order.getTotalCost(), 0.001);
    }

    @Test
    void testOrderWithToppings() {
        Order order = new Order();
        FoodItem burger = new CheeseDecorator(new Burger());
        FoodItem hotdog = new OnionDecorator(new HotDog());

        order.addItem(burger);
        order.addItem(hotdog);

        assertEquals(10.50, order.getTotalCost(), 0.001);
    }
}
