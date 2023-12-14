package com.Sena.tiendaAdso.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sena.tiendaAdso.InterfaceService.IVendedorService;
import com.Sena.tiendaAdso.Model.Vendedor;

@RequestMapping("/api/v1/vendedores")
@RestController
public class VendedorController {

	@Autowired
	private IVendedorService vendedorService;

	@PostMapping("/")
	public ResponseEntity<Object> save(@ModelAttribute("Vendedor") Vendedor vendedor) {
		vendedorService.save(vendedor);
		return new ResponseEntity<>(vendedor, HttpStatus.OK);
	}

	@GetMapping("/")
	public ResponseEntity<Object> findAll() {
		var ListaVendedores = vendedorService.findAll();
		return new ResponseEntity<>(ListaVendedores, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object> findOne(@PathVariable String id) {
		var vendedor = vendedorService.findOne(id);
		return new ResponseEntity<>(vendedor, HttpStatus.OK);
	}

	@PutMapping("/{id}")

	public ResponseEntity<Object> update(@PathVariable String id,
			@ModelAttribute("Vendedor") Vendedor vendedorUpdate) {

		var vendedor = vendedorService.findOne(id).get();

		if (vendedor != null) {

			vendedor.setIdVendedor(vendedorUpdate.getIdVendedor());

			vendedor.setTipoDocumento(vendedorUpdate.getTipoDocumento());

			vendedor.setTipoDocumento(vendedorUpdate.getTipoDocumento());

			vendedor.setPrimerNombre(vendedorUpdate.getPrimerNombre());

			vendedor.setSegundoNombre(vendedorUpdate.getSegundoNombre());

			vendedor.setPrimerApellido(vendedorUpdate.getPrimerApellido());

			vendedor.setSegundoApellido(vendedorUpdate.getSegundoApellido());

			vendedor.setTelefono(vendedorUpdate.getTelefono());

			vendedor.setCorreo(vendedorUpdate.getCorreo());

			vendedor.setNumeroSeguroSocial(vendedorUpdate.getNumeroSeguroSocial());

			vendedor.setInformacionBancaria(vendedorUpdate.getInformacionBancaria());

			vendedor.setContactoEmergencia(vendedorUpdate.getContactoEmergencia());

			vendedor.setCertificaciones(vendedorUpdate.getCertificaciones());

			vendedorService.save(vendedor);

			return new ResponseEntity<>(vendedor, HttpStatus.OK);

		}

		else {

			return new ResponseEntity<>("Error cliente no encontrado", HttpStatus.BAD_REQUEST);

		}

	}

	@DeleteMapping("/{id}")

	public ResponseEntity<Object> delete(@PathVariable String id) {

		vendedorService.delete(id);

		return new ResponseEntity<>("Registro Eliminado", HttpStatus.OK);

	}

}
