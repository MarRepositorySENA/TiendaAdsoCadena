package com.Sena.tiendaAdso.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sena.tiendaAdso.Interface.IProveedor;
import com.Sena.tiendaAdso.InterfaceService.IProveedorService;
import com.Sena.tiendaAdso.Model.Proveedor;

@Service
public class ProveedorService implements IProveedorService {

	@Autowired
	private IProveedor data;

	@Override
	public String save(Proveedor proveedor) {
		data.save(proveedor);
		return proveedor.getIdProveedor();
	}

	@Override
	public List<Proveedor> findAll() {
		List<Proveedor> listaProveedor = (List<Proveedor>) data.findAll();
		return listaProveedor;
	}

	@Override
	public Optional<Proveedor> findOne(String idProveedor) {
		Optional<Proveedor> Proveedor = data.findById(idProveedor);
		return Proveedor;
	}

	@Override
	public int delete(String idProveedor) {
		data.deleteById(idProveedor);
		return 1;
	}

}
