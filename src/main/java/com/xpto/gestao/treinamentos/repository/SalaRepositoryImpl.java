package com.xpto.gestao.treinamentos.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xpto.gestao.treinamentos.entity.Pessoa;
import com.xpto.gestao.treinamentos.entity.Sala;

@Repository
public class SalaRepositoryImpl {

	@Autowired
	private EntityManager entityManager;

	public List<Sala> listaSalaByIdPessoa(Pessoa pessoa) {

		
		
		String sqlSala = "select s.id,s.nome,s.lotacao from salaevento s\n" + 
				"join pessoa p  on s.idpessoa = p.id \n" + 
				"where p.id = :pessoaId" ;
		
		TypedQuery<Sala> typedQuerySala = (TypedQuery<Sala>) entityManager.createNativeQuery(sqlSala, Sala.class);
		typedQuerySala.setParameter("pessoaId",  pessoa.getId());
		List<Sala> salas = typedQuerySala.getResultList();


		return salas;
	}

}
