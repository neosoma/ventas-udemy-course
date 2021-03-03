package com.ventas.ventas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 
 * @author Óscar Hernández Santos
 *
 */
@Entity
@Table(name="cliente")
public class Cliente {
	
	// Las siguientes propiedades están relacionadas con la tabla Cliente en la BBDD
	@Id // Indicamos que será la clave en la tabla
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Hacemos que sea generado de forma automática, autoincremental)
	private Integer idCliente;
	
	@NotNull (message="El nombre no puede ser nulo.")
	@NotBlank(message="El nombre es obligatorio y no puede estar vacío.")
	@Size(min= 3, max= 70, message="Introduce un nombre que contenga al menos 3 caracteres.")
	@Column(name ="nombre", nullable = false, length = 70)
	private String nombre;

	@NotNull (message="El apellido no puede ser nulo.")
	@NotBlank(message="El apellido es obligatorio y no puede estar vacío.")
	@Size(min= 3, max= 150, message="Introduce un apellido que contenga al menos 3 caracteres.")
	@Column(name ="apellidos", nullable = false, length = 150)
	private String apellidos;
	
	@Size(max= 150, message="La dirección no puede superar los 150 caraceres.")
	@Column(name ="direccion", nullable = true, length = 150)
	private String direccion;
	
	@Size(min= 8, max= 10, message="El teléfono debe contener al menos 8 dígitos")
	@Column(name ="telefono", nullable = true, length = 10)
	private String telefono;
	
	@NotNull (message="El email no puede ser nulo.")
	@NotBlank(message="El email es obligatorio y no puede estar vacío.")
	@Size(min= 10, max= 70, message="Introduce un email válido.")
	@Email(message="El email enviado no es un formato válido.")
	@Column(nullable = false, length = 70) 
	private String email;

	/**
	 * @return the idCliente
	 */
	public Integer getIdCliente() {
		return idCliente;
	}

	/**
	 * @param idCliente the idCliente to set
	 */
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
}
