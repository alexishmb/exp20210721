package com.cjavaperu.cjavaspringboot.app.productos.models.daos;



import com.cjavaperu.cjavaspringboot.app.productos.models.entity.Producto;

import org.springframework.data.repository.CrudRepository;


public interface ProductoDao extends CrudRepository<Producto, Long>{

}
