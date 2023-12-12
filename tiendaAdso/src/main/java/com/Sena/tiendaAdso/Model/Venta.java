package com.Sena.tiendaAdso.Model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name="venta")
public class Venta {
	
	//Llave foranea
	@ManyToOne
	@JoinColumn (name="id_cliente")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn (name="id_vendedor")
	private Vendedor vendedor;
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name="id_venta", nullable=false, length = 36)
	private String IdVenta ;
	
	@Column(name="fecha_generacion", nullable=false, length = 20)
	private Date fechaGeneracion;
	
	@Column(name="total_venta", nullable=false, length = 20)
	private int totalVenta;
	
	@Column(name="estado_venta", nullable=false)
	private boolean EstadoVenta;

	
	//Constructor vacio
	public Venta() {
		super();
	}

	//Constructor con metodos
	public Venta(Vendedor vendedor,Cliente cliente, String idVenta, Date fechaGeneracion, int totalVenta, boolean estadoVenta) {
		super();
		this.vendedor = vendedor;
		this.cliente = cliente;
		this.IdVenta = idVenta;
		this.fechaGeneracion = fechaGeneracion;
		this.EstadoVenta = estadoVenta;
	}

	
	//Encapsulamiento
	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getNumeroVenta() {
		return IdVenta;
	}

	public void setNumeroVenta(String numeroVenta) {
		this.IdVenta = numeroVenta;
	}

	public Date getFechaGeneracion() {
		return fechaGeneracion;
	}

	public void setFechaGeneracion(Date fechaGeneracion) {
		this.fechaGeneracion = fechaGeneracion;
	}

	public int getTotalVenta() {
		return totalVenta;
	}

	public void setTotalVenta(int totalVenta) {
		this.totalVenta = totalVenta;
	}

	public boolean isEstadoVenta() {
		return EstadoVenta;
	}

	public void setEstadoVenta(boolean estadoVenta) {
		this.EstadoVenta = estadoVenta;
	}
	
	
	
	
	
	
	
}