package org.sanjay.lld.design.patterns.structural.decorator.topping;

import org.sanjay.lld.design.patterns.structural.decorator.pizza.BasePizza;

public class ExtraCheese extends ToppingDecorator {
    private BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }
}
