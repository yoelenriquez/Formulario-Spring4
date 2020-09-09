package com.bolsadeideas.springboot.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.bolsadeideas.springboot.app.models.entity.Cliente;

@Repository
public class ClienteDaoImple implements IClienteDao {

	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	
	@Override
	public List<Cliente> findAll() {
		// TODO Auto-generated method stub
		return em.createQuery("from Cliente").getResultList();
	}

	@Override
	public void save(Cliente cliente) {
		if(cliente.getId() != null && cliente.getId() > 0) {
			//actualiza
			em.merge(cliente);
		} else {
			//inserta
			em.persist(cliente);
		}
	}

	@Override
	public Cliente findOne(Long id) {
		return em.find(Cliente.class, id);
	}

	@Override
	public void eliminar(Long id) {
		Cliente cliente = findOne(id);
		em.remove(cliente);
	}

}
