/**
 * 
 */
package com.ventas.ventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ventas.ventas.model.Pedido;

/**
 * @author Óscar Hernández Santos
 *
 */
public interface IPedidoRepository extends JpaRepository <Pedido, Integer>{

}
