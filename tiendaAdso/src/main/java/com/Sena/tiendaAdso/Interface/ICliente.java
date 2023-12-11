package com.Sena.tiendaAdso.Interface;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Sena.tiendaAdso.Model.Cliente;





@Repository
public interface ICliente extends CrudRepository<Cliente, String> {
	
	/*
	 * Incluye las funciones basicas del CRUD	
	 */

}
