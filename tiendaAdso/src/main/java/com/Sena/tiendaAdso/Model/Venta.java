package com.Sena.tiendaAdso.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="ventas")
public class Venta {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name="numero_venta ", nullable=false, length = 36)
	private String NumeroVenta ;
	
	
	
	
	@Column(name="fecha_generacion", nullable=false, length = 20)
	private String fechaGeneracion;
	
	@Column(name="total_venta", nullable=false, length = 20)
	private String totalVenta;
	
	@Column(name="estado_venta", nullable=false, length = 20)
	private String EstadoVenta;
	
	
	
	
	
}
