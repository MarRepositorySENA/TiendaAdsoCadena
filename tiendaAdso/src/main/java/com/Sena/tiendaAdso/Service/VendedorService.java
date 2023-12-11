package com.Sena.tiendaAdso.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sena.tiendaAdso.Interface.IVendedor;
import com.Sena.tiendaAdso.InterfaceService.IVendedorService;
import com.Sena.tiendaAdso.Model.Vendedor;


@Service
public class VendedorService implements IVendedorService {

	@Autowired
	private IVendedor data;
	@Override
	public String save(Vendedor Vendedor) {
		data.save(Vendedor);
		return Vendedor.getIdVendedor();
	}

	@Override
	public List<Vendedor> findAll() {
		List<Vendedor> listaVendedor= (List<Vendedor>) data.findAll();
		return listaVendedor;
	}

	@Override
	public Optional<Vendedor> findOne(String idvendedor) {
		Optional<Vendedor> Vendedor= data.findById(idvendedor);
		return Vendedor;
	}

	@Override
	public int delete(String idvendedor) {
		data.deleteById(idvendedor);
		return 1;
		
		
	}
}

	

