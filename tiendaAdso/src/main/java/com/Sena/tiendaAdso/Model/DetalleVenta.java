package com.Sena.tiendaAdso.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name="detalle_venta")
public class DetalleVenta {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name="id_detalle_venta ", nullable=false, length = 36)
	private String IdDetalleVenta ;
	
	@ManyToOne
	@JoinColumn (name="id_factura_cliente")
	private FacturaCliente facturaCliente;
	
	@ManyToOne
	@JoinColumn (name="id_venta")
	private Venta venta;
	
	@ManyToOne
	@JoinColumn (name="id_producto")
	private Producto producto;
	
	@Column(name="cantidad", nullable=false, length = 20)
	private int  Cantidad;
	
	@Column(name="precio_unitario", nullable=false, length = 20)
	private Double PrecioUnitario;
	
	@Column(name="subtotal", nullable=false, length = 20)
	private Double Subtotal;
	
	@Column(name="metodo_pago", nullable=false, length = 20)
	private String MetodoPago;
	
	@Column(name="descuento_aplicado", nullable=false, length = 20)
	private Double DescuentoAplicado;

	
	//Constructor vacio
	public DetalleVenta() {
		super();
	}

	//Constructor con metodos
	public DetalleVenta(String idDetalleVenta, Venta venta, Producto producto, int cantidad, Double precioUnitario,
			Double subtotal, String metodoPago, Double descuentoAplicado) {
		super();
		this.IdDetalleVenta = idDetalleVenta;
		this.venta = venta;
		this.producto = producto;
		this.Cantidad = cantidad;
		this.PrecioUnitario = precioUnitario;
		this.Subtotal = subtotal;
		this.MetodoPago = metodoPago;
		this.DescuentoAplicado = descuentoAplicado;
	}

	//Encapsulamiento
	public String getIdDetalleVenta() {
		return IdDetalleVenta;
	}

	public void setIdDetalleVenta(String idDetalleVenta) {
		this.IdDetalleVenta = idDetalleVenta;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
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

	public Double getDescuentoAplicado() {
		return DescuentoAplicado;
	}

	public void setDescuentoAplicado(Double descuentoAplicado) {
		this.DescuentoAplicado = descuentoAplicado;
	}

	
	
	
	
	
	
	
	
	
}
