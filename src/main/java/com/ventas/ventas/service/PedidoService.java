/**
 * 
 */
package com.ventas.ventas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ventas.ventas.model.Pedido;
import com.ventas.ventas.repository.IPedidoRepository;

/**
 * @author Óscar Hernández Santos
 *
 */
@Service
public class PedidoService implements IPedidoService {
	@Autowired
	private IPedidoRepository pedidoRepo;
	
	@Override
	public List<Pedido> findAll() {
		return pedidoRepo.findAll();
	}

	@Override
	public Optional<Pedido> findById(Integer id) {
		return pedidoRepo.findById(id);
	}

	@Override
	public Pedido create(Pedido pedido) {
		return pedidoRepo.save(pedido);
	}

	@Override
	public Pedido update(Pedido pedido) {
		return pedidoRepo.save(pedido);
	}

	@Override
	public void delete(Integer id) {
		pedidoRepo.deleteById(id);
	}

}
