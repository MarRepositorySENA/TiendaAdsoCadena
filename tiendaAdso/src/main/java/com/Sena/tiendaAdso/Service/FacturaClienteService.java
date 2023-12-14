package com.Sena.tiendaAdso.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sena.tiendaAdso.Interface.IFacturaCliente;
import com.Sena.tiendaAdso.InterfaceService.IFacturaClienteService;
import com.Sena.tiendaAdso.Model.FacturaCliente;

@Service
public class FacturaClienteService implements IFacturaClienteService {

	@Autowired
	private IFacturaCliente data;

	@Override
	public String save(FacturaCliente facturaCliente) {
		data.save(facturaCliente);
		return facturaCliente.getIdFacturaCliente();
	}

	@Override
	public List<FacturaCliente> findAll() {
		List<FacturaCliente> listaFacturaCliente = (List<FacturaCliente>) data.findAll();
		return listaFacturaCliente;
	}

	@Override
	public Optional<FacturaCliente> findOne(String idFacturaCliente) {
		Optional<FacturaCliente> FacturaCliente = data.findById(idFacturaCliente);
		return FacturaCliente;
	}

	@Override
	public int delete(String idFacturaCliente) {
		data.deleteById(idFacturaCliente);
		return 1;
	}

}
