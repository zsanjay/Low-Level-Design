package org.sanjay.lld.design.patterns.structural.proxy;

public class EmployeeDAOImpl implements EmployeeDAO {
    @Override
    public void create(String client, Employee obj) throws Exception {
        System.out.println("Created new row in the Employee table");
    }

    @Override
    public void delete(String client, int empId) throws Exception {
        System.out.println("Deleted row in the Employee table with Id =" + empId);
    }

    @Override
    public Employee get(String client, int empId) throws Exception {
        System.out.println("fetching data from the DB");
        return new Employee();
    }
}
