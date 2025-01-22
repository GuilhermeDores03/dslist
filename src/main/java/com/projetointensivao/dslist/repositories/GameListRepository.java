package com.projetointensivao.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetointensivao.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}
