package com.xpto.gestao.treinamentos.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xpto.gestao.treinamentos.entity.Pessoa;
import com.xpto.gestao.treinamentos.entity.dto.SalaDTO;
import com.xpto.gestao.treinamentos.repository.SalaRepository;
import com.xpto.gestao.treinamentos.repository.SalaRepositoryImpl;

@Service
public class SalaService {

	@Autowired
	private SalaRepository salaRepository;

	@Autowired
	private SalaRepositoryImpl salaRepositoryImpl;

	@Autowired
	private ModelMapper modelMapper;

	public List<SalaDTO> lista() {

		List<SalaDTO> lista = salaRepository.findAll().stream().map(entity -> modelMapper.map(entity, SalaDTO.class))
				.collect(Collectors.toList());

		return lista;
	}

	public List<SalaDTO> listaSalaByIdPessoa(Pessoa pessoa) {
		List<SalaDTO> lista = salaRepositoryImpl.listaSalaByIdPessoa(pessoa).stream()
				.map(entity -> modelMapper.map(entity, SalaDTO.class)).collect(Collectors.toList());

		return lista;
	}

}
