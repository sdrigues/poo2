package com.example.ac1poo2.service;


import java.util.List;
import java.util.ArrayList;
import com.example.ac1poo2.model.Produto;
import com.example.ac1poo2.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ProdutoService
 */
@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository pr;

    public Produto getProduto(int id)
    {
        Produto produto = pr.getProdutoById(id);

        if(produto==null)
        {
            produto = null;
        }

        return produto;
    }    

    public List getProdutosEmEstoque(){
        List produto = pr.getProdutos();
        List<Produto> prod = new ArrayList<Produto>();
        Produto produtos = new Produto();

        for(int i = 1; i <= produto.size(); i++){
            produtos = pr.getProdutoById(i);
            if(produtos.getEstoque() > 0){
                prod.add(produtos);
            }
        }
        return prod;
    }

    public List getProdutosByValorAcima(double valor){
        List produto = pr.getProdutos();
        List<Produto> prod = new ArrayList<Produto>();
        Produto produtos = new Produto();

        for(int i = 1; i <= produto.size(); i++){
            produtos = pr.getProdutoById(i);
            if(produtos.getValor() > valor){
                prod.add(produtos);
            }
        }
        return prod;
    }

    public List getProdutosByValorAbaixo(double valor){
        List produto = pr.getProdutos();
        List<Produto> prod = new ArrayList<Produto>();
        Produto produtos = new Produto();

        for(int i = 1; i <= produto.size(); i++){
            produtos = pr.getProdutoById(i);
            if(produtos.getValor() < valor){
                prod.add(produtos);
            }
        }
        return prod;
    }
    
}