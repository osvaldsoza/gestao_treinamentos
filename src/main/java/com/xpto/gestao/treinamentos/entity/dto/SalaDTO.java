package com.xpto.gestao.treinamentos.entity.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class SalaDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6151160270352451523L;

	private Long id;
	
	private String nome;
	
	private Integer lotacao;

}
