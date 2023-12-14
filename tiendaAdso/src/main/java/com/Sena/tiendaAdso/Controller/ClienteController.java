package com.Sena.tiendaAdso.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sena.tiendaAdso.InterfaceService.IClienteService;
import com.Sena.tiendaAdso.Model.Cliente;

@RequestMapping("/api/v1/clientes")
@RestController
@CrossOrigin
//Anotacion: permite utilizar la configuration de cors
public class ClienteController {

	@Autowired
	private IClienteService ClienteService;
	/*
	 * 
	 */

	// permite ingresar datos
	@PostMapping("/")
	public ResponseEntity<Object> save(@ModelAttribute("Cliente") Cliente cliente) {
		ClienteService.save(cliente);
		return new ResponseEntity<>(cliente, HttpStatus.OK);
	}

	@GetMapping("/")
	public ResponseEntity<Object> findAll() {
		var ListaClientes = ClienteService.findAll();
		return new ResponseEntity<>(ListaClientes, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object> findOne(@PathVariable String id) {
		var cliente = ClienteService.findOne(id);
		return new ResponseEntity<>(cliente, HttpStatus.OK);
	}

	@PutMapping("/{id}")

	public ResponseEntity<Object> update(@PathVariable String id,
			@ModelAttribute("Cliente") Cliente clienteUpdate) {

		var cliente = ClienteService.findOne(id).get();

		if (cliente != null) {

			cliente.setIdCliente(clienteUpdate.getIdCliente());

			cliente.setTipoDocumento(clienteUpdate.getTipoDocumento());

			cliente.setTipoDocumento(clienteUpdate.getTipoDocumento());

			cliente.setPrimerNombre(clienteUpdate.getPrimerNombre());

			cliente.setSegundoNombre(clienteUpdate.getSegundoNombre());

			cliente.setPrimerApellido(clienteUpdate.getPrimerApellido());

			cliente.setSegundoApellido(clienteUpdate.getSegundoApellido());

			cliente.setGenero(clienteUpdate.getGenero());

			cliente.setFechaNacimiento(clienteUpdate.getFechaNacimiento());

			cliente.setTelefono(clienteUpdate.getTelefono());

			cliente.setCorreo(clienteUpdate.getCorreo());

			cliente.setDireccion(clienteUpdate.getDireccion());

			ClienteService.save(cliente);

			return new ResponseEntity<>(cliente, HttpStatus.OK);

		}

		else {

			return new ResponseEntity<>("Error cliente no encontrado", HttpStatus.BAD_REQUEST);

		}

	}

	@DeleteMapping("/{id}")

	public ResponseEntity<Object> delete(@PathVariable String id) {

		ClienteService.delete(id);

		return new ResponseEntity<>("Registro Eliminado", HttpStatus.OK);

	}

}
