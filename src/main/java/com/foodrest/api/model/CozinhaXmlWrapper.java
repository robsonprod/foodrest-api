package com.foodrest.api.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.foodrest.domain.model.Cozinha;

import lombok.Data;
import lombok.NonNull;

@Data
public class CozinhaXmlWrapper {

	@JsonProperty()
	@NonNull
	private List<Cozinha> cozinhas;
}
