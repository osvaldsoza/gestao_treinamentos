package com.xpto.gestao.treinamentos.repository;

import java.util.List;

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
	

	public List<Pessoa> findPessoasBySalaOrEspaco(String filtro) {

		StringBuilder sql = new StringBuilder();
		sql.append("select distinct p.nome,p.id from pessoa p ");

		TypedQuery<Pessoa> typedQuery = (TypedQuery<Pessoa>) entityManager.createNativeQuery(sql.toString(), Pessoa.class);
		typedQuery.setParameter("filtro", filtro);

		List<Pessoa> pessoas = typedQuery.getResultList();
//
//		select distinct p.nome,p.id from pessoa p 
//		join pessoa_salaevento ps on ps.pessoa_id = p.id 
//		join salaevento s on s.id = ps.salaevento_id
//		join pessoa_espacocafe pe on pe.pessoa_id = p.id 
//		join espacocafe e on e.id = pe.espacocafe_id
//		where s.nome = 'Avengers' or e.nome = 'Avengers'

		return pessoas;
	}

}
