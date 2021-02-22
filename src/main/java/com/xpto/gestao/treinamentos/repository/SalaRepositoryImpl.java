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

		StringBuilder sqlSala = new StringBuilder();
		sqlSala.append("select s.nome from pessoa p ").append("join pessoa_salaevento ps on ps.pessoa_id = p.id ")
				.append("join salaevento s on s.id = ps.salaevento_id ").append("where p.nome = :pessoaId");

		TypedQuery<Sala> typedQuerySala = (TypedQuery<Sala>) entityManager.createNativeQuery(sqlSala.toString(),
				Sala.class);
		typedQuerySala.setParameter("pessoaId", pessoa.getId());
		List<Sala> salas = typedQuerySala.getResultList();

		return salas;
	}

}
