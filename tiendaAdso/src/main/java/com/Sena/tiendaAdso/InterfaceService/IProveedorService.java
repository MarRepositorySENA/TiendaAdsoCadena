package com.Sena.tiendaAdso.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.Sena.tiendaAdso.Model.Proveedor;

public interface IProveedorService {

	/*
	 * Definir los metodos del CRUD Create
	 * 
	 */

	public String save(Proveedor proveedor);

	public List<Proveedor> findAll();

	public Optional<Proveedor> findOne(String id);

	public int delete(String id);
}
