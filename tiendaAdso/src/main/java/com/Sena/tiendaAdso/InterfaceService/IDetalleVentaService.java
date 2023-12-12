package com.Sena.tiendaAdso.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.Sena.tiendaAdso.Model.DetalleVenta;



public interface IDetalleVentaService {

	/*
	 * Definir los metodos del CRUD
	 * Create
	 * 
	 */
	
	public String save (DetalleVenta detalleVenta);
	public List <DetalleVenta> findAll();
	public Optional <DetalleVenta> findOne(String id);
	public int delete (String id);
}
