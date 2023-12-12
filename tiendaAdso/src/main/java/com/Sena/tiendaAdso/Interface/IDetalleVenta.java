package com.Sena.tiendaAdso.Interface;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Sena.tiendaAdso.Model.DetalleVenta;

@Repository
public interface IDetalleVenta extends CrudRepository<DetalleVenta, String>{

	
	
}
