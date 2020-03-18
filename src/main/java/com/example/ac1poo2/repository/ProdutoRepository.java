package com.example.ac1poo2.repository;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

import com.example.ac1poo2.model.Produto;

import org.springframework.stereotype.Repository;

/**
 * ProdutoRepository
 */
@Repository
public class ProdutoRepository {

    public HashMap<Integer,Produto> prd = new HashMap<Integer,Produto>(); 


    public ProdutoRepository()
    {
        prd.put(1, new Produto(1, "Mi Band 4", 150, 20));
        prd.put(2, new Produto(2, "Apple Watch", 2000, 5));
        prd.put(3, new Produto(3, "Galaxy Watch", 1500, 10));
        prd.put(4, new Produto(4, "Xiaomi Mi 8", 2000, 5));
        prd.put(5, new Produto(5, "iPhone 11 Pro", 6000, 3));
        prd.put(6, new Produto(6, "Galaxy S10", 50000, 12));
        prd.put(7, new Produto(7, "Moto G Plus", 25000, 10));
        prd.put(8, new Produto(8, "Mi Mix Alpha", 7000, 6));
        prd.put(9, new Produto(9, "iPhone 11", 5000, 5));
        prd.put(10, new Produto(10, "Galaxy S9", 4000, 3));

    }

    public Produto getProdutoById(int id)
    {
        return prd.get(id);   
    }

    
    public List getProdutos(){
        List<Produto> listaProdutos = new ArrayList<Produto>();
        for (Integer key: prd.keySet()) {
            Produto produto = new Produto();
            produto.setCodigo(prd.get(key).getCodigo());
            produto.setEstoque(prd.get(key).getEstoque());
            produto.setNome(prd.get(key).getNome());
            produto.setValor(prd.get(key).getValor());
            listaProdutos.add(produto);
        }
        return listaProdutos;
    }


    
}