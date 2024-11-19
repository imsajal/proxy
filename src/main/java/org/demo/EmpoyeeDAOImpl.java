package org.demo;

public class EmpoyeeDAOImpl implements  EmplyeeDAO{


    @Override
    public void create(String user, Object obj) {
        System.out.println("created user");
    }

    @Override
    public void delete(String user, Object obj) {
        System.out.println("deleted user");
    }

    @Override
    public void get(String user, Object obj) {
        System.out.println("user returned");
    }
}
