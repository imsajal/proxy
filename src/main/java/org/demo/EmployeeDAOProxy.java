package org.demo;

public class EmployeeDAOProxy implements EmplyeeDAO{

    private EmpoyeeDAOImpl empoyeeDAO;

    public EmployeeDAOProxy(EmpoyeeDAOImpl empoyeeDAO) {
        this.empoyeeDAO = empoyeeDAO;
    }

    @Override
    public void create(String user, Object obj) {
        if(user == "admin"){
            empoyeeDAO.create(user, obj);
        }
        else throw new RuntimeException("not authorized to create");
    }

    @Override
    public void delete(String user, Object obj) {
        if(user == "admin"){
            empoyeeDAO.delete(user, obj);
        }
        else throw new RuntimeException("not authorized to delete");
    }

    @Override
    public void get(String user, Object obj) {
        if(user == "general" || user == "admin"){
            empoyeeDAO.get(user, obj);
        }
        else throw new RuntimeException("not authorized to read");
    }
}
