package com.java.jpa.employee;




import javax.persistence.*;


import com.java.jpa.employee.*;

public class EmployeeDetail {

  public static void main(String args[])

  {

    EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee_details");

    EntityManager em=emf.createEntityManager();

    EmployeeEntity s=em.find(EmployeeEntity.class,108);

    System.out.println("Employee id = "+s.getE_id());

    System.out.println("Employee Name = "+s.getE_name());

    System.out.println("Employee Salary = "+s.getE_sal());

  }

}