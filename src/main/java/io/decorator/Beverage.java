package io.decorator;

public abstract class Beverage {
    private String name;

    Beverage(String name) {
        this.name = name;
    }

    public abstract double cost();

    public String getName() {
        return name;
    }

    public void printBeverage(){
        System.out.println("Ime pica je: " + name + " Cijena pica je: " + cost() + "KM");
    }
}
