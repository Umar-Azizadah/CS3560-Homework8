package decorator;

public class OnionDecorator extends ToppingDecorator {

    public OnionDecorator(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getCost() {
        return foodItem.getCost() + 0.50;
    }
}
