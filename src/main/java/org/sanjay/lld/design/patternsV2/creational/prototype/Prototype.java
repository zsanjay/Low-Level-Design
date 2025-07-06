package org.sanjay.lld.design.patternsV2.creational.prototype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Prototype implements Cloneable {
    public List<String> empList = null;
    public Prototype() {
        empList = new ArrayList<>();
    }
    public Prototype(List<String> empList) {
        this.empList = empList;
    }
    public void loadData() {
        empList.add("Sanjay");
        empList.add("Harry");
    }
    public List<String> getEmpList() {
        return empList;
    }

    public Prototype clone() throws CloneNotSupportedException {
        return new Prototype(new ArrayList<>(this.empList));
    }
}

