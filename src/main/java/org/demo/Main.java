package org.demo;


public class Main {
    public static void main(String[] args) {
      Object employee = new Object();
      EmployeeDAOProxy employeeDAOProxy = new EmployeeDAOProxy(new EmpoyeeDAOImpl());
      try {
          employeeDAOProxy.create("admin", employee);
          employeeDAOProxy.get("admin", employee);
          employeeDAOProxy.delete("admin", employee);
          employeeDAOProxy.delete("general", employee);
          employeeDAOProxy.create("general", employee);
      }
      catch(Exception e){
          System.out.println(e.getMessage());
      }
    }
}