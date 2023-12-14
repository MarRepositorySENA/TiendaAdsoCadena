package com.Sena.tiendaAdso.InterfaceService;

import java.util.List;
import java.util.Optional;

import com.Sena.tiendaAdso.Model.Venta;

public interface IVentaService {
	/*
	 * Definir los metodos del CRUD Create
	 * 
	 */

	public String save(Venta Venta);

	public List<Venta> findAll();

	public Optional<Venta> findOne(String id);

	public int delete(String id);

}
