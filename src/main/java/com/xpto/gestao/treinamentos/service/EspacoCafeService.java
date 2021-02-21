package com.xpto.gestao.treinamentos.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xpto.gestao.treinamentos.entity.Pessoa;
import com.xpto.gestao.treinamentos.entity.dto.EspacoCafeDTO;
import com.xpto.gestao.treinamentos.repository.EspacoCafeRepositoryImpl;

@Service
public class EspacoCafeService {
	
	@Autowired
	private EspacoCafeRepositoryImpl espacoCafeRepositoryImpl;
	
	@Autowired
	private ModelMapper modelMapper;
	
//	public List<EspacoCafeDTO> listaEspacoCafeByIdPessoa(Pessoa pessoa) {
//		List<EspacoCafeDTO> lista = espacoCafeRepositoryImpl.listaEspacoCafeByIdPessoa(pessoa).stream()
//				.map(entity -> modelMapper.map(entity, EspacoCafeDTO.class)).collect(Collectors.toList());
//
//		return lista;
//	}

}
