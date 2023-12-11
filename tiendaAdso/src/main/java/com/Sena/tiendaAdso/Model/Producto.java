package com.Sena.tiendaAdso.Model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="productos")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name="codigo_barras ", nullable=false, length = 36)
	private String CodigoBarras ;
	
	@Column(name="nombre_producto", nullable=false, length = 20)
	private String NombreProducto;
	
	@Column(name="marca_Producto", nullable=false, length = 20)
	private String MarcaProducto;
	
	@Column(name="precio_producto", nullable=false, length = 15)
	private int PrecioProducto;
	
	@Column(name="descripcion_producto", nullable=false, length = 25)
	private String DescripcionProducto;
	
	@Column(name="categoria_Producto", nullable=false, length = 15)
	private String CategoriaProducto;
	
	@Column(name="fecha_creacion_registro", nullable=false, length = 15)
	private Date FechaCreacionRegistro;
	
	@Column(name="fecha_actualizacion", nullable=false, length = 15)
	private Date FechaActualizacion;
	
	@Column(name="cantidad_stock", nullable=false, length = 15)
	private int CantidadStock;
	
	@Column(name="peso_producto", nullable=false, length = 15)
	private String PesoProducto;
	
	//llave foranea con proveedor que trae ese  producto
	//@Column(name="disponibilidad_Producto", nullable=false, length = 10)
	//private String DisponibilidadProducto;
}
