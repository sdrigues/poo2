package com.example.ac1poo2.services;

import com.example.ac1poo2.model.Product;
import com.example.ac1poo2.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ProductService
 */
@Service
public class ProductService {
    @Autowired
    private ProdutoRepository pr;

    public Product getProduto(Integer id){
        Product prod = pr.getProdutoById(id);
    if(id == null){
        alert("alguma coisa");    
    } 
        return prod;
    }
    
}