package com.Sena.tiendaAdso.Model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name="detalle_compra")
public class DetalleCompra {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name="id_detalle_compra ", nullable=false, length = 36)
	private String IdDetalleCompra ;
	
	@ManyToOne
	@JoinColumn (name="id_producto")
	private Producto producto;
	
	@ManyToOne
	@JoinColumn (name="id_factura_proveedor")
	private Proveedor IdFacturaProveedor;
	
	@Column(name="descuento", nullable=false, length = 20)
	private Double  Descuento;
	
	@Column(name="impuesto", nullable=false, length = 10)
	private Double  Impuesto;
	
	@Column(name="fecha_compra", nullable=false )
	private Date FechaCompra;
	
	//Preguntar si la fecha debe llevar longitud
	@Column(name="fecha_entrega", nullable=false)
	private Date FechaEntrega;
	
	@Column(name="estado_compra", nullable=false, length = 20)
	private String EstadoCompra;
	
	@Column(name="cantidad", nullable=false, length = 20)
	private Double  Cantidad;
	
	@Column(name="precio_unitario", nullable=false, length = 20)
	private Double PrecioUnitario;
	
	@Column(name="subtotal", nullable=false, length = 20)
	private Double Subtotal;
	
	@Column(name="metodo_pago", nullable=false, length = 20)
	private String MetodoPago;

	//Metodo Vacio
	public DetalleCompra() {
		super();
	}

	
	//Constructor con metodos
	public DetalleCompra(String idDetalleCompra, Producto producto, Proveedor idFacturaProveedor, Double descuento,
			Double impuesto, Date fechaCompra, Date fechaEntrega, String estadoCompra, Double cantidad,
			Double precioUnitario, Double subtotal, String metodoPago) {
		super();
		this.IdDetalleCompra = idDetalleCompra;
		this.producto = producto;
		this.IdFacturaProveedor = idFacturaProveedor;
		this.Descuento = descuento;
		this.Impuesto = impuesto;
		this.FechaCompra = fechaCompra;
		this.FechaEntrega = fechaEntrega;
		this.EstadoCompra = estadoCompra;
		this.Cantidad = cantidad;
		this.PrecioUnitario = precioUnitario;
		this.Subtotal = subtotal;
		this.MetodoPago = metodoPago;
	}


	//Encapsulamiento
	public String getIdDetalleCompra() {
		return IdDetalleCompra;
	}


	public void setIdDetalleCompra(String idDetalleCompra) {
		this.IdDetalleCompra = idDetalleCompra;
	}


	public Producto getProducto() {
		return producto;
	}


	public void setProducto(Producto producto) {
		this.producto = producto;
	}


	public Proveedor getIdFacturaProveedor() {
		return IdFacturaProveedor;
	}


	public void setIdFacturaProveedor(Proveedor idFacturaProveedor) {
		this.IdFacturaProveedor = idFacturaProveedor;
	}


	public Double getDescuento() {
		return Descuento;
	}


	public void setDescuento(Double descuento) {
		this.Descuento = descuento;
	}


	public Double getImpuesto() {
		return Impuesto;
	}


	public void setImpuesto(Double impuesto) {
		this.Impuesto = impuesto;
	}


	public Date getFechaCompra() {
		return FechaCompra;
	}


	public void setFechaCompra(Date fechaCompra) {
		this.FechaCompra = fechaCompra;
	}


	public Date getFechaEntrega() {
		return FechaEntrega;
	}


	public void setFechaEntrega(Date fechaEntrega) {
		this.FechaEntrega = fechaEntrega;
	}


	public String getEstadoCompra() {
		return EstadoCompra;
	}


	public void setEstadoCompra(String estadoCompra) {
		this.EstadoCompra = estadoCompra;
	}


	public Double getCantidad() {
		return Cantidad;
	}


	public void setCantidad(Double cantidad) {
		this.Cantidad = cantidad;
	}


	public Double getPrecioUnitario() {
		return PrecioUnitario;
	}


	public void setPrecioUnitario(Double precioUnitario) {
		this.PrecioUnitario = precioUnitario;
	}


	public Double getSubtotal() {
		return Subtotal;
	}


	public void setSubtotal(Double subtotal) {
		this.Subtotal = subtotal;
	}


	public String getMetodoPago() {
		return MetodoPago;
	}


	public void setMetodoPago(String metodoPago) {
		this.MetodoPago = metodoPago;
	}
	
	
	

	
	
	
	
	
	
	
	
}
