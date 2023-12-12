package com.Sena.tiendaAdso.Interface;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Sena.tiendaAdso.Model.DetalleCompra;

@Repository
public interface IDetalleCompra extends CrudRepository<DetalleCompra, String>  {

	/*
	 * Incluye las funciones basicas del CRUD	
	 */
}
