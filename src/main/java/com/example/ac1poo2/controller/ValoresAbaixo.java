package com.example.ac1poo2.controller;

import java.util.List;

import com.example.ac1poo2.service.ProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

/**
 * ProdutoValorAbaixo
 */
@Controller
public class ValoresAbaixo {

    @Autowired
    private ProdutoService ps;

    @GetMapping("/valorAbaixo/{valor}")
    public ModelAndView getProdutosByValorAbaixo(
        @PathVariable("valor") int valor
    ){
        ModelAndView mv = new ModelAndView("estoqueProdutoView");
        List produto = ps.getProdutosByValorAbaixo(valor);

        if(produto.size() == 0){
            mv.setViewName("valorProdutoView");
            return mv;
        }
        
        mv.addObject("produto", produto);

        return mv;
    }
    
}