package com.example.ac1poo2.repository;

import java.util.Collection;
import java.util.HashMap;

import com.example.ac1poo2.model.Product;

import org.springframework.stereotype.Repository;

/**
 * ProdutoRepository
 */
@Repository
public class ProdutoRepository {
    public HashMap<Integer, Product> prod = new HashMap<Integer, Product>();
    
    public ProdutoRepository(){
        prod.put(1, new Product(1, "MotoOne", 1234, 3));
        prod.put(2, new Product(2, "Macbook Pro", 12034, 5));
        prod.put(3, new Product(3, "S20", 12345, 3));
        prod.put(4, new Product(4, "Mi 10", 1234, 3));
        prod.put(5, new Product(5, "g7", 1234, 3));
        prod.put(6, new Product(6, "lixp", 1234, 3));
        prod.put(7, new Product(7, "ericson", 1234, 3));
        prod.put(8, new Product(8, "hadhat", 1234, 3));
        prod.put(9, new Product(9, "lindo", 1234, 3));
        prod.put(10, new Product(10, "g60", 1234, 3));
    }

    public Product getProdutoById(Integer id){
        return prod.get(id);
    }
    public Collection<Product> getProdutoById(){
        return prod.values();
    }
}
