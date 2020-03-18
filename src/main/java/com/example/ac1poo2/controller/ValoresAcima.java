package com.example.poo2ac1.controller;

import java.util.List;

import com.example.poo2ac1.service.ProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

/**
 * ProdutoValorAcima
 */

 @Controller
public class ValoresAcima {

    @Autowired
    private ProdutoService ps;

    @GetMapping("/valorAcima/{valor}")
    public ModelAndView getProdutosByValorAcima(
        @PathVariable("valor") int valor
    ){
        ModelAndView mv = new ModelAndView("estoqueProdutoView");
        List produto = ps.getProdutosByValorAcima(valor);

        if(produto.size() == 0){
            mv.setViewName("valorProdutoView");
            return mv;
        }
        
        mv.addObject("produto", produto);

        return mv;
    }
}