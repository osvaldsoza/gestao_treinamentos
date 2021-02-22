package com.xpto.gestao.treinamentos;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.xpto.gestao.treinamentos.entity.EspacoCafe;
import com.xpto.gestao.treinamentos.entity.Pessoa;
import com.xpto.gestao.treinamentos.entity.Sala;
import com.xpto.gestao.treinamentos.repository.PessoaRepository;

@SpringBootTest
public class PessoaSalaTest {
	
	@Autowired
 private PessoaRepository repository;
	@Test
	public void save() {
		List<Sala> salas = new ArrayList<>();
		
		Sala sala = new Sala();
		sala.setId(1L);
		
		salas.add(sala);
		
		Sala sala1 = new Sala();
		sala1.setId(2L);
		
		salas.add(sala1);
		
		
		EspacoCafe cafe = new EspacoCafe();
		cafe.setId(1L);

		
	Pessoa pessoa = new Pessoa();
	pessoa.setNome("Mateus");
	pessoa.setEspacocafe(cafe);
	pessoa.setSalas(salas);
	repository.save(pessoa);
 	}

}
