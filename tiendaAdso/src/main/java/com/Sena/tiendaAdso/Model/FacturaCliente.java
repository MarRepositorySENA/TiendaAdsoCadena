package com.Sena.tiendaAdso.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "factura_cliente")
public class FacturaCliente {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "id_factura_cliente ", nullable = false, length = 36)
	private String IdFacturaCliente;

	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;

	@ManyToOne
	@JoinColumn(name = "id_producto")
	private Vendedor vendedor;

	@ManyToOne
	@JoinColumn(name = "id_detalle_venta")
	private DetalleVenta detalleVenta;

	// Constructor vacio
	public FacturaCliente() {
		super();
	}

	// Constructor con metodos
	public FacturaCliente(String idFacturaCliente, Cliente cliente, Vendedor vendedor, DetalleVenta detalleVenta) {
		super();
		IdFacturaCliente = idFacturaCliente;
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.detalleVenta = detalleVenta;
	}

	// Encapsulamiento
	public String getIdFacturaCliente() {
		return IdFacturaCliente;
	}

	public void setIdFacturaCliente(String idFacturaCliente) {
		IdFacturaCliente = idFacturaCliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public DetalleVenta getDetalleVenta() {
		return detalleVenta;
	}

	public void setDetalleVenta(DetalleVenta detalleVenta) {
		this.detalleVenta = detalleVenta;
	}

	

}
