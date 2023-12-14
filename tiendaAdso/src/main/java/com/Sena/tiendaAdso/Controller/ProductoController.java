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

import com.Sena.tiendaAdso.InterfaceService.IProductoService;
import com.Sena.tiendaAdso.Model.Producto;

@RequestMapping("/api/v1/productos")
@RestController
@CrossOrigin

public class ProductoController {

	@Autowired
	private IProductoService productoService;

	@PostMapping("/")
	public ResponseEntity<Object> save(@ModelAttribute("Producto") Producto producto) {
		productoService.save(producto);
		return new ResponseEntity<>(producto, HttpStatus.OK);
	}

	@GetMapping("/")
	public ResponseEntity<Object> findAll() {
		var ListaProductos = productoService.findAll();
		return new ResponseEntity<>(ListaProductos, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object> findOne(@PathVariable String id) {
		var Producto = productoService.findOne(id);
		return new ResponseEntity<>(Producto, HttpStatus.OK);
	}

	@PutMapping("/{id}")

	public ResponseEntity<Object> update(@PathVariable String id,
			@ModelAttribute("Producto") Producto productoUpdate) {

		var producto = productoService.findOne(id).get();

		if (producto != null) {

			producto.setIdProducto(productoUpdate.getIdProducto());
			producto.setNombreProducto(productoUpdate.getNombreProducto());
			producto.setMarcaProducto(productoUpdate.getMarcaProducto());
			producto.setPrecioProducto(productoUpdate.getPrecioProducto());
			producto.setDescripcionProducto(productoUpdate.getDescripcionProducto());
			producto.setCategoriaProducto(productoUpdate.getCategoriaProducto());
			producto.setFechaCreacionRegistro(productoUpdate.getFechaCreacionRegistro());
			producto.setFechaActualizacion(productoUpdate.getFechaActualizacion());
			producto.setCantidadStock(productoUpdate.getCantidadStock());
			producto.setPesoProducto(productoUpdate.getPesoProducto());

			productoService.save(producto);

			return new ResponseEntity<>(producto, HttpStatus.OK);

		}

		else {

			return new ResponseEntity<>("Error cliente no encontrado", HttpStatus.BAD_REQUEST);

		}

	}

	@DeleteMapping("/{id}")

	public ResponseEntity<Object> delete(@PathVariable String id) {

		productoService.delete(id);

		return new ResponseEntity<>("Registro Eliminado", HttpStatus.OK);

	}

}
