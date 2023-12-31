package com.Sena.tiendaAdso.Model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "producto")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "id_producto ", nullable = false, length = 36)
	private String IdProducto;

	@Column(name = "nombre_producto", nullable = false, length = 20)
	private String NombreProducto;

	@Column(name = "marca_Producto", nullable = false, length = 20)
	private String MarcaProducto;

	@Column(name = "precio_producto", nullable = false, length = 15)
	private Double PrecioProducto;

	@Column(name = "descripcion_producto", nullable = true, length = 25)
	private String DescripcionProducto;

	@Column(name = "categoria_Producto", nullable = false, length = 15)
	private String CategoriaProducto;

	@Column(name = "fecha_creacion_registro", nullable = false, length = 15)
	private Date FechaCreacionRegistro;

	@Column(name = "fecha_actualizacion", nullable = false, length = 15)
	private Date FechaActualizacion;

	@Column(name = "cantidad_stock", nullable = false, length = 15)
	private Double CantidadStock;

	@Column(name = "peso_producto", nullable = false, length = 15)
	private Double PesoProducto;

	// Constructor vacio
	public Producto() {
		super();
	}

	// Constructor con metodos
	public Producto(String idProducto, String nombreProducto, String marcaProducto, Double precioProducto,
			String descripcionProducto, String categoriaProducto, Date fechaCreacionRegistro, Date fechaActualizacion,
			Double cantidadStock, Double pesoProducto) {
		super();
		IdProducto = idProducto;
		NombreProducto = nombreProducto;
		MarcaProducto = marcaProducto;
		PrecioProducto = precioProducto;
		DescripcionProducto = descripcionProducto;
		CategoriaProducto = categoriaProducto;
		FechaCreacionRegistro = fechaCreacionRegistro;
		FechaActualizacion = fechaActualizacion;
		CantidadStock = cantidadStock;
		PesoProducto = pesoProducto;
	}

	// Encapsulamiento
	public String getIdProducto() {
		return IdProducto;
	}

	public void setIdProducto(String idProducto) {
		IdProducto = idProducto;
	}

	public String getNombreProducto() {
		return NombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		NombreProducto = nombreProducto;
	}

	public String getMarcaProducto() {
		return MarcaProducto;
	}

	public void setMarcaProducto(String marcaProducto) {
		MarcaProducto = marcaProducto;
	}

	public Double getPrecioProducto() {
		return PrecioProducto;
	}

	public void setPrecioProducto(Double precioProducto) {
		PrecioProducto = precioProducto;
	}

	public String getDescripcionProducto() {
		return DescripcionProducto;
	}

	public void setDescripcionProducto(String descripcionProducto) {
		DescripcionProducto = descripcionProducto;
	}

	public String getCategoriaProducto() {
		return CategoriaProducto;
	}

	public void setCategoriaProducto(String categoriaProducto) {
		CategoriaProducto = categoriaProducto;
	}

	public Date getFechaCreacionRegistro() {
		return FechaCreacionRegistro;
	}

	public void setFechaCreacionRegistro(Date fechaCreacionRegistro) {
		FechaCreacionRegistro = fechaCreacionRegistro;
	}

	public Date getFechaActualizacion() {
		return FechaActualizacion;
	}

	public void setFechaActualizacion(Date fechaActualizacion) {
		FechaActualizacion = fechaActualizacion;
	}

	public Double getCantidadStock() {
		return CantidadStock;
	}

	public void setCantidadStock(Double cantidadStock) {
		CantidadStock = cantidadStock;
	}

	public Double getPesoProducto() {
		return PesoProducto;
	}

	public void setPesoProducto(Double pesoProducto) {
		PesoProducto = pesoProducto;
	}

}
