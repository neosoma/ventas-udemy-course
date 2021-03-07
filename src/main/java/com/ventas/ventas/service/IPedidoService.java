/**
 * 
 */
package com.ventas.ventas.service;

import java.util.List;
import java.util.Optional;

import com.ventas.ventas.model.Pedido;


/**
 * @author Óscar Hernández Santos
 *
 */
public interface IPedidoService {

List<Pedido> findAll();
	
	Optional<Pedido> findById(Integer id);
	
	Pedido create(Pedido pedido);
	
	Pedido update(Pedido pedido);
	
	void delete(Integer id);
	
}
