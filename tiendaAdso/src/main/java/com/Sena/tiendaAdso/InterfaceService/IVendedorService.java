package com.Sena.tiendaAdso.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.Sena.tiendaAdso.Model.Vendedor;

public interface IVendedorService {
	/*
	 * Definir los metodos del CRUD Create
	 * 
	 */

	public String save(Vendedor vendedor);

	public List<Vendedor> findAll();

	public Optional<Vendedor> findOne(String idVendedor);

	public int delete(String idVendedor);
}
