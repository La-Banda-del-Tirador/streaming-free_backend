package com.labanda.streaming.services;

import java.util.Set;

import com.labanda.streaming.entities.Usuario;
import com.labanda.streaming.entities.UsuarioRol;



public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

    public Usuario obtenerUsuario(String username);

    public void eliminarUsuario(Long usuarioId);
}
