package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DriverGetById {

    public static void main(String[] args) {


        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Jazz");

        EntityManager entityManager=entityManagerFactory.createEntityManager();

        Admin admin=entityManager.find(Admin.class,1);

        System.out.println(admin.getId()+" "+admin.getName());

    }
}
