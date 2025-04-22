package org.sanjay.lld.design.patterns.structural.proxy;

public interface EmployeeDAO {

    public void create(String client, Employee obj) throws Exception;
    public void delete(String client, int empId) throws Exception;
    public Employee get(String client, int empId) throws Exception;
}
