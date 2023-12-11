package com.Sena.tiendaAdso.Model;



import java.util.Date;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;

import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;



/*

 * @Entity, es una anotacion bean que indica el nombre de la entidad en la base de datos

 */


//@Entity: Indica que la clase es una entidad
@Entity(name="cliente")

public class Cliente {

	/*

	 * id

	 * tipo_documento

	 * numero_documento

	 * primer_nombre

	 * segundo_nombre

	 * primer_apellido

	 * segundo_apellido

	 * telefono

	 * correo

	 * direccion

	 */

	//UUID: Es para hexadecimal

	

	//La noatcion @Id indica que el campo es un indicador 

	
	//@GeneratedValue: genera el valor automaticos
	//UUID: genera id hexadecimales
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name="id_cliente", nullable=false, length = 36)
	private String IdCliente;


	@Column(name="tipo_documento", nullable=false, length = 2)
	private String TipoDocumento;

	

	@Column(name="numero_documento", nullable=false, length = 15)
	private String NumeroDocumento;


	@Column(name="primer_nombre", nullable=false,length = 15)
	private String PrimerNombre;

	

	@Column(name="segundo_nombre", nullable=true,length = 20)
	private String SegundoNombre;

	

	@Column(name="primer_apellido", nullable=false,length = 20)
	private String PrimerApellido;

	

	@Column(name="segundo_apellido", nullable=true,length = 20)
	private String SegundoApellido;

	@Column(name="genero", nullable=false,length = 15)
	private String Genero;
	
	@Column(name="fecha_nacimiento", nullable=false,length = 15)
	private Date FechaNacimiento;

	@Column(name="telefono", nullable=false,length = 15)
	private String Telefono;

	

	@Column(name="correo", nullable=false,length = 45)
	private String Correo;

	

	@Column(name="direccion", nullable=false,length = 100)
	private String Direccion;

	


// Constructor Vacio
public Cliente() {
	super();
}



	//Constructor con parametros
	public Cliente(String IdCliente, String TipoDocumento, String NumeroDocumento , String PrimerNombre, String SegundoNombre, String PrimerApellido, String SegundoApellido, String Genero, Date FechaNacimiento, String Telefono, String Correo, String Direccion ) {
		super();
		this.IdCliente = IdCliente;
		this.TipoDocumento = TipoDocumento;
		this.NumeroDocumento = NumeroDocumento;
		this.PrimerNombre = PrimerNombre;
		this.SegundoNombre = SegundoNombre;
		this.PrimerApellido = PrimerApellido;
		this.SegundoApellido = SegundoApellido;
		this.Genero = Genero;
		this.FechaNacimiento = FechaNacimiento;
		this.Telefono = Telefono;
		this.Correo = Correo;
		this.Direccion = Direccion;
	}


//Encapsulamiento

public String getIdCliente() {
	return IdCliente;
}



public void setIdCliente(String idCliente) {
	this.IdCliente = idCliente;
}



public String getTipoDocumento() {
	return TipoDocumento;
}



public void setTipoDocumento(String tipoDocumento) {
	this.TipoDocumento = tipoDocumento;
}



public String getNumeroDocumento() {
	return NumeroDocumento;
}



public void setNumeroDocumento(String numeroDocumento) {
	this.NumeroDocumento = numeroDocumento;
}



public String getPrimerNombre() {
	return PrimerNombre;
}



public void setPrimerNombre(String primerNombre) {
	this.PrimerNombre = primerNombre;
}



public String getSegundoNombre() {
	return SegundoNombre;
}



public void setSegundoNombre(String segundoNombre) {
	this.SegundoNombre = segundoNombre;
}



public String getPrimerApellido() {
	return PrimerApellido;
}



public void setPrimerApellido(String primerApellido) {
	this.PrimerApellido = primerApellido;
}



public String getSegundoApellido() {
	return SegundoApellido;
}



public void setSegundoApellido(String segundoApellido) {
	this.SegundoApellido = segundoApellido;
}

public String getGenero() {
	return SegundoApellido;
}



public void setGenero(String genero) {
	this.Genero = genero;
}

public Date getFechaNacimiento() {
	return FechaNacimiento;
}



public void setFechaNacimiento(Date fechaNacimiento) {
	this.FechaNacimiento = fechaNacimiento;
}




public String getTelefono() {
	return Telefono;
}



public void setTelefono(String telefono) {
	this.Telefono = telefono;
}



public String getCorreo() {
	return Correo;
}



public void setCorreo(String correo) {
	this.Correo = correo;
}



public String getDireccion() {
	return Direccion;
}



public void setDireccion(String direccion) {
	this.Direccion = direccion;
}




		

}