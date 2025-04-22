package org.sanjay.lld.design.patterns.structural.decorator.topping;

import org.sanjay.lld.design.patterns.structural.decorator.pizza.BasePizza;

public class Mushroom extends ToppingDecorator {
    private BasePizza basePizza;
    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 15;
    }
}
