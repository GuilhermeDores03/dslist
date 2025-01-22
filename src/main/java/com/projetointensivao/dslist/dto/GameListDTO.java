package com.projetointensivao.dslist.dto;

import com.projetointensivao.dslist.entities.GameList;

public class GameListDTO {

	private Long id;
	private String name;
	
	//constructors
	public GameListDTO() {
	}

	public GameListDTO(GameList entity) {
		id = entity.getId();
		name = entity.getName();
	}

	//getters
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
