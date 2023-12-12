package com.Sena.tiendaAdso.Interface;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Sena.tiendaAdso.Model.Venta;

@Repository
public interface IVenta extends CrudRepository<Venta, String> {

}
