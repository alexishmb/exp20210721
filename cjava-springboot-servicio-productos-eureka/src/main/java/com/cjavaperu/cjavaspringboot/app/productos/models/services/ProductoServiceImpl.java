package com.cjavaperu.cjavaspringboot.app.productos.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cjavaperu.cjavaspringboot.app.productos.models.daos.ProductoDao;
import com.cjavaperu.cjavaspringboot.app.productos.models.entity.Producto;


@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private ProductoDao productoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long id) {
		return productoDao.findById(id).orElse(null);
	}

}
