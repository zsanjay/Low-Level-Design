package org.sanjay.lld.design.patterns.structural.proxy;

public class ProxyDesignPattern {

    public static void main(String[] args) {
        try {
            EmployeeDAO employeeTableObj = new EmployeeDAOProxy();
            employeeTableObj.create("ADMIN" , new Employee());
            System.out.println("Operation Successful");
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
