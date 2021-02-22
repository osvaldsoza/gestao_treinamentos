package com.xpto.gestao.treinamentos.entity.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.xpto.gestao.treinamentos.entity.EspacoCafe;
import com.xpto.gestao.treinamentos.entity.Sala;

import lombok.Data;

@Data
public class PessoaEspecificaDTO implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -6058926450927788767L;

	private Long id;
	
	private String nome;
	
	private List<Sala> salas = new ArrayList<>();
	
	private EspacoCafe espacoCafe;


}
