package decorator;

public class KetchupDecorator extends ToppingDecorator {

    public KetchupDecorator(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    public double getCost() {
        return foodItem.getCost() + 0.25;
    }
}
