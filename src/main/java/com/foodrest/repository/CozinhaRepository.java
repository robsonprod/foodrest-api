package com.foodrest.repository;

import java.util.List;

import com.foodrest.domain.model.Cozinha;

public interface CozinhaRepository {

	public List<Cozinha> listar();
	
	public Cozinha salvar(Cozinha cozinha);
	
	public Cozinha buscarPorId(Long id);
	
	public void remover(Cozinha cozinha);
	
}
