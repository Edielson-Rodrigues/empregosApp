package com.empregosApp.repository;

import org.springframework.data.repository.CrudRepository;

import com.empregosApp.models.Candidato;

public interface CandidatoRepository extends CrudRepository<Candidato, String>{

    Candidato findByCpf(String cpf);
}
