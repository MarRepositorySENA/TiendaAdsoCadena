package com.Sena.tiendaAdso.Model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class DetalleVenta {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name="codigo_detalle_venta ", nullable=false, length = 36)
	private String CodigoDetalleVenta ;
	
	@ManyToOne
	@JoinColumn (name="numero_venta")
	private Venta venta;
	
	@ManyToOne
	@JoinColumn (name="codigo_barras")
	private Producto producto;
	
	@Column(name="cantidad", nullable=false, length = 20)
	private String  Cantidad;
	
	@Column(name="precio_unitario", nullable=false, length = 20)
	private String PrecioUnitario;
	
	@Column(name="subtotal", nullable=false, length = 20)
	private String Subtotal;
	
	@Column(name="metodo_pago", nullable=false, length = 20)
	private String MetodoPago;
	
	@Column(name="descuento_aplicado", nullable=false, length = 20)
	private String DescuentoAplicado;
}
