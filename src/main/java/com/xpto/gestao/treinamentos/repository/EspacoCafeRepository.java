package com.xpto.gestao.treinamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xpto.gestao.treinamentos.entity.EspacoCafe;

@Repository
public interface EspacoCafeRepository extends JpaRepository<EspacoCafe, Long> {

}
