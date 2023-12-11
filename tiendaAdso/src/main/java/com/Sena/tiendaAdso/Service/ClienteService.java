package com.Sena.tiendaAdso.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sena.tiendaAdso.Interface.ICliente;
import com.Sena.tiendaAdso.InterfaceService.IClienteService;
import com.Sena.tiendaAdso.Model.Cliente;

@Service
public class ClienteService  implements IClienteService{

	@Autowired
	private ICliente data;
	
	
	@Override
	public String save(Cliente cliente) {
		data.save(cliente);
		return cliente.getIdCliente();
		
	}

	@Override
	public List<Cliente> findAll() {
		List<Cliente> listaCliente = (List<Cliente>)  data.findAll();
		return listaCliente;
	}

	@Override
	public Optional<Cliente> findOne(String idcliente) {
		Optional <Cliente> Cliente= data.findById(idcliente);
		return Cliente;
	}

	@Override
	public int delete(String idcliente) {
		data.deleteById(idcliente);
		return 1;
	}

	
	
}
