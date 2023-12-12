package com.Sena.tiendaAdso.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.Sena.tiendaAdso.Model.FacturaProveedor;



public interface IFacturaProveedorService {

	/*
	 * Definir los metodos del CRUD
	 * Create
	 * 
	 */
	
	public String save (FacturaProveedor facturaProveedor);
	public List <FacturaProveedor> findAll();
	public Optional <FacturaProveedor> findOne(String id);
	public int delete (String id);
}
