package io.decorator;

public class MilkDecorator extends Beverage{

    private Beverage beverage;

    MilkDecorator(Beverage beverage) {
        super(beverage.getName() + " s mlijekom");
        this.beverage=beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }
}
