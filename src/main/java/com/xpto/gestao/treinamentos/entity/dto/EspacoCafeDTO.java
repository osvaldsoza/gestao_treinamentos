package com.xpto.gestao.treinamentos.entity.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class EspacoCafeDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 819597377746027842L;

	private Long id;
	
	private String nome;
	
	private Integer lotacao;

}
