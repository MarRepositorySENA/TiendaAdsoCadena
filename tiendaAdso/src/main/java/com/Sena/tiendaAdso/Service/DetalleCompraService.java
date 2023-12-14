package com.Sena.tiendaAdso.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sena.tiendaAdso.Interface.IDetalleCompra;
import com.Sena.tiendaAdso.InterfaceService.IDetalleCompraService;
import com.Sena.tiendaAdso.Model.DetalleCompra;

@Service
public class DetalleCompraService implements IDetalleCompraService {

	@Autowired
	private IDetalleCompra data;

	@Override
	public String save(DetalleCompra detalleCompra) {
		data.save(detalleCompra);
		return detalleCompra.getIdDetalleCompra();
	}

	@Override
	public List<DetalleCompra> findAll() {
		List<DetalleCompra> listaDetalleCompra = (List<DetalleCompra>) data.findAll();
		return listaDetalleCompra;
	}

	@Override
	public Optional<DetalleCompra> findOne(String idDetalleCompra) {
		Optional<DetalleCompra> DetalleCompra = data.findById(idDetalleCompra);
		return DetalleCompra;
	}

	@Override
	public int delete(String idDetalleCompra) {
		data.deleteById(idDetalleCompra);
		return 1;
	}

}
