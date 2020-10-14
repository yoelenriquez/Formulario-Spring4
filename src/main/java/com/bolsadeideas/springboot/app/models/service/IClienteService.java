package com.bolsadeideas.springboot.app.models.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.bolsadeideas.springboot.app.models.entity.Cliente;
import com.bolsadeideas.springboot.app.models.entity.Producto;

public interface IClienteService  {
	public List<Cliente> findAll();
	public Page<Cliente> findAll(Pageable page);
	public void save(Cliente cliente);
	public Cliente findOne(Long id);
	public void eliminar(Long id);
	public List<Producto> findByNombre(String term);
}
