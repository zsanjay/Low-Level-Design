package org.sanjay.lld.design.patternsV2.creational.builder;

public class BuilderDemo {

    public static void main(String[] args) {
        Employee employee = new Employee.EmployeeBuilder("Sanjay", 30, "1234567890")
                .setAddress("Dubai").setEmail("sanjayofficial94@gmail.com").build();
        System.out.println(employee);
    }
}
