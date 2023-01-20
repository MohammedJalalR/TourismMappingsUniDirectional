package com.jsp;

import javax.persistence.*;

@Entity
public class Publisher  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Pid")
    private int id;
    @Column(name = "Pbrand")
    private String Brand;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }


}

