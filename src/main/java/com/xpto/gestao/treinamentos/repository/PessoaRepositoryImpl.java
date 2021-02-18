package com.xpto.gestao.treinamentos.repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xpto.gestao.treinamentos.entity.Pessoa;

@Repository
public class PessoaRepositoryImpl {

	@Autowired
	private EntityManager entityManager;

	public Pessoa find(String nomePessoa) {

		String sql = "select distinct p.nome,p.id from pessoa p \n" + "join salaevento s  on s.idpessoa = p.id \n"
				+ "join espacocafe e on e.idpessoa = p.id \n" + "where p.nome like :nomePessoa";

		TypedQuery<Pessoa> typedQuery = (TypedQuery<Pessoa>) entityManager.createNativeQuery(sql, Pessoa.class);
		typedQuery.setParameter("nomePessoa", nomePessoa);
		Pessoa pessoa = typedQuery.getSingleResult();


		return pessoa;
	}

}
