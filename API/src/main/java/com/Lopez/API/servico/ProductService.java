/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Lopez.API.servico;

import com.Lopez.API.model.Product;
import com.Lopez.API.repository.ProductRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author ferranlopmun
 */
@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;
    
    public List<Product>listProduct(){
        return repository.findAll();
    }
    
    public void saveProduct (Product product){
        repository.save(product);
    }
    
    public Product obtainProductById(Integer id){
        return repository.findById(id).get();
    }
    
    public void deleteProduct (Integer id){
        repository.deleteById(id);
    }
}
