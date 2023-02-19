package com.beginner.systemdesign.decorator;

import com.beginner.systemdesign.decorator.pizza.BasePizza;
import com.beginner.systemdesign.decorator.pizza.ExtraCheese;
import com.beginner.systemdesign.decorator.pizza.Mushroom;
import com.beginner.systemdesign.decorator.pizza.VegDelight;

public class Decorator {
    public static void main(String[] args)
    {
        Mushroom pizza = new Mushroom(new ExtraCheese(new VegDelight()));
        System.out.println(pizza.cost());
    }
}
