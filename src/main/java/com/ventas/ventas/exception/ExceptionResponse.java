/**
 * 
 */
package com.ventas.ventas.exception;

import java.util.Date;
import java.util.Map;

/**
 * @author Óscar Hernández Santos
 *
 */
public class ExceptionResponse {
	
	private Date timestamp;
	private String mensaje;
	private String detalles;
	private Map<String, String> erroresValidacion;
	
	/**
	 * @return the erroresValidacion
	 */
	public Map<String, String> getErroresValidacion() {
		return erroresValidacion;
	}

	/**
	 * @param erroresValidacion the erroresValidacion to set
	 */
	public void setErroresValidacion(Map<String, String> erroresValidacion) {
		this.erroresValidacion = erroresValidacion;
	}

	
	public ExceptionResponse() {}
	
	/**
	 * @param timestamp
	 * @param mensaje
	 * @param detalles
	 */
	public ExceptionResponse(Date timestamp, String mensaje, String detalles) {
		
		this.timestamp = timestamp;
		this.mensaje = mensaje;
		this.detalles = detalles;
	}

	/**
	 * @param timestamp
	 * @param mensaje
	 * @param detalles
	 * @param erroresValidacion
	 */
	public ExceptionResponse(Date timestamp, String mensaje, String detalles, Map<String, String> erroresValidacion) {
		super();
		this.timestamp = timestamp;
		this.mensaje = mensaje;
		this.detalles = detalles;
		this.erroresValidacion = erroresValidacion;
	}

	/**
	 * @return the timestamp
	 */
	public Date getTimestamp() {
		return timestamp;
	}
	
	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	/**
	 * @return the mensaje
	 */
	public String getMensaje() {
		return mensaje;
	}
	
	/**
	 * @param mensaje the mensaje to set
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	/**
	 * @return the detalles
	 */
	public String getDetalles() {
		return detalles;
	}
	
	/**
	 * @param detalles the detalles to set
	 */
	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}

}
