package com.Sena.tiendaAdso.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "detalle_venta")
public class DetalleVenta {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "id_detalle_venta ", nullable = false, length = 36)
	private String IdDetalleVenta;

	@ManyToOne
	@JoinColumn(name = "id_factura_cliente")
	private FacturaCliente IdFacturaCliente;

	@ManyToOne
	@JoinColumn(name = "id_venta")
	private Venta IdVenta;

	@ManyToOne
	@JoinColumn(name = "id_producto")
	private Producto IdProducto;

	@Column(name = "cantidad", nullable = false, length = 20)
	private int Cantidad;

	@Column(name = "precio_unitario", nullable = false, length = 20)
	private Double PrecioUnitario;

	@Column(name = "subtotal", nullable = false, length = 20)
	private Double Subtotal;

	@Column(name = "metodo_pago", nullable = false, length = 20)
	private String MetodoPago;

	@Column(name = "descuento_aplicado", nullable = false, length = 20)
	private Double DescuentoAplicado;

	// Constructor vacio
	public DetalleVenta() {
		super();
	}

	// Constructor con metodos
	public DetalleVenta(String idDetalleVenta, FacturaCliente idFacturaCliente, Venta idVenta, Producto idProducto,
			int cantidad, Double precioUnitario, Double subtotal, String metodoPago, Double descuentoAplicado) {
		super();
		IdDetalleVenta = idDetalleVenta;
		IdFacturaCliente = idFacturaCliente;
		IdVenta = idVenta;
		IdProducto = idProducto;
		Cantidad = cantidad;
		PrecioUnitario = precioUnitario;
		Subtotal = subtotal;
		MetodoPago = metodoPago;
		DescuentoAplicado = descuentoAplicado;
	}

	public String getIdDetalleVenta() {
		return IdDetalleVenta;
	}

	public void setIdDetalleVenta(String idDetalleVenta) {
		IdDetalleVenta = idDetalleVenta;
	}

	public FacturaCliente getIdFacturaCliente() {
		return IdFacturaCliente;
	}

	public void setIdFacturaCliente(FacturaCliente idFacturaCliente) {
		IdFacturaCliente = idFacturaCliente;
	}

	public Venta getIdVenta() {
		return IdVenta;
	}

	public void setIdVenta(Venta idVenta) {
		IdVenta = idVenta;
	}

	public Producto getIdProducto() {
		return IdProducto;
	}

	public void setIdProducto(Producto idProducto) {
		IdProducto = idProducto;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
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

	public Double getDescuentoAplicado() {
		return DescuentoAplicado;
	}

	public void setDescuentoAplicado(Double descuentoAplicado) {
		DescuentoAplicado = descuentoAplicado;
	}

}
