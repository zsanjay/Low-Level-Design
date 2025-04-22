package org.sanjay.lld.design.patterns.structural.decorator;

import org.sanjay.lld.design.patterns.structural.decorator.pizza.BasePizza;
import org.sanjay.lld.design.patterns.structural.decorator.pizza.Farmhouse;
import org.sanjay.lld.design.patterns.structural.decorator.pizza.Margherita;
import org.sanjay.lld.design.patterns.structural.decorator.topping.ExtraCheese;
import org.sanjay.lld.design.patterns.structural.decorator.topping.Mushroom;

public class Order {

    public static void main(String[] args) {

        BasePizza order1 = new ExtraCheese(new Farmhouse());
        System.out.println("Order amount for Farmhouse with extra cheese = " + order1.cost());

        BasePizza order2 = new Mushroom(new ExtraCheese(new Margherita()));
        System.out.println("Order amount for Margherita with extra cheese and mushroom = " + order2.cost());
    }
}
