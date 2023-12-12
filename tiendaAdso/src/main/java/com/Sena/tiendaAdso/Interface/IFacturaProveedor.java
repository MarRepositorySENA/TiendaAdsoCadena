package com.Sena.tiendaAdso.Interface;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Sena.tiendaAdso.Model.FacturaProveedor;

@Repository
public interface IFacturaProveedor extends CrudRepository<FacturaProveedor, String> {

}
