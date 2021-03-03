package com.ventas.ventas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	
	@Column(name ="nombre", nullable = false, length = 70)
	private String nombre;
	
	@Column(name ="apellidos", nullable = false, length = 150)
	private String apellidos;
	
	@Column(name ="direccion", nullable = true, length = 150)
	private String direccion;
	
	@Column(name ="telefono", nullable = true, length = 10)
	private String telefono;
	
	@Column(nullable = false, length = 70) // Ejemplo de cómo hacer que el nombre lo asigne de forma automática (omitiéndolo)
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
