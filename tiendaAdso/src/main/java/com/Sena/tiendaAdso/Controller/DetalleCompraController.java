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

import com.Sena.tiendaAdso.InterfaceService.IDetalleCompraService;
import com.Sena.tiendaAdso.Model.DetalleCompra;

@RequestMapping("/api/v1/detalles/compras")
@RestController
@CrossOrigin
public class DetalleCompraController {

	@Autowired
	private IDetalleCompraService detalleCompraService;

	@PostMapping("/")
	public ResponseEntity<Object> save(@ModelAttribute("DetalleCompra") DetalleCompra detalleCompra) {
		detalleCompraService.save(detalleCompra);
		return new ResponseEntity<>(detalleCompra, HttpStatus.OK);
	}

	@GetMapping("/")
	public ResponseEntity<Object> findAll() {
		var ListaDetalleCompras = detalleCompraService.findAll();
		return new ResponseEntity<>(ListaDetalleCompras, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object> findOne(@PathVariable String id) {
		var detalleCompra = detalleCompraService.findOne(id);
		return new ResponseEntity<>(detalleCompra, HttpStatus.OK);
	}

	@PutMapping("/{id}")

	public ResponseEntity<Object> update(@PathVariable String id,
			@ModelAttribute("DetalleCompra") DetalleCompra detalleCompraUpdate) {

		var detalleCompra = detalleCompraService.findOne(id).get();

		if (detalleCompra != null) {

			detalleCompra.setIdDetalleCompra(detalleCompraUpdate.getIdDetalleCompra());

			detalleCompra.setIdProducto(detalleCompraUpdate.getIdProducto());
			detalleCompra.setIdFacturaProveedor(detalleCompraUpdate.getIdFacturaProveedor());
			detalleCompra.setDescuento(detalleCompraUpdate.getDescuento());
			detalleCompra.setImpuesto(detalleCompraUpdate.getImpuesto());
			detalleCompra.setFechaCompra(detalleCompraUpdate.getFechaCompra());
			detalleCompra.setFechaEntrega(detalleCompraUpdate.getFechaEntrega());
			detalleCompra.setEstadoCompra(detalleCompraUpdate.getEstadoCompra());
			detalleCompra.setCantidad(detalleCompraUpdate.getCantidad());
			detalleCompra.setPrecioUnitario(detalleCompraUpdate.getPrecioUnitario());
			detalleCompra.setSubtotal(detalleCompraUpdate.getSubtotal());
			detalleCompra.setMetodoPago(detalleCompraUpdate.getMetodoPago());

			detalleCompraService.save(detalleCompra);

			return new ResponseEntity<>(detalleCompra, HttpStatus.OK);

		}

		else {

			return new ResponseEntity<>("Error cliente no encontrado", HttpStatus.BAD_REQUEST);

		}

	}

	@DeleteMapping("/{id}")

	public ResponseEntity<Object> delete(@PathVariable String id) {

		detalleCompraService.delete(id);

		return new ResponseEntity<>("Registro Eliminado", HttpStatus.OK);

	}
}
