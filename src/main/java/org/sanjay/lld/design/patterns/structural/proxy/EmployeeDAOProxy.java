package org.sanjay.lld.design.patterns.structural.proxy;

public class EmployeeDAOProxy implements EmployeeDAO {

    private EmployeeDAOImpl employeeDAO;

    public EmployeeDAOProxy() {
        this.employeeDAO = new EmployeeDAOImpl();
    }
    @Override
    public void create(String client, Employee obj) throws Exception {
        if(client.equals("ADMIN")) {
            employeeDAO.create(client, obj);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public void delete(String client, int empId) throws Exception {
        if(client.equals("ADMIN")) {
            employeeDAO.delete(client, empId);
            return;
        }
        throw new Exception("Access Denied");
    }

    @Override
    public Employee get(String client, int empId) throws Exception {
        if(client.equals("ADMIN") || client.equals("USER")) {
            return employeeDAO.get(client, empId);
        }
        throw new Exception("Access Denied");
    }
}
