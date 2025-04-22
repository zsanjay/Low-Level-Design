package org.sanjay.lld.design.patterns.structural.decorator.pizza;

import org.sanjay.lld.design.patterns.structural.decorator.pizza.BasePizza;

public class VegDelight extends BasePizza {
    @Override
    public int cost() {
        return 120;
    }
}
