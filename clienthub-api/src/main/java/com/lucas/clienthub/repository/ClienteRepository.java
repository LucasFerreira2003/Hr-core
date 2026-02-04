package com.lucas.clienthub.repository;

import com.fasterxml.jackson.annotation.JacksonAnnotation;
import com.lucas.clienthub.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Cliente, Long> {


}
