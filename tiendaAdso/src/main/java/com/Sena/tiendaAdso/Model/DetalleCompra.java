package com.Sena.tiendaAdso.Model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "detalle_compra")
public class DetalleCompra {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "id_detalle_compra ", nullable = false, length = 36)
	private String IdDetalleCompra;

	@ManyToOne
	@JoinColumn(name = "id_producto")
	private Producto IdProducto;

	@ManyToOne
	@JoinColumn(name = "id_factura_proveedor")
	private Proveedor IdFacturaProveedor;

	@Column(name = "descuento", nullable = false, length = 20)
	private Double Descuento;

	@Column(name = "impuesto", nullable = false, length = 10)
	private Double Impuesto;

	@Column(name = "fecha_compra", nullable = false)
	private Date FechaCompra;

	// Preguntar si la fecha debe llevar longitud
	@Column(name = "fecha_entrega", nullable = false)
	private Date FechaEntrega;

	@Column(name = "estado_compra", nullable = false, length = 20)
	private String EstadoCompra;

	@Column(name = "cantidad", nullable = false, length = 20)
	private Double Cantidad;

	@Column(name = "precio_unitario", nullable = false, length = 20)
	private Double PrecioUnitario;

	@Column(name = "subtotal", nullable = false, length = 20)
	private Double Subtotal;

	@Column(name = "metodo_pago", nullable = false, length = 20)
	private String MetodoPago;

	// Metodo Vacio
	public DetalleCompra() {
		super();
	}

	// Constructor con metodos
	public DetalleCompra(String idDetalleCompra, Producto producto, Proveedor idFacturaProveedor, Double descuento,
			Double impuesto, Date fechaCompra, Date fechaEntrega, String estadoCompra, Double cantidad,
			Double precioUnitario, Double subtotal, String metodoPago) {
		super();
		IdDetalleCompra = idDetalleCompra;
		IdProducto = producto;
		IdFacturaProveedor = idFacturaProveedor;
		Descuento = descuento;
		Impuesto = impuesto;
		FechaCompra = fechaCompra;
		FechaEntrega = fechaEntrega;
		EstadoCompra = estadoCompra;
		Cantidad = cantidad;
		PrecioUnitario = precioUnitario;
		Subtotal = subtotal;
		MetodoPago = metodoPago;
	}

	public String getIdDetalleCompra() {
		return IdDetalleCompra;
	}

	public void setIdDetalleCompra(String idDetalleCompra) {
		IdDetalleCompra = idDetalleCompra;
	}

	public Producto getIdProducto() {
		return IdProducto;
	}

	public void setIdProducto(Producto idProducto) {
		IdProducto = idProducto;
	}

	public Proveedor getIdFacturaProveedor() {
		return IdFacturaProveedor;
	}

	public void setIdFacturaProveedor(Proveedor idFacturaProveedor) {
		IdFacturaProveedor = idFacturaProveedor;
	}

	public Double getDescuento() {
		return Descuento;
	}

	public void setDescuento(Double descuento) {
		Descuento = descuento;
	}

	public Double getImpuesto() {
		return Impuesto;
	}

	public void setImpuesto(Double impuesto) {
		Impuesto = impuesto;
	}

	public Date getFechaCompra() {
		return FechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		FechaCompra = fechaCompra;
	}

	public Date getFechaEntrega() {
		return FechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		FechaEntrega = fechaEntrega;
	}

	public String getEstadoCompra() {
		return EstadoCompra;
	}

	public void setEstadoCompra(String estadoCompra) {
		EstadoCompra = estadoCompra;
	}

	public Double getCantidad() {
		return Cantidad;
	}

	public void setCantidad(Double cantidad) {
		Cantidad = cantidad;
	}

	public Double getPrecioUnitario() {
		return PrecioUnitario;
	}

	public void setPrecioUnitario(Double precioUnitario) {
		PrecioUnitario = precioUnitario;
	}

	public Double getSubtotal() {
		return Subtotal;
	}

	public void setSubtotal(Double subtotal) {
		Subtotal = subtotal;
	}

	public String getMetodoPago() {
		return MetodoPago;
	}

	public void setMetodoPago(String metodoPago) {
		MetodoPago = metodoPago;
	}

}
