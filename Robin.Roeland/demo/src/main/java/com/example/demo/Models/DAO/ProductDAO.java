package com.example.demo.Models.DAO;

import com.example.demo.Models.entities.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductDAO extends CrudRepository<Product, Integer> {

    List<Product> findAllByName (String name);
    @Query("SELECT e FROM Product e WHERE e.name = :name")
    List<Product> findByNameButWithQuery(String name);
    Iterable<Product> findByNameContains(String input);

}