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
@Entity(name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "id_cliente", nullable = false, length = 36)
	private String IdCliente;

	@Column(name = "tipo_documento", nullable = false, length = 2)
	private String TipoDocumento;

	@Column(name = "numero_documento", nullable = false, length = 15)
	private String NumeroDocumento;

	@Column(name = "primer_nombre", nullable = false, length = 15)
	private String PrimerNombre;

	@Column(name = "segundo_nombre", nullable = true, length = 20)
	private String SegundoNombre;

	@Column(name = "primer_apellido", nullable = false, length = 20)
	private String PrimerApellido;

	@Column(name = "segundo_apellido", nullable = true, length = 20)
	private String SegundoApellido;

	@Column(name = "genero", nullable = true, length = 15)
	private String Genero;

	@Column(name = "fecha_nacimiento", nullable = false, length = 15)
	private Date FechaNacimiento;

	@Column(name = "telefono", nullable = false, length = 15)
	private String Telefono;

	@Column(name = "correo", nullable = false, length = 45)
	private String Correo;

	@Column(name = "direccion", nullable = false, length = 100)
	private String Direccion;

	public Cliente() {
		super();
	}

	// Constructor con parametros
	public Cliente(String idCliente, String tipoDocumento, String numeroDocumento, String primerNombre,
			String segundoNombre, String primerApellido, String segundoApellido, String genero, Date fechaNacimiento,
			String telefono, String correo, String direccion) {
		super();
		IdCliente = idCliente;
		TipoDocumento = tipoDocumento;
		NumeroDocumento = numeroDocumento;
		PrimerNombre = primerNombre;
		SegundoNombre = segundoNombre;
		PrimerApellido = primerApellido;
		SegundoApellido = segundoApellido;
		Genero = genero;
		FechaNacimiento = fechaNacimiento;
		Telefono = telefono;
		Correo = correo;
		Direccion = direccion;
	}

	public String getIdCliente() {
		return IdCliente;
	}

	public void setIdCliente(String idCliente) {
		IdCliente = idCliente;
	}

	public String getTipoDocumento() {
		return TipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		TipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return NumeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		NumeroDocumento = numeroDocumento;
	}

	public String getPrimerNombre() {
		return PrimerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		PrimerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return SegundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		SegundoNombre = segundoNombre;
	}

	public String getPrimerApellido() {
		return PrimerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		PrimerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return SegundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		SegundoApellido = segundoApellido;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public Date getFechaNacimiento() {
		return FechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

}