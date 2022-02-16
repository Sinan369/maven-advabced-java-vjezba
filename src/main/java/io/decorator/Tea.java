package io.decorator;

public class Tea extends Beverage{

    Tea() {
        super("Ćaj");
    }

    @Override
    public double cost() {
        return 1.5;
    }
}
