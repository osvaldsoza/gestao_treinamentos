package com.xpto.gestao.treinamentos.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xpto.gestao.treinamentos.entity.EspacoCafe;
import com.xpto.gestao.treinamentos.entity.Pessoa;

@Repository
public class EspacoCafeRepositoryImpl {

	@Autowired
	private EntityManager entityManager;

	public List<EspacoCafe> listaEspacoCafeByIdPessoa(Pessoa pessoa) {

		String sqlCafe = "select e.id,e.nome,e.lotacao from espacocafe e\n" + "join pessoa p on e.idpessoa = p.id \n"
				+ "where p.id = :pessoaId";

		TypedQuery<EspacoCafe> typedQueryCafe = (TypedQuery<EspacoCafe>) entityManager.createNativeQuery(sqlCafe,
				EspacoCafe.class);
		typedQueryCafe.setParameter("pessoaId", pessoa.getId());
		
		List<EspacoCafe> espacos = typedQueryCafe.getResultList();

		return espacos;
	}

}
