package com.Sena.tiendaAdso.Interface;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Sena.tiendaAdso.Model.Proveedor;

@Repository
public interface IProveedor extends CrudRepository<Proveedor, String> {

}
