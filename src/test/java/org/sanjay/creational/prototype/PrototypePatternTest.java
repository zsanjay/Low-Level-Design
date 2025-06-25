package org.sanjay.creational.prototype;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.sanjay.lld.design.patterns.creational.prototype.Employees;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class PrototypePatternTest {
    private Employees employees;

    @BeforeEach
    void setUp() {
        employees = new Employees();
        employees.loadData();
    }

    @Test
    public void prototypePatternTest() {

        Employees employees1 = null;
        Employees employees2 = null;

        try {
            employees1 = (Employees) employees.clone();
            employees2 = (Employees) employees.clone();
        }
         catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        List<String> list =  employees1.getEmpList();
        list.add("John");

        List<String> list1 =  employees2.getEmpList();
        list1.add("Pankaj");

        assertNotEquals(list , list1);
    }
}
