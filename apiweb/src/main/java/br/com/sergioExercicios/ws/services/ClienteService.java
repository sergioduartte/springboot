package br.com.sergioExercicios.ws.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sergioExercicios.ws.model.Cliente;
import br.com.sergioExercicios.ws.repository.ClienteRepository;

@Service // essa notacao faz com que a classe possa ser componente do Spring
public class ClienteService {
	
	@Autowired
	ClienteRepository clienteRepository;

	// Negocios
	public Cliente cadastrar(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	public Collection<Cliente> buscarTodos() throws Exception {
		return clienteRepository.findAll();
	}

	public void excluir(Cliente cliente) {
		clienteRepository.delete(cliente);
	}

	public Cliente alterar(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	public Cliente buscaClientePorID(Integer id) {
		return clienteRepository.findOne(id);
	}

}
