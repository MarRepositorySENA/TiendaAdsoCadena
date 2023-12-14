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

import com.Sena.tiendaAdso.InterfaceService.IFacturaProveedorService;
import com.Sena.tiendaAdso.Model.FacturaProveedor;

@RequestMapping("/api/v1/facturas/proveedores")
@RestController
@CrossOrigin
public class FacturaProveedorController {

	@Autowired
	private IFacturaProveedorService facturaProveedorService;

	@PostMapping("/")
	public ResponseEntity<Object> save(@ModelAttribute("FacturaProveedor") FacturaProveedor facturaProveedor) {
		facturaProveedorService.save(facturaProveedor);
		return new ResponseEntity<>(facturaProveedor, HttpStatus.OK);
	}

	@GetMapping("/")
	public ResponseEntity<Object> findAll() {
		var ListaFacturaProveedores = facturaProveedorService.findAll();
		return new ResponseEntity<>(ListaFacturaProveedores, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object> findOne(@PathVariable String id) {
		var facturaProveedor = facturaProveedorService.findOne(id);
		return new ResponseEntity<>(facturaProveedor, HttpStatus.OK);
	}

	@PutMapping("/{id}")

	public ResponseEntity<Object> update(@PathVariable String id,
			@ModelAttribute("FacturaProveedor") FacturaProveedor facturaProveedorUpdate) {

		var facturaProveedor = facturaProveedorService.findOne(id).get();

		if (facturaProveedor != null) {

			facturaProveedor.setIdFacturaProveedor(facturaProveedorUpdate.getIdFacturaProveedor());
			facturaProveedor.setProveedor(facturaProveedorUpdate.getProveedor());

			facturaProveedorService.save(facturaProveedor);

			return new ResponseEntity<>(facturaProveedor, HttpStatus.OK);

		}

		else {

			return new ResponseEntity<>("Error cliente no encontrado", HttpStatus.BAD_REQUEST);

		}

	}

	@DeleteMapping("/{id}")

	public ResponseEntity<Object> delete(@PathVariable String id) {

		facturaProveedorService.delete(id);

		return new ResponseEntity<>("Registro Eliminado", HttpStatus.OK);

	}

}
