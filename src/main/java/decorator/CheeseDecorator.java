package decorator;

public class CheeseDecorator extends ToppingDecorator {

    public CheeseDecorator(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getCost() {
        return foodItem.getCost() + 1.00;
    }
}
