package com.redis.Crud_Redis.controller;

import com.redis.Crud_Redis.entity.Product;
import com.redis.Crud_Redis.repository.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class ProductController
{
    @Autowired
    ProductDao myproduct;

    @PostMapping("/product")
    public Product save(@RequestBody Product product){
        return myproduct.save(product);
    }

    @GetMapping("/allproduts")
    public List<Product> allProducts(){
        return myproduct.findAll();
    }
    @GetMapping("byid/{id}")
    public Product findProduct(@PathVariable int id){
        return myproduct.findProductById(id);
    }

    @DeleteMapping("delete/{id}")
    public  String remove(@PathVariable int id){
        return myproduct.deleteProduct(id);
    }
}
