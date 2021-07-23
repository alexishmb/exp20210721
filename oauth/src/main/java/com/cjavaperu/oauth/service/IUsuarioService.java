package com.cjavaperu.oauth.service;

import com.cjavaperu.usuarioscommons.model.entity.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);

}
