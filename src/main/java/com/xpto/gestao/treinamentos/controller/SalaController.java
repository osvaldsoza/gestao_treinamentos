package com.xpto.gestao.treinamentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xpto.gestao.treinamentos.entity.dto.PessoaEspecificaDTO;
import com.xpto.gestao.treinamentos.service.PessoaService;

@Controller
@RequestMapping("sala")
public class SalaController {
	
	@Autowired
	private PessoaService salaServeice;
	
	@GetMapping("/lista")
	public ModelAndView lista() {
		PessoaEspecificaDTO lista = salaServeice.retornaPessoa("Beltrano");
		ModelAndView md = new ModelAndView("lista-salas");
		md.addObject("salas", lista);
		return md;
	}

}
