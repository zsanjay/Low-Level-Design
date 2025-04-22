package org.sanjay.lld.design.patterns.creational.prototype;

import java.util.List;

public class PrototypePatternTest {

    public static void main(String[] args) throws CloneNotSupportedException{
        Employees employees = new Employees();
        employees.loadData();

        Employees employees1 = (Employees) employees.clone();
        Employees employees2 = (Employees) employees.clone();

        List<String> list =  employees1.getEmpList();
        list.add("John");

        List<String> list1 =  employees2.getEmpList();
        list1.add("Pankaj");

        System.out.println("Original Employees List: " + employees.getEmpList());
        System.out.println(" employees1 List: " + list);
        System.out.println(" employees2 List: " + list1);

    }
}
