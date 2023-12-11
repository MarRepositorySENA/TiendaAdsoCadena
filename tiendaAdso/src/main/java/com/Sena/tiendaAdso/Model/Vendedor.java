package com.Sena.tiendaAdso.Model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

//@Entity: Indica que la clase es una entidad
@Entity(name="vendedor")
public class Vendedor {

	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name="id_cliente", nullable=false, length = 36)
	private String IdVendedor;


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
	
	
	//Atributos adicionales a la entidad
	@Column(name="numero_seguro_social", nullable=false,length = 25)
	private String NumeroSeguroSocial;
	
	@Column(name="informacion_bancaria", nullable=false,length = 15)
	private String InformacionBancaria;
	
	@Column(name="contacto_emergencia", nullable=false,length = 15)
	private String ContactoEmergencia;
	
	@Column(name="certificaciones", nullable=false,length = 100)
	private String Certificaciones;
	
	
	// Constructor vacio
	public Vendedor() {
		super();
	}

	// Constructor con parametros
	public Vendedor(String idVendedor, String tipoDocumento, String numeroDocumento, String primerNombre,
			String segundoNombre, String primerApellido, String segundoApellido, String genero, Date fechaNacimiento,
			String telefono, String correo, String direccion, String numeroSeguroSocial, String informacionBancaria,
			String contactoEmergencia, String certificaciones) {
		super();
		this.IdVendedor = idVendedor;
		this.TipoDocumento = tipoDocumento;
		this.NumeroDocumento = numeroDocumento;
		this.PrimerNombre = primerNombre;
		this.SegundoNombre = segundoNombre;
		this.PrimerApellido = primerApellido;
		this.SegundoApellido = segundoApellido;
		this.Genero = genero;
		this.FechaNacimiento = fechaNacimiento;
		this.Telefono = telefono;
		this.Correo = correo;
		this.Direccion = direccion;
		this.NumeroSeguroSocial = numeroSeguroSocial;
		this.InformacionBancaria = informacionBancaria;
		this.ContactoEmergencia = contactoEmergencia;
		this.Certificaciones = certificaciones;
	}

	public String getIdVendedor() {
		return IdVendedor;
	}

	public void setIdVendedor(String idVendedor) {
		this.IdVendedor = idVendedor;
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
		return Genero;
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

	public String getNumeroSeguroSocial() {
		return NumeroSeguroSocial;
	}

	public void setNumeroSeguroSocial(String numeroSeguroSocial) {
		this.NumeroSeguroSocial = numeroSeguroSocial;
	}

	public String getInformacionBancaria() {
		return InformacionBancaria;
	}

	public void setInformacionBancaria(String informacionBancaria) {
		this.InformacionBancaria = informacionBancaria;
	}

	public String getContactoEmergencia() {
		return ContactoEmergencia;
	}

	public void setContactoEmergencia(String contactoEmergencia) {
		this.ContactoEmergencia = contactoEmergencia;
	}

	public String getCertificaciones() {
		return Certificaciones;
	}

	public void setCertificaciones(String certificaciones) {
		this.Certificaciones = certificaciones;
	}
	
	
	

	
}
