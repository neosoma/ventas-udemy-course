/**
 * 
 */
package com.ventas.ventas.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 
 * @author Óscar Hernández Santos
 *
 */
@Entity
@Table(name="pedido")
public class Pedido {
	
	@Id // Indicamos que será la clave en la tabla
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Hacemos que sea generado de forma automática, autoincremental)
	private Integer idPedido;
	

	@Column(name ="fechaRealizacion", nullable = false)
	private Date fechaRealizacion;
	
	@ManyToOne
	@JoinColumn(name = "idCliente")
	private Cliente  cliente;	// Conectamos entre objetos, e indicamos con qué propiedad del objeto conectamos
	
	//@ManyToOne
	//@JoinColumn(name = "idEstadoPedido")
	//private EstadoPedido estadoPedido; // 0 - Anulado, 1- Pendiente, 2- Enviado
	
	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}
	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	@Column(name="notas", nullable = true, length = 255) 
	private String notas;
	
	@Column(name="precioTotal", nullable = false)
	private float precioTotal;
	
	/**
	 * @return the idPedido
	 */
	public Integer getIdPedido() {
		return idPedido;
	}
	/**
	 * @param idPedido the idPedido to set
	 */
	public void setIdPedido(Integer idPedido) {
		this.idPedido = idPedido;
	}
	/**
	 * @return the fechaRealizacion
	 */
	public Date getFechaRealizacion() {
		return fechaRealizacion;
	}
	/**
	 * @param fechaRealizacion the fechaRealizacion to set
	 */
	public void setFechaRealizacion(Date fechaRealizacion) {
		this.fechaRealizacion = fechaRealizacion;
	}


	/**
	 * @return the notas
	 */
	public String getNotas() {
		return notas;
	}
	/**
	 * @param notas the notas to set
	 */
	public void setNotas(String notas) {
		this.notas = notas;
	}
	/**
	 * @return the precioTotal
	 */
	public float getPrecioTotal() {
		return precioTotal;
	}
	/**
	 * @param precioTotal the precioTotal to set
	 */
	public void setPrecioTotal(float precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	
}
