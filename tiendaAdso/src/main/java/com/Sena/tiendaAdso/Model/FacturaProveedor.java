package com.Sena.tiendaAdso.Model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class FacturaProveedor {

	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name="id_factura_proveedor ", nullable=false, length = 36)
	private String IdFacturaProveedor ;
	
	@ManyToOne
	@JoinColumn (name="id_proveedor")
	private Proveedor proveedor;

	
	//Constructor vacio
	public FacturaProveedor() {
		super();
	}


	//Constructor con metodos
	public FacturaProveedor(String idFacturaProveedor, Proveedor proveedor) {
		super();
		this.IdFacturaProveedor = idFacturaProveedor;
		this.proveedor = proveedor;
	}


	//Encapsulamiento
	public String getIdFacturaProveedor() {
		return IdFacturaProveedor;
	}


	public void setIdFacturaProveedor(String idFacturaProveedor) {
		this.IdFacturaProveedor = idFacturaProveedor;
	}


	public Proveedor getProveedor() {
		return proveedor;
	}


	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	
	
	
	
	
	
}