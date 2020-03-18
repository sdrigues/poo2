package com.example.poo2ac1.controller;

import java.util.List;
import com.example.poo2ac1.service.ProdutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * ProdutoEmEstoque
 */
@Controller
public class ProdutosEstoque {

    @Autowired
    private ProdutoService ps;

    @GetMapping("/Estoque")
    public ModelAndView getProdutosEmEstoque() {
        ModelAndView mv = new ModelAndView("estoqueProdutoView");
        List produto = ps.getProdutosEmEstoque();
        
        mv.addObject("produto", produto);

        return mv;
    }  
    
}