package com.beginner.systemdesign.decorator.pizza;

public class ExtraCheese extends ToppingDecorator{
    private BasePizza basePizza;
    public ExtraCheese(BasePizza basePizza)
    {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 100;
    }
}
