/**
 * 
 */
package com.ventas.ventas.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ventas.ventas.model.Pedido;
import com.ventas.ventas.service.PedidoService;

/**
 * 
 * @author Óscar Hernández Santos
 *
 */
@RestController	// Indicamos que es controlador
@RequestMapping(value = "/api/pedidos") // Indicamos la raíz de nuestro servicio
public class PedidoController {


	@Autowired	// Conectamos con el servicio
	private PedidoService pedidoService;	
	
	// Obtener todos los usuarios - una lista de clientes
	@GetMapping 	// Así indicamos que cuando se realiza una petición del tipo GET a la URL de arriba, ejecutamos el siguiente método
	public ResponseEntity <List<Pedido>> findAll() {
		return ResponseEntity.ok(pedidoService.findAll()); //ok representa el valor 200. Añade este status (HTTPStatus) al HTTPEntity.
	}
	
	@GetMapping ("/{id}")
	public ResponseEntity<Pedido> findById(@PathVariable("id") Integer idPedido) {
		return pedidoService.findById(idPedido)
				.map(ResponseEntity::ok)		// Si encuentra el cliente
				.orElseGet(() -> ResponseEntity.notFound().build());		// Si no lo encuentra -- Utilizamos una función lambda
	}
	
	@PostMapping
	public ResponseEntity<Pedido> create (@Valid @RequestBody Pedido pedido ){
		return new ResponseEntity<>(pedidoService.create(pedido), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Pedido> update (@Valid @RequestBody Pedido pedido) {
		return pedidoService.findById(pedido.getIdPedido())
					.map(c -> ResponseEntity.ok(pedidoService.update(pedido)))
					.orElseGet(()-> ResponseEntity.notFound().build());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Pedido> delete(@PathVariable("id") Integer idPedido) {
		return pedidoService.findById(idPedido)
				.map(c -> {
					pedidoService.delete(idPedido);
					return ResponseEntity.ok(c);
				})
				.orElseGet(() -> ResponseEntity.notFound().build());
	}
	
}
