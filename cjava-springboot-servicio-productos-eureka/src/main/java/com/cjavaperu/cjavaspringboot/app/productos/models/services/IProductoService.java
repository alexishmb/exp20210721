package com.cjavaperu.cjavaspringboot.app.productos.models.services;

import java.util.List;

import com.cjavaperu.cjavaspringboot.app.productos.models.entity.Producto;



public interface IProductoService {

	public List<Producto> findAll();
	public Producto findById(Long id);
}
