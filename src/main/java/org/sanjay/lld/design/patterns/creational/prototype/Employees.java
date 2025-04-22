package org.sanjay.lld.design.patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{
    private List<String> empList;

    public Employees() {
        empList = new ArrayList<>();
    }

    public Employees(List<String> employees) {
        this.empList = employees;
    }

    public void loadData() {
        empList.add("Sanjay");
        empList.add("Harry");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>(this.getEmpList());
        return new Employees(temp);
    }
}
