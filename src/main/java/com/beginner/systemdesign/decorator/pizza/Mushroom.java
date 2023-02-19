package com.beginner.systemdesign.decorator.pizza;

public class Mushroom extends ToppingDecorator{
    private BasePizza basePizza;
    public Mushroom(BasePizza basePizza)
    {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost() + 50;
    }
}
