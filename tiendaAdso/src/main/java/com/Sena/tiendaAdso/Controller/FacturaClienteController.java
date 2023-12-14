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

import com.Sena.tiendaAdso.InterfaceService.IFacturaClienteService;
import com.Sena.tiendaAdso.Model.FacturaCliente;

@RequestMapping("/api/v1/facturas/clientes")
@RestController
@CrossOrigin
public class FacturaClienteController {

	@Autowired
	private IFacturaClienteService facturaClienteService;

	@PostMapping("/")
	public ResponseEntity<Object> save(@ModelAttribute("FacturaCliente") FacturaCliente facturaCliente) {
		facturaClienteService.save(facturaCliente);
		return new ResponseEntity<>(facturaCliente, HttpStatus.OK);
	}

	@GetMapping("/")
	public ResponseEntity<Object> findAll() {
		var ListaFacturaClientes = facturaClienteService.findAll();
		return new ResponseEntity<>(ListaFacturaClientes, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object> findOne(@PathVariable String id) {
		var facturaCliente = facturaClienteService.findOne(id);
		return new ResponseEntity<>(facturaCliente, HttpStatus.OK);
	}

	@PutMapping("/{id}")

	public ResponseEntity<Object> update(@PathVariable String id,
			@ModelAttribute("FacturaCliente") FacturaCliente facturaClienteUpdate) {

		var facturaCliente = facturaClienteService.findOne(id).get();

		if (facturaCliente != null) {

			facturaCliente.setIdFacturaCliente(facturaClienteUpdate.getIdFacturaCliente());
			facturaCliente.setCliente(facturaClienteUpdate.getCliente());
			facturaCliente.setVendedor(facturaClienteUpdate.getVendedor());
			facturaCliente.setDetalleVenta(facturaClienteUpdate.getDetalleVenta());

			facturaClienteService.save(facturaCliente);

			return new ResponseEntity<>(facturaCliente, HttpStatus.OK);

		}

		else {

			return new ResponseEntity<>("Error cliente no encontrado", HttpStatus.BAD_REQUEST);

		}

	}

	@DeleteMapping("/{id}")

	public ResponseEntity<Object> delete(@PathVariable String id) {

		facturaClienteService.delete(id);

		return new ResponseEntity<>("Registro Eliminado", HttpStatus.OK);

	}

}
