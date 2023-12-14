package com.Sena.tiendaAdso.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sena.tiendaAdso.Interface.IProducto;
import com.Sena.tiendaAdso.InterfaceService.IProductoService;
import com.Sena.tiendaAdso.Model.Producto;

@Service
public class ProductoService implements IProductoService {

	@Autowired
	private IProducto data;

	@Override
	public String save(Producto producto) {
		data.save(producto);
		return producto.getIdProducto();
	}

	@Override
	public List<Producto> findAll() {
		List<Producto> listaProducto = (List<Producto>) data.findAll();
		return listaProducto;
	}

	@Override
	public Optional<Producto> findOne(String idProducto) {
		Optional<Producto> Producto = data.findById(idProducto);
		return Producto;
	}

	@Override
	public int delete(String idProducto) {
		data.deleteById(idProducto);
		return 1;
	}

}
