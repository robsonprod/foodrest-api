package com.foodrest.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.foodrest.domain.model.Cozinha;
import com.foodrest.repository.CozinhaRepository;

@Component
public class CozinhaRepositoryImpl implements CozinhaRepository{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Cozinha> listar(){
		TypedQuery<Cozinha> query = em.createQuery("from cozinha", Cozinha.class);
		return query.getResultList();
	}
	
	@Transactional
	@Override
	public Cozinha salvar(Cozinha cozinha) {
		return em.merge(cozinha);
	}
	
	@Override
	public Cozinha buscarPorId(Long id) {
		return em.find(Cozinha.class, id);
	}
	
	@Override
	@Transactional
	public void remover(Cozinha cozinha) {
		cozinha = buscarPorId(cozinha.getId());
		em.remove(cozinha);
	}
	
}
