package com.Sena.tiendaAdso.Interface;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Sena.tiendaAdso.Model.FacturaCliente;

@Repository
public interface IFacturaCliente extends CrudRepository<FacturaCliente, String> {

}
