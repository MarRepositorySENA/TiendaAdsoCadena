package com.Sena.tiendaAdso.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.Sena.tiendaAdso.Model.DetalleCompra;



public interface IDetalleCompraService {

	/*
	 * Definir los metodos del CRUD
	 * Create
	 * 
	 */
	public String save (DetalleCompra detalleCompra);
	public List <DetalleCompra> findAll();
	public Optional <DetalleCompra> findOne(String id);
	public int delete (String id);
}
