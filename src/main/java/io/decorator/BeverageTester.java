package io.decorator;

public class BeverageTester {
    public static void main(String[] args) {
        Beverage pice = new Tea();
        pice.printBeverage();
        MilkDecorator milkDecorator = new MilkDecorator(pice);
        milkDecorator.printBeverage();
    }
}
