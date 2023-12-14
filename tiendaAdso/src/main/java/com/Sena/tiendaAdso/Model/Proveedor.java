package com.Sena.tiendaAdso.Model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "proveedor")
public class Proveedor {

	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(name = "id_proveedor", nullable = false, length = 36)
	private String IdProveedor;

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

	// Atributos adicionales

	// Indica el tipo de productos o servicios que ofrece el proveedor.
	@Column(name = "tipo_proveedor", nullable = false, length = 100)
	private String TipoProveedor;

	// Los precios de los productos o servicios ofrecidos por el proveedor.
	@Column(name = "precio", nullable = false, length = 100)
	private String Precio;

	// Indica si el proveedor está actualmente disponible para realizar negocios.
	@Column(name = "disponibilidad", nullable = false)
	private boolean Disponibilidad;

	// Las políticas o condiciones para devoluciones de productos o cancelaciones de
	// servicios.
	@Column(name = "politicas_devolucion", nullable = false)
	private boolean PoliticasDevolucion;

	// Las diferentes formas de pago que acepta el proveedor
	@Column(name = "formas_pago", nullable = false)
	private boolean FormasPago;

	// Constructor vacio
	public Proveedor() {
		super();
	}

	// Constructor con metodos
	public Proveedor(String idProveedor, String tipoDocumento, String numeroDocumento, String primerNombre,
			String segundoNombre, String primerApellido, String segundoApellido, String genero, Date fechaNacimiento,
			String telefono, String correo, String direccion, String tipoProveedor, String precio,
			boolean disponibilidad, boolean politicasDevolucion, boolean formasPago) {
		super();
		IdProveedor = idProveedor;
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
		TipoProveedor = tipoProveedor;
		Precio = precio;
		Disponibilidad = disponibilidad;
		PoliticasDevolucion = politicasDevolucion;
		FormasPago = formasPago;
	}

	// Encapsulamiento
	public String getIdProveedor() {
		return IdProveedor;
	}

	public void setIdProveedor(String idProveedor) {
		IdProveedor = idProveedor;
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

	public String getTipoProveedor() {
		return TipoProveedor;
	}

	public void setTipoProveedor(String tipoProveedor) {
		TipoProveedor = tipoProveedor;
	}

	public String getPrecio() {
		return Precio;
	}

	public void setPrecio(String precio) {
		Precio = precio;
	}

	public boolean getDisponibilidad() {
		return Disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		Disponibilidad = disponibilidad;
	}

	public boolean getPoliticasDevolucion() {
		return PoliticasDevolucion;
	}

	public void setPoliticasDevolucion(boolean politicasDevolucion) {
		PoliticasDevolucion = politicasDevolucion;
	}

	public boolean getFormasPago() {
		return FormasPago;
	}

	public void setFormasPago(boolean formasPago) {
		FormasPago = formasPago;
	}

}