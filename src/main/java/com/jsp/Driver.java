package com.jsp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Jazz");

        EntityManager entityManager=entityManagerFactory.createEntityManager();

        EntityTransaction entityTransaction=entityManager.getTransaction();

        Admin a1=new Admin();

        Library l1=new Library();

        Books b1=new Books();

        Books b2=new Books();

        Books b3=new Books();

        Books b4=new Books();

        Author u1=new Author();

        Author u2=new Author();

        Publisher p1=new Publisher();

        a1.setName("Ramu");

        l1.setName("Washington");
        l1.setAddress("Kolkata");

        b1.setName("Half Girlfriend");
        b1.setObjective("Romance");

        b2.setName("2 States");
        b2.setObjective("Romance");

        b3.setName("Fantastic Beast");
        b3.setObjective("Thriller");

        b4.setName("Harry Potter");
        b4.setObjective("Magics");


        List<Books> booksList1=new ArrayList<>();
        booksList1.add(b1);
        booksList1.add(b2);
        booksList1.add(b3);
        booksList1.add(b4);


        u1.setName("Chetan");
        u2.setName("JK Rowling");

        List<Author> authorList1=new ArrayList<>();
        authorList1.add(u1);
        List<Author> authorList2=new ArrayList<>();
        authorList2.add(u2);

        p1.setBrand("Simon Publisher");

         //OneToOneRelationship
         a1.setLibrary(l1);

         //OneToManyRelationship
         l1.setBooks(booksList1);

         //ManyToManyRelationship
         b1.setAuthor(authorList1);
         b2.setAuthor(authorList1);

         b3.setAuthor(authorList2);
         b4.setAuthor(authorList2);

         //ManyToOneRelationship
         u1.setPublisher(p1);
         u2.setPublisher(p1);

         entityTransaction.begin();

         //Saving
         entityManager.persist(u1);
         entityManager.persist(u2);
         entityManager.persist(b1);
         entityManager.persist(b2);
         entityManager.persist(b3);
         entityManager.persist(b4);
         entityManager.persist(l1);
         entityManager.persist(a1);

         entityTransaction.commit();




    }
}