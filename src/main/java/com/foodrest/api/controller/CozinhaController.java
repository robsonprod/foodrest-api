package com.foodrest.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodrest.api.model.CozinhaXmlWrapper;
import com.foodrest.domain.model.Cozinha;
import com.foodrest.repository.CozinhaRepository;

@RestController
@RequestMapping("/cozinhas")
public class CozinhaController {

	@Autowired
	private CozinhaRepository cozinhaRepository;

	@GetMapping
	public List<Cozinha> listar() {
		return cozinhaRepository.listar();
	}

	@GetMapping(produces = MediaType.APPLICATION_XML_VALUE)
	public CozinhaXmlWrapper listarXml() {
		return new CozinhaXmlWrapper(cozinhaRepository.listar());
	}

	@GetMapping("/{cozinhaId}")
	public Cozinha buscar(@PathVariable Long cozinhaId) {
		return cozinhaRepository.buscarPorId(cozinhaId);
	}
}
