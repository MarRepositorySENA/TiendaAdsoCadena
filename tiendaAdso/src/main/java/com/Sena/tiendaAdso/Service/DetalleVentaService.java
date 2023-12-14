package com.Sena.tiendaAdso.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sena.tiendaAdso.Interface.IDetalleVenta;
import com.Sena.tiendaAdso.InterfaceService.IDetalleVentaService;
import com.Sena.tiendaAdso.Model.DetalleVenta;

@Service
public class DetalleVentaService implements IDetalleVentaService {

	@Autowired
	private IDetalleVenta data;

	@Override
	public String save(DetalleVenta detalleVenta) {
		data.save(detalleVenta);
		return detalleVenta.getIdDetalleVenta();
	}

	@Override
	public List<DetalleVenta> findAll() {
		List<DetalleVenta> listaDetalleVenta = (List<DetalleVenta>) data.findAll();
		return listaDetalleVenta;
	}

	@Override
	public Optional<DetalleVenta> findOne(String idDetalleVenta) {
		Optional<DetalleVenta> DetalleVenta = data.findById(idDetalleVenta);
		return DetalleVenta;
	}

	@Override
	public int delete(String idDetalleVenta) {
		data.deleteById(idDetalleVenta);
		return 1;

	}

}
