package com.labanda.streaming.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.labanda.streaming.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    public Usuario findByUsername(String username);

}
