package com.example.demo.Models.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //map on table in databank
public class Product {

    @Id //primary key in table
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name, categorie, omschrijving, email, username;
    private double price;

    public Product(){
    }

    public Product(String name, String categorie, String omschrijving, String email, String username, double price) {
        this.name = name;
        this.categorie = categorie;
        this.omschrijving = omschrijving;
        this.email = email;
        this.username = username;
        this.price = price;
    }

    public Product(int id, String name, String categorie, String omschrijving, String email, String username, double price) {
        this.id = id;
        this.name = name;
        this.categorie = categorie;
        this.omschrijving = omschrijving;
        this.email = email;
        this.username = username;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}