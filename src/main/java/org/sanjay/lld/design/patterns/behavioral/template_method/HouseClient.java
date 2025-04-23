package org.sanjay.lld.design.patterns.behavioral.template_method;

public class HouseClient {

    public static void main(String[] args) {
        HouseTemplate houseType = new WoodenHouse();

        // using template method
        houseType.buildHouse();
        System.out.println("**********");

        houseType = new GlassHouse();
        houseType.buildHouse();
    }
}
