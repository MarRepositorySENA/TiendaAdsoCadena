package com.Sena.tiendaAdso.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sena.tiendaAdso.Interface.IVenta;
import com.Sena.tiendaAdso.InterfaceService.IVentaService;
import com.Sena.tiendaAdso.Model.Venta;

@Service
public class VentaService implements IVentaService {

	@Autowired
	private IVenta data;

	@Override
	public String save(Venta Venta) {
		data.save(Venta);
		return Venta.getIdVenta();
	}

	@Override
	public List<Venta> findAll() {
		List<Venta> listaVenta = (List<Venta>) data.findAll();
		return listaVenta;
	}

	@Override
	public Optional<Venta> findOne(String idventa) {
		Optional<Venta> Venta = data.findById(idventa);
		return Venta;
	}

	@Override
	public int delete(String idventa) {
		data.deleteById(idventa);
		return 1;
	}

}
