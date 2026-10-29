
package decorator;

public class DecoratorDriver {

    public static void main(String[] args) {

        // Create food items with toppings
        FoodItem burger = new Burger();
        burger = new CheeseDecorator(burger);
        burger = new OnionDecorator(burger);

        FoodItem fries = new Fries();
        fries = new KetchupDecorator(fries);

        FoodItem hotdog = new HotDog();
        hotdog = new CheeseDecorator(hotdog);

        // Create an order
        Order order = new Order();

        // Add food items to order
        order.addItem(burger);
        order.addItem(fries);
        order.addItem(hotdog);

        // Calculate total cost
        double total = order.getTotalCost();

        System.out.println("Burger with Cheese and Onions: $" + burger.getCost());
        System.out.println("Fries with Ketchup: $" + fries.getCost());
        System.out.println("HotDog with Cheese: $" + hotdog.getCost());
        System.out.println("Total: $" + total);

        // Apply loyalty discount
        LoyaltyStatus loyalty = new LoyaltyStatus(LoyaltyStatus.Status.GOLD);

        double discountedTotal = loyalty.applyDiscount(total);

        System.out.printf("Total after loyalty discount: $%.2f%n", discountedTotal);
    }
}
