/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Lopez.API.repository;

import com.Lopez.API.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ferranlopmun
 */
public interface ProductRepository extends JpaRepository <Product, Integer> {
    
}
