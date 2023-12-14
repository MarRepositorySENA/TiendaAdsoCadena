package com.Sena.tiendaAdso.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.Sena.tiendaAdso.Model.Cliente;

public interface IClienteService {

	/*
	 * Definir los metodos del CRUD Create
	 * 
	 */

	public String save(Cliente cliente);

	public List<Cliente> findAll();

	public Optional<Cliente> findOne(String id);

	public int delete(String id);

}
