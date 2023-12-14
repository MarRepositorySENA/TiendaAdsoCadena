package com.Sena.tiendaAdso.Interface;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Sena.tiendaAdso.Model.Vendedor;

@Repository
public interface IVendedor extends CrudRepository<Vendedor, String> {
	/*
	 * Incluye las funciones basicas del CRUD
	 */

}
