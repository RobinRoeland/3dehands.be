package com.example.demo;

import com.example.demo.Models.DAO.ProductDAO;
import com.example.demo.Models.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class DemoController {

    private final ProductDAO dao;

    @Autowired
    public DemoController(ProductDAO dao) {
        this.dao = dao;
    }

    @GetMapping
    public Iterable<Product> findAll(){
        return dao.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<Product> findById(@PathVariable(value = "id") int id){
        return dao.findById(id);
    }

    @PostMapping("/name")
    public Iterable<Product> findAllByName(@RequestParam(value = "name") String name){
        return dao.findAllByName(name);
    }

    @PostMapping(value = "/search")
    public Iterable<Product> findByPartOfName(@RequestParam(value = "name") String part){
        return dao.findByNameContains(part);
    }

    @GetMapping("/add")
    public ResponseEntity addOne(@RequestParam(value = "name") String name, @RequestParam(value = "categorie") String categorie, @RequestParam(value = "omschrijving") String omschrijving, @RequestParam(value = "email") String email, @RequestParam(value = "username") String username, @RequestParam(value = "price") double price){
        Product temp = new Product(name, categorie, omschrijving, email, username, price);
        dao.save(temp);

        return new ResponseEntity(HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity deleteOne(@RequestParam int id){

        if(dao.existsById(id)){
            dao.deleteById(id);
            return new ResponseEntity(HttpStatus.OK);
        }else{
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }


}