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

import com.Sena.tiendaAdso.InterfaceService.IVentaService;
import com.Sena.tiendaAdso.Model.Venta;


@RequestMapping("/api/v1/Ventas")
@RestController
@CrossOrigin
public class VentaController {

	@Autowired
	private IVentaService ventaService;
	
	@PostMapping("/")
	public ResponseEntity<Object> save(@ModelAttribute("Venta") Venta venta) {
		ventaService.save(venta);
		return new ResponseEntity<>(venta, HttpStatus.OK);
	}

	@GetMapping("/")
	public ResponseEntity<Object> findAll() {
		var ListaVentas = ventaService.findAll();
		return new ResponseEntity<>(ListaVentas, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object> findOne(@PathVariable String id) {
		var venta = ventaService.findOne(id);
		return new ResponseEntity<>(venta, HttpStatus.OK);
	}
	
	@PutMapping("/{id}")

	public ResponseEntity<Object> update(@PathVariable String id,
			@ModelAttribute("Venta") Venta ventaUpdate) {

		var venta = ventaService.findOne(id).get();

		if (venta != null) {
			

			venta.setIdVenta(ventaUpdate.getIdVenta());
			venta.setCliente(ventaUpdate.getCliente());
			venta.setVendedor(ventaUpdate.getVendedor());
			venta.setFechaGeneracion(ventaUpdate.getFechaGeneracion());
			venta.setTotalVenta(ventaUpdate.getTotalVenta());
			venta.setEstadoVenta(ventaUpdate.getEstadoVenta());
			
			
			ventaService.save(venta);

			return new ResponseEntity<>(venta, HttpStatus.OK);

		}

		else {

			return new ResponseEntity<>("Error cliente no encontrado", HttpStatus.BAD_REQUEST);

		}

	}

	@DeleteMapping("/{id}")

	public ResponseEntity<Object> delete(@PathVariable String id) {

		ventaService.delete(id);

		return new ResponseEntity<>("Registro Eliminado", HttpStatus.OK);

	}
	
	
}
