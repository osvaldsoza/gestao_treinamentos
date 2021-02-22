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

		StringBuilder sqlCafe = new StringBuilder()
		       .append("select e.nome from pessoa p ")
		       .append("join pessoa_espacocafe pe on pe.pessoa_id = p.id ")
			   .append("join espacocafe e on e.id = pe.espacocafe_id ")
			   .append("where p.nome = :pessoaId");

		TypedQuery<EspacoCafe> typedQueryCafe = (TypedQuery<EspacoCafe>) entityManager.createNativeQuery(sqlCafe.toString(),
				EspacoCafe.class);
		typedQueryCafe.setParameter("pessoaId", pessoa.getId());

		List<EspacoCafe> espacos = typedQueryCafe.getResultList();

		return espacos;
	}

}
