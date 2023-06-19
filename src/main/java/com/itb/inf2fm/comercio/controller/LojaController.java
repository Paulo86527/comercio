package com.itb.inf2fm.comercio.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itb.inf2fm.comercio.model.Produto;

@Controller
@RequestMapping("/comercio/produtos")


public class LojaController {

	List<Produto> listaDeProduto = new ArrayList<Produto>();
	
	@GetMapping("/listar")
	public String listarProdutos() {
		
		 
		    Produto p1 = new Produto();
			p1.setId(20l);
			p1.setNome("maquina de lavar Brastemp 151");
			p1.setCodigoBarras("145JIFFJDUDE212456");
			p1.setDescricao("Produto Linha branca com painle digital");
			p1.setPreco(3215.89);
			
		    
		    
	
		    
			Produto p2 = new Produto();
			p2.setId(20l);
			p2.setNome("TELEVISOR 70");
			p2.setCodigoBarras("TLE651R65T1J5YT1");
			p2.setDescricao("Televisor Tela Plana Samsung");
			p2.setPreco(6523.25);
			
			
			Produto p3 = new Produto();
				p3.setId(20l);
				p3.setNome(" pc gamer ");
				p3.setCodigoBarras("KSJDA15PC16514ASA1SAarq");
				p3.setDescricao(" pc completo ssd 120hz 1tbRAM 10tbROM Memory ");
				p3.setPreco(15523.25);
				
				
				listaDeProduto.add(p1);
				
				
				return "produtos";
			
			
	}

	}

