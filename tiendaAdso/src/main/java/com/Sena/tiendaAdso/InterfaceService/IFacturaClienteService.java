package com.Sena.tiendaAdso.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.Sena.tiendaAdso.Model.FacturaCliente;

public interface IFacturaClienteService {

	/*
	 * Definir los metodos del CRUD Create
	 * 
	 */

	public String save(FacturaCliente facturaCliente);

	public List<FacturaCliente> findAll();

	public Optional<FacturaCliente> findOne(String id);

	public int delete(String id);
}
