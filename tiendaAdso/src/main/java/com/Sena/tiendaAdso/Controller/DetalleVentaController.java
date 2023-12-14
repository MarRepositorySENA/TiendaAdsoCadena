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

import com.Sena.tiendaAdso.InterfaceService.IDetalleVentaService;
import com.Sena.tiendaAdso.Model.DetalleVenta;

@RequestMapping("/api/v1/detalles/ventas")
@RestController
@CrossOrigin
public class DetalleVentaController {

	@Autowired
	private IDetalleVentaService detalleVentaService;

	@PostMapping("/")
	public ResponseEntity<Object> save(@ModelAttribute("DetalleVenta") DetalleVenta detalleVenta) {
		detalleVentaService.save(detalleVenta);
		return new ResponseEntity<>(detalleVenta, HttpStatus.OK);
	}

	@GetMapping("/")
	public ResponseEntity<Object> findAll() {
		var ListaDetalleVentas = detalleVentaService.findAll();
		return new ResponseEntity<>(ListaDetalleVentas, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object> findOne(@PathVariable String id) {
		var detalleVenta = detalleVentaService.findOne(id);
		return new ResponseEntity<>(detalleVenta, HttpStatus.OK);
	}

	@PutMapping("/{id}")

	public ResponseEntity<Object> update(@PathVariable String id,
			@ModelAttribute("DetalleVenta") DetalleVenta DetalleVentaUpdate) {

		var detalleVenta = detalleVentaService.findOne(id).get();

		if (detalleVenta != null) {

			detalleVenta.setIdDetalleVenta(DetalleVentaUpdate.getIdDetalleVenta());
			detalleVenta.setIdVenta(DetalleVentaUpdate.getIdVenta());
			detalleVenta.setIdProducto(DetalleVentaUpdate.getIdProducto());
			detalleVenta.setCantidad(DetalleVentaUpdate.getCantidad());
			detalleVenta.setPrecioUnitario(DetalleVentaUpdate.getPrecioUnitario());
			detalleVenta.setSubtotal(DetalleVentaUpdate.getSubtotal());
			detalleVenta.setMetodoPago(DetalleVentaUpdate.getMetodoPago());
			detalleVenta.setDescuentoAplicado(DetalleVentaUpdate.getDescuentoAplicado());

			detalleVentaService.save(detalleVenta);

			return new ResponseEntity<>(detalleVenta, HttpStatus.OK);

		}

		else {

			return new ResponseEntity<>("Error cliente no encontrado", HttpStatus.BAD_REQUEST);

		}

	}

	@DeleteMapping("/{id}")

	public ResponseEntity<Object> delete(@PathVariable String id) {

		detalleVentaService.delete(id);

		return new ResponseEntity<>("Registro Eliminado", HttpStatus.OK);

	}
}
