package com.xpto.gestao.treinamentos.entity.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class PessoaEspecificaDTO implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -6058926450927788767L;

	private Long id;
	
	private String nome;
	
	private List<SalaDTO> salas = new ArrayList<>();
	
	private List<EspacoCafeDTO> espacosCafes = new ArrayList<>();

}
