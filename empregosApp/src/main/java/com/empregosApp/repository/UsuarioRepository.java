package com.empregosApp.repository;

import org.springframework.data.repository.CrudRepository;

import com.empregosApp.models.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String>{
    
    Usuario findByEmail(String email); 
    
    //findByNomeDoAtributo da class
}

