package com.Sena.tiendaAdso.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.Sena.tiendaAdso.Model.Producto;



public interface IProductoService {

	/*
	 * Definir los metodos del CRUD
	 * Create
	 * 
	 */
	
	public String save (Producto producto);
	public List <Producto> findAll();
	public Optional <Producto> findOne(String id);
	public int delete (String id);
}
