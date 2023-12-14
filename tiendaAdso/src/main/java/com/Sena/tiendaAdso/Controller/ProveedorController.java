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

import com.Sena.tiendaAdso.InterfaceService.IProveedorService;
import com.Sena.tiendaAdso.Model.Proveedor;

@RequestMapping("/api/v1/proveedores")
@RestController
@CrossOrigin
public class ProveedorController {

	@Autowired
	private IProveedorService proveedorService;

	@PostMapping("/")
	public ResponseEntity<Object> save(@ModelAttribute("Proveedor") Proveedor proveedor) {
		proveedorService.save(proveedor);
		return new ResponseEntity<>(proveedor, HttpStatus.OK);
	}

	@GetMapping("/")
	public ResponseEntity<Object> findAll() {
		var ListaProveedores = proveedorService.findAll();
		return new ResponseEntity<>(ListaProveedores, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object> findOne(@PathVariable String id) {
		var proveedor = proveedorService.findOne(id);
		return new ResponseEntity<>(proveedor, HttpStatus.OK);
	}

	@PutMapping("/{id}")

	public ResponseEntity<Object> update(@PathVariable String id,
			@ModelAttribute("Proveedor") Proveedor proveedorUpdate) {

		var proveedor = proveedorService.findOne(id).get();

		if (proveedor != null) {

			proveedor.setIdProveedor(proveedorUpdate.getIdProveedor());
			proveedor.setTipoDocumento(proveedorUpdate.getTipoDocumento());
			proveedor.setNumeroDocumento(proveedorUpdate.getNumeroDocumento());
			proveedor.setPrimerNombre(proveedorUpdate.getPrimerNombre());
			proveedor.setSegundoNombre(proveedorUpdate.getSegundoNombre());
			proveedor.setPrimerApellido(proveedorUpdate.getPrimerApellido());
			proveedor.setSegundoApellido(proveedorUpdate.getSegundoApellido());
			proveedor.setGenero(proveedorUpdate.getGenero());
			proveedor.setFechaNacimiento(proveedorUpdate.getFechaNacimiento());
			proveedor.setTelefono(proveedorUpdate.getTelefono());
			proveedor.setCorreo(proveedorUpdate.getCorreo());
			proveedor.setDireccion(proveedorUpdate.getDireccion());
			proveedor.setTipoProveedor(proveedorUpdate.getTipoProveedor());
			proveedor.setPrecio(proveedorUpdate.getPrecio());
			proveedor.setDisponibilidad(proveedorUpdate.getDisponibilidad());
			proveedor.setPoliticasDevolucion(proveedorUpdate.getPoliticasDevolucion());
			proveedor.setFormasPago(proveedor.getFormasPago());

			proveedorService.save(proveedor);

			return new ResponseEntity<>(proveedor, HttpStatus.OK);

		}

		else {

			return new ResponseEntity<>("Error cliente no encontrado", HttpStatus.BAD_REQUEST);

		}

	}

	@DeleteMapping("/{id}")

	public ResponseEntity<Object> delete(@PathVariable String id) {

		proveedorService.delete(id);

		return new ResponseEntity<>("Registro Eliminado", HttpStatus.OK);

	}

}
