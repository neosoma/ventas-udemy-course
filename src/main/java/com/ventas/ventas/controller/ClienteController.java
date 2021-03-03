/**
 * 
 */
package com.ventas.ventas.controller;

import java.util.List;

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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ventas.ventas.model.Cliente;
import com.ventas.ventas.service.ClienteService;

/**
 * @author Óscar Hernández Santos
 *
 */
@RestController	// Indicamos que es controlador
@RequestMapping(value = "/api/clientes") // Indicamos la raíz de nuestro servicio
public class ClienteController {

	@Autowired	// Conectamos con el servicio
	private ClienteService clienteService;	
	
	// Obtener todos los usuarios - una lista de clientes
	@GetMapping 	// Así indicamos que cuando se realiza una petición del tipo GET a la URL de arriba, ejecutamos el siguiente método
	public ResponseEntity <List<Cliente>> findAll() {
		return ResponseEntity.ok(clienteService.findAll()); //ok representa el valor 200. Añade este status (HTTPStatus) al HTTPEntity.
	}
	
	@GetMapping ("/{id}")
	public ResponseEntity<Cliente> findById(@PathVariable("id") Integer idCliente) {
		return clienteService.findById(idCliente)
				.map(ResponseEntity::ok)		// Si encuentra el cliente
				.orElseGet(() -> ResponseEntity.notFound().build());		// Si no lo encuentra -- Utilizamos una función lambda
	}
	
	@PostMapping
	public ResponseEntity<Cliente> create (@RequestBody Cliente cliente ){
		return new ResponseEntity<>(clienteService.create(cliente), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Cliente> update (@RequestBody Cliente cliente) {
		return clienteService.findById(cliente.getIdCliente())
					.map(c -> ResponseEntity.ok(clienteService.update(cliente)))
					.orElseGet(()-> ResponseEntity.notFound().build());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Cliente> delete(@PathVariable("id") Integer idCliente) {
		return clienteService.findById(idCliente)
				.map(c -> {
					clienteService.delete(idCliente);
					return ResponseEntity.ok(c);
				})
				.orElseGet(() -> ResponseEntity.notFound().build());
	}
	
}
