package com.jsp;

import javax.persistence.*;
import java.util.List;

public class DriverGetAll {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Jazz");

        EntityManager entityManager=entityManagerFactory.createEntityManager();

        Query query=entityManager.createQuery("Select A from Admin A");

        List<Admin> admins=query.getResultList();

        for(Admin admin:admins)
        {
            System.out.println(admin.getId()+" "+admin.getName());

            Library library=admin.getLibrary();

            System.out.println(library.getId()+" "+library.getName()+" "+library.getAddress());

              List<Books> books= library.getBooks();

              for(Books books1:books)
              {
                  System.out.println(books1.getId()+" "+books1.getName()+" "+books1.getObjective());

              }


        }


    }
}
