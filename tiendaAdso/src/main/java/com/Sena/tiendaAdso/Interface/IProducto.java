package com.Sena.tiendaAdso.Interface;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Sena.tiendaAdso.Model.Producto;

@Repository
public interface IProducto extends CrudRepository<Producto, String>{

}
