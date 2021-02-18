package com.xpto.gestao.treinamentos.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xpto.gestao.treinamentos.entity.Pessoa;
import com.xpto.gestao.treinamentos.entity.dto.EspacoCafeDTO;
import com.xpto.gestao.treinamentos.entity.dto.PessoaEspecificaDTO;
import com.xpto.gestao.treinamentos.entity.dto.SalaDTO;
import com.xpto.gestao.treinamentos.repository.PessoaRepositoryImpl;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepositoryImpl pessoaRepositoryImpl;
	
	@Autowired
	private SalaService salaService;
	
	@Autowired
	private EspacoCafeService espacoCafeService;
	
	
	@Autowired
	private ModelMapper modelMapper;
	
	public PessoaEspecificaDTO retornaPessoa(String nomePessoa) {
		
		PessoaEspecificaDTO pessoaEspecificaDTO = new PessoaEspecificaDTO();
		
		Pessoa pessoa = pessoaRepositoryImpl.find(nomePessoa);
		pessoaEspecificaDTO.setId(pessoa.getId());
		pessoaEspecificaDTO.setNome(pessoa.getNome());
		//pessoaEspecificaDTO = (PessoaEspecificaDTO) modelMapper.createTypeMap(pessoa, PessoaEspecificaDTO.class);
		
		List<SalaDTO> salas = salaService.listaSalaByIdPessoa(pessoa);
		for (SalaDTO sala : salas) {
			pessoaEspecificaDTO.getSalas().add(sala);
		}
		
		List<EspacoCafeDTO> espacosCafes = espacoCafeService.listaEspacoCafeByIdPessoa(pessoa);
		for (EspacoCafeDTO espacoCafe : espacosCafes) {
			pessoaEspecificaDTO.getEspacosCafes().add(espacoCafe);
		}
		
		return pessoaEspecificaDTO;
		
	}
}

