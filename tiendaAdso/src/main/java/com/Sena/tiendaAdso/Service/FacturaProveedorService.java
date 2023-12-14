package com.Sena.tiendaAdso.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sena.tiendaAdso.Interface.IFacturaProveedor;
import com.Sena.tiendaAdso.InterfaceService.IFacturaProveedorService;
import com.Sena.tiendaAdso.Model.FacturaProveedor;

@Service
public class FacturaProveedorService implements IFacturaProveedorService {

	@Autowired
	private IFacturaProveedor data;

	@Override
	public String save(FacturaProveedor facturaProveedor) {
		data.save(facturaProveedor);
		return facturaProveedor.getIdFacturaProveedor();
	}

	@Override
	public List<FacturaProveedor> findAll() {
		List<FacturaProveedor> listaFacturaProveedor = (List<FacturaProveedor>) data.findAll();
		return listaFacturaProveedor;
	}

	@Override
	public Optional<FacturaProveedor> findOne(String idFacturaProveedor) {
		Optional<FacturaProveedor> FacturaProveedor = data.findById(idFacturaProveedor);
		return FacturaProveedor;
	}

	@Override
	public int delete(String idFacturaProveedor) {
		data.deleteById(idFacturaProveedor);
		return 1;
	}

}
